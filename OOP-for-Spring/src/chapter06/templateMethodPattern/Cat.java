package chapter06.templateMethodPattern;

// 템플릿 메서드를 제공하는 클래스 상속
//      추상 메서드 반드시 오버라이딩
//      훅 메서드 선택적 오버라이딩
public class Cat extends Animal {
    // 추상 메서드 오버라이딩
    @Override
    void play() {
        System.out.println("야옹~");
    }

    // 훅 메서드 오버라이딩
    @Override
    void runSomething() {
        System.out.println("야옹~ 꼬리 살랑 살랑~");
    }
}
