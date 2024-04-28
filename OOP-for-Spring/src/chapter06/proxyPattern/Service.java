package chapter06.proxyPattern;

// 실제 서비스 객체
//      프록시와 동일한 인터페이스 구현
public class Service implements IService {
    @Override
    public String runSomething() {
        return "서비스";
    }
}
