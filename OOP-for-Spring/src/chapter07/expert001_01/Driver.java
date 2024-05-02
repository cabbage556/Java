package chapter07.expert001_01;

public class Driver {
    public static void main(String[] args) {
        /*
            Driver 클래스가 Car 클래스에 의존한다고 볼 수 있음
                Driver 클래스가 Car 클래스를 사용하고 있기 때문
            의존이 일어나는 두 객체 사이에 직접 의존성을 해결하는 코드
         */
        Car aCar = new Car();
        System.out.println(aCar.getTireBrand());
    }
}
