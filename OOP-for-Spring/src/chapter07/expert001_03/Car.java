package chapter07.expert001_03;

public class Car {
    Tire tire;

    public Tire getTire() {
        return tire;
    }

    // 속성을 통한 의존성 주입
    //      생성자 대신 tire 속성 setter 메서드를 통해 Tire 객체에 대한 의존성을 주입 받음
    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }
}
