package chapter04.instanceOf01;

public class Driver {
    public static void main(String[] args) {
        Animal 동물객체 = new Animal();
        Bird 조류객체 = new Bird();
        Penguin 펭귄객체 = new Penguin();

        // instanceof 연산자
        //      생성된 객체가 특정 클래스의 인스턴스인지 물어보는 연산자
        //      boolean 결과값 리턴
        System.out.println(동물객체 instanceof Animal);     // true

        System.out.println(조류객체 instanceof Animal);     // true
        System.out.println(조류객체 instanceof Bird);       // true

        System.out.println(펭귄객체 instanceof Animal);     // true
        System.out.println(펭귄객체 instanceof Bird);       // true
        System.out.println(펭귄객체 instanceof Penguin);    // true

        System.out.println(펭귄객체 instanceof Object);     // true
    }
}

class Animal { }

class Bird extends Animal {}

class Penguin extends Bird {}