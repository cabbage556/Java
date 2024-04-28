package chapter06.proxyPattern;

/*
    프록시 패턴에서 인터페이스를 사용하는 이유
        프록시가 실제 서비스 객체가 가진 메서드와 같은 이름의 메서드를 사용하기 위해
 */

// 프록시와 실제 서비스 객체가 구현하는 인터페이스
public interface IService {
    String runSomething();
}
