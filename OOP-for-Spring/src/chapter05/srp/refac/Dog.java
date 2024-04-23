package chapter05.srp.refac;

// 단일 책임 원칙을 적용해 Dog 클래스 리팩터링
//      MaleDog, FemaleDog 클래스의 상위 클래스로 Dog 추상 클래스 선언
abstract class Dog {

    // 기존 pee() 메서드를 추상 메서드로 선언하여 하위 클래스에 맞게 구현 강제
    abstract void pee();
}
