package chapter06.decoratorPattern;

// 데코레이터와 실제 서비스 객체가 구현하는 인터페이스
//      데코레이터와 실제 서비스 객체가 같은 이름의 메서드를 구현하게 됨
public interface IService {
    String runSomething();
}
