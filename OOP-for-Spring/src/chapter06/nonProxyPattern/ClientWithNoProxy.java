package chapter06.nonProxyPattern;

public class ClientWithNoProxy {
    public static void main(String[] args) {
        // 프록시를 사용하지 않음
        //      서비스 객체의 메서드를 직접 호출함
        Service service = new Service();
        System.out.println(service.runSomething());
    }
}
