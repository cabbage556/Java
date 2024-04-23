package chapter05.srp.refac;

// Person 클래스를 단일 책임 원칙을 적용해 리팩터링
//      Person 클래스를 Male 클래스로 분할함
//      Person 클래스로부터 공통점을 상속함
public class Male extends Person {
    String 군번;
}
