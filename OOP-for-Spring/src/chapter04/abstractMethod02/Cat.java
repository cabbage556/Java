package chapter04.abstractMethod02;

// 추상 클래스 Animal 상속
public class Cat extends Animal {

    // 추상 클래스를 상속하는 클래스는 추상 메서드를 반드시 구현해야 함(오버라이딩 강제)
    @Override
    void cry() {
        System.out.println("야옹");
    }
}
