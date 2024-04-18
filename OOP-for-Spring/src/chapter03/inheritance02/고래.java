package chapter03.inheritance02;

// 인터페이스: 구현클래스 is able to 인터페이스
//      구현클래스는 인터페이스할 수 있다.
public class 고래 extends 포유류 implements 헤엄칠수있는 {
    // 상속 관계: 고래는 포유류의 한 분류다.
    // 인터페이스 관계: 고래는 헤엄칠 수 있다.

    고래() {
        myClass = "고래";
    }

    @Override
    public void swim() {
        System.out.println(myClass + " 수영 중");
    }
}
