package chapter05.dip.refac;

public class Car {

    // 추상화된 Tire 인터페이스에 의존하여 구체적인 클래스의 변화에 영향을 받지 않게 됨
    Tire tire;

    public Car(Tire tire) {
        this.tire = tire;
    }
}
