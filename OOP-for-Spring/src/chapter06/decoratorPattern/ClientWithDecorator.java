package chapter06.decoratorPattern;

public class ClientWithDecorator {
    public static void main(String[] args) {
        // 데코레이터 생성
        IService decorator = new Decorator();

        // 데코레이터를 통해 실제 서비스 객체의 메서드 호출
        System.out.println(decorator.runSomething());
    }
}
