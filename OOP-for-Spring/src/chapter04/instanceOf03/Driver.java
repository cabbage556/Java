package chapter04.instanceOf03;

public class Driver {
    public static void main(String[] args) {
        Flyable 박쥐객체 = new Bat();
        Flyable 참새객체 = new Sparrow();

        // instanceof 연산자는 인터페이스의 구현 관계에서도 동일하게 적용됨
        System.out.println(박쥐객체 instanceof Flyable);    // true
        System.out.println(박쥐객체 instanceof Bat);        // true

        System.out.println(참새객체 instanceof Flyable);    // true
        System.out.println(참새객체 instanceof Sparrow);    // true
    }
}

interface Flyable {}

class Bat implements Flyable {}

class Sparrow implements Flyable {}
