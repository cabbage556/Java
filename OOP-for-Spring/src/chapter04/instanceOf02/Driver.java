package chapter04.instanceOf02;

public class Driver {
    public static void main(String[] args) {
        Animal 동물객체 = new Animal();
        Animal 조류객체 = new Bird();
        Animal 펭귄객체 = new Penguin();

        System.out.println(동물객체 instanceof Animal);     // true

        // instanceof 연산자는 객체참조변수의 타입이 아니라 실제 생성된 객체 타입에 의해 처리하므로
        // 조류객체 instanceof Bird 의 경우에도 true를 리턴함
        System.out.println(조류객체 instanceof Animal);     // true
        System.out.println(조류객체 instanceof Bird);       // true

        System.out.println(펭귄객체 instanceof Animal);     // true
        System.out.println(펭귄객체 instanceof Bird);       // true
        System.out.println(펭귄객체 instanceof Penguin);    // true

        System.out.println(펭귄객체 instanceof Object);     // true
    }
}

class Animal {}

class Bird extends Animal {}

class Penguin extends Bird {}
