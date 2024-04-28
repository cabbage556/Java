package chapter06.proxyPattern;

public class ClientWithProxy {
    public static void main(String[] args) {
        // 프록시 생성
        IService proxy = new Proxy();

        // 프록시를 통해 실제 서비스 객체의 메서드 호출
        System.out.println(proxy.runSomething());;
    }
}
