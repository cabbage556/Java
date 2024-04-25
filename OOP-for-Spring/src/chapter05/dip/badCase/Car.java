package chapter05.dip.badCase;

public class Car {

    // 자신보다 변하기 쉬운 구체적인 SnowTire 클래스에 의존함
    SnowTire snowTire;

    public Car(SnowTire snowTire) {
        this.snowTire = snowTire;
    }
}
