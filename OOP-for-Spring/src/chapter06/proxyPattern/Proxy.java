package chapter06.proxyPattern;

/*
    프록시 패턴
        "제어 흐름을 조정하기 위한 목적으로 중간에 대리자(프록시)를 두는 패턴"
            프록시 패턴은 실제 서비스 메서드의 반환값에 전혀 가감하지 않음
            실제 서비스 메서드의 반환값에 가감하는 것을 목적으로 하지 않고 제어 흐름을 변경하거나 다른 로직을 수행하기 위해 사용함
        개방 폐쇄 원칙(OCP)과 의존 역전 원칙(DIP)이 적용된 디자인 패턴

    프록시 패턴의 중요 포인트
        1. 프록시는 실제 서비스와 동일한 이름의 메서드를 구현함(인터페이스를 사용함)
        2. 프록시는 실제 서비스에 대한 참조 변수를 가짐
        3. 프록시는 실제 서비스의 같은 이름을 가진 메서드를 호출하고 그 값을 클라이언트에게 그대로 돌려줌
        4. 프록시는 실제 서비스의 메서드 호출 전후에 별도의 로직을 수행할 수 있음
 */

// 프록시(대리자)
//      실제 서비스 객체와 동일한 인터페이스 구현
public class Proxy implements IService {
    IService service1;

    @Override
    public String runSomething() {
        System.out.println("호출에 대한 흐름 제어가 주목적. 반환 결과는 그대로 전달함");

        service1 = new Service();
        return service1.runSomething();
    }
}
