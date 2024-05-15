package Volume1.chapter03;

public class CarManager {

    public static void main(String[] args) {
        /*
            객체 / 인스턴스 : 클래스로부터 생성한 실체
            객체 / 인스턴스 생성 : new 생성자(...) 사용
         */

        // Car 객체를 생성해 Car 타입의 dogCar 변수에 할당함
        Car dogCar = new Car();

        dogCar.speedUp();
        dogCar.speedUp();
        System.out.println(dogCar.getCurrentSpeed());

        dogCar.breakDown();
        System.out.println(dogCar.getCurrentSpeed());
    }
}
