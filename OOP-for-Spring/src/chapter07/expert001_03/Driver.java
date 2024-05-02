package chapter07.expert001_03;

/*
    속성을 통한 의존성 주입
        생성자를 통한 의존성 주입은 의존성을 주입 받은 이후 의존성을 교체할 수 없음
        속성을 통한 의존성 주입 방식을 사용하면 의존성을 주입 받고 난 후에도 의존성을 교체할 수 있음

    생성자를 통한 의존성 주입 vs. 속성을 통한 의존성 주입
        생성자를 통한 의존성 주입이 더 선호됨
        프로그램에서 한번 주입된 의존성을 계속 사용하는 경우가 더 일반적이기 때문
 */

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
