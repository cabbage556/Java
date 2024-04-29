package chapter06.templateMethodPattern;

public class Dog extends Animal {
    // 추상 메서드 오버라이딩
    @Override
    void play() {
        System.out.println("멍멍!");
    }

    // 훅 메서드 오버라이딩
    @Override
    void runSomething() {
        System.out.println("멍멍! 꼬리 살랑 살랑~");
    }
}
