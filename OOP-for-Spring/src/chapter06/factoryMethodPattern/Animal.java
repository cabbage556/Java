package chapter06.factoryMethodPattern;

public abstract class Animal {
    // 추상 팩터리 메서드
    //      하위 클래스에서 오버라이딩하여 객체를 반환하게 함
    abstract AnimalToy getToy();
}
