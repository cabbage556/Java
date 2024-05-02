package chapter07.expert001_02;

/*
    expert001_01 패키지의 구현 방식
        Car 클래스 생성자에서 구체적으로 KoreaTire를 생산할지, AmericaTire를 생산할지를 결정함
        유연성이 떨어지는 방식

    expert001_02 패키지의 구현 방식(의존성 주입 방식)
        Car 객체를 생산할 때 어떤 Tire 객체를 생산할지 Car 클래스에서 고민하지 않음
        Driver 클래스가 Car 객체를 생산할 때 어떤 Tire 객체를 생산해 장착할지를 고민함
    의존성 주입 방식의 장점
        Car 객체는 Tire 인터페이스를 구현한 객체가 들어오기만 하면 정상적으로 작동함
        확장성이 좋아짐
            Tire 인터페이스를 구현하는 어떤 클래스도 추가할 수 있음
            Car 클래스의 코드를 변경하지 않아도 됨
        제품화에 이득을 볼 수 있음
            Driver와 Tire 인터페이스를 구현하는 클래스를 각각 하나의 모듈로 만들면 새로운 Tire 인터페이스 구현 클래스가 추가되더라도
            Driver, 새로운 Tire 인터페이스 구현 클래스만 컴파일해서 재배포하면 됨
            다른 코드는 재컴파일 및 재배포할 필요가 없음
            실제 제품화 단계에서 더 많은 코드를 재배포할 필요가 없도록 구성해야 재컴파일과 재배포에 대한 부담을 덜 수 있음
            인터페이스를 구현했기에 얻는 이점이라고 볼 수 있음
 */
/*
    의존성 주입은 전략 패턴을 응용함
        전략 객체 : Tire 인터페이스를 구현한 클래스의 객체들
        컨텍스트 : Car 객체 (getTireBrand() 메서드)
        클라이언트 : Driver 클래스 (main() 메서드)
 */

public class Driver {
    // 클라이언트 : 전략 객체를 생성해 컨텍스트에 주입함
    public static void main(String[] args) {
        // Tire 객체 생성
        Tire tire = new KoreaTire();


        // Car 객체 생성
        //      생성자의 파라미터를 통해 Tire 객체 주입(의존성 주입)
        Car aCar = new Car(tire);
        System.out.println(aCar.getTireBrand());
    }
}
