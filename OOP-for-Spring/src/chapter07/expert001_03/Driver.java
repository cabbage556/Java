package chapter07.expert001_03;

public class Driver {
    public static void main(String[] args) {
        // Tire 객체 생성
        Tire tire = new KoreaTire();

        // Car 객체 생성
        //      tire 속성 setter 메서드를 통해 Tire 객체 주입(의존성 주입)
        Car aCar = new Car();
        aCar.setTire(tire);

        System.out.println(aCar.getTireBrand());
    }
}
