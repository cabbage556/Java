package Volume1.chapter03;

public class CarManager {
    public static void main(String[] args) {
        // Car 인스턴스 생성
        Car dogCar = new Car();

        dogCar.speedUp();
        dogCar.speedUp();
        System.out.println(dogCar.getCurrentSpeed());

        dogCar.breakDown();
        System.out.println(dogCar.getCurrentSpeed());
    }
}