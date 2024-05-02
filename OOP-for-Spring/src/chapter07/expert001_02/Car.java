package chapter07.expert001_02;

// 컨텍스트 : 클라이언트로부터 전략 객체를 주입 받아 전략 객체를 사용함
public class Car {
    Tire tire;

    // Car 클래스 생성자의 파라미터를 통해 Tire 객체 주입
    //      Tire에 대한 의존성을 Car 클래스 생성자의 아규먼트 주입으로 해결
    public Car(Tire tire) {
        this.tire = tire;
    }

    public String getTireBrand() {
        // 전략 객체의 getBrand() 메서드 사용
        return "장착된 타이어 : " + tire.getBrand();
    }
}
