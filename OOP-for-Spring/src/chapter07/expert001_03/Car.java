package chapter07.expert001_03;

public class Car {
    Tire tire;

    public Tire getTire() {
        return tire;
    }

    // 속성을 통한 의존성 주입
    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }
}
