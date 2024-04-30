package chapter06.factoryMethodPattern;

public class Driver {
    public static void main(String[] args) {
        // 오버라이딩한 팩터리 메서드 보유 객체 생성
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        // 오버라이딩한 팩터리 메서드를 호출해 객체를 반환 받음
        AnimalToy boltBall = bolt.getToy();
        AnimalToy kittyTower = kitty.getToy();

        // 팩터리 메서드로부터 반환 받은 객체 사용
        boltBall.identify();
        kittyTower.identify();
    }
}
