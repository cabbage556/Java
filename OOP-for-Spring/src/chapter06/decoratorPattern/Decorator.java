package chapter06.decoratorPattern;

/*
    데코레이터 패턴
        "메서드 호출의 반환값에 변화를 주기 위해 중간에 데코레이터를 두는 패턴"
            실제 서비스의 반환값을 장식하는 패턴
            반환값을 장식한다는 점을 제외하면 프록시 패턴과 동일함
        개방 폐쇄 원칙(OCP), 의존 역전 원칙(DIP)이 적용된 디자인 패턴
            프록시 패턴과 동일한 구조를 갖는 패턴이기 때문

    데코레이터 패턴의 중요 포인트
        1. 데코레이터는 실제 서비스와 같은 이름의 메서드를 구현함(인터페이스를 사용함)
        2. 데코레이터는 실제 서비스에 대한 참조 변수를 가짐
        3. 데코레이터는 실제 서비스와 같은 이름을 갖는 메서드를 호출하고, 그 반환값에 장식을 더해 클라이언트에게 돌려줌
        4. 데코레이터는 실제 서비스의 메서드 호출 전후에 별도의 로직을 수행할 수도 있음
 */

// 데코레이터
//      실제 서비스 객체와 동일한 인터페이스 구현
public class Decorator implements IService {
    IService service;

    @Override
    public String runSomething() {
        System.out.println("호출에 대한 장식이 주목적, 클라이언트에게 반환 결과에 장식을 더하여 전달");

        service = new Service();
        return "정말 " + service.runSomething();
    }
}
