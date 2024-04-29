package chapter06.factoryMethodPattern;

public class Driver {
    public static void main(String[] args) {
        // 팩터리 메서드 보유 객체 생성
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        // 팩터리 메서드 보유 객체로부터 팩터리 메서드를 호출해 객체를 반환 받음
        AnimalToy boltBall = bolt.getToy();
        AnimalToy kittyTower = kitty.getToy();

        // 팩터리 메서드가 반환한 객체 사용
        boltBall.identify();
        kittyTower.identify();
    }
}
