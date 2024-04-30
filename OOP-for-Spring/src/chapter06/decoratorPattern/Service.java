package chapter06.decoratorPattern;

// 실제 서비스 객체
//      데코레이터와 동일한 인터페이스 구현
//      데코레이터와 같은 이름의 메서드를 구현하게 됨
public class Service implements IService {
    @Override
    public String runSomething() {
        return "서비스";
    }
}
