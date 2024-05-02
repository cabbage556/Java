package chapter07.expert001_01;

public class Car {
    Tire tire;

    public Car() {
        /*
            프로그래밍에서 의존 관계 표현 : new
                의존성은 new다.
                Car 클래스가 Tire 인터페이스 구현 클래스에 의존한다.
            의존이 일어나는 두 객체 사이에 직접 의존성을 해결하는 코드
         */
        tire = new KoreaTire();
    }

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }
}
