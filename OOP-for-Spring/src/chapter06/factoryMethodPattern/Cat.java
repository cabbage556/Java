package chapter06.factoryMethodPattern;

/*
    팩터리 메서드 패턴
        "오버라이딩된 메서드가 객체를 반환하는 패턴"
        의존 역전 원칙(DIP)을 활용함
 */

public class Cat extends Animal {
    // 추상 팩터리 메서드 오버라이딩
    //      오버라이딩된 팩터리 메서드가 객체를 반환함
    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}
