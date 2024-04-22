package chapter04.Super;

public class Driver {
    public static void main(String[] args) {
        Penguin pororo = new Penguin();
        pororo.method();
    }
}

class Animal {
    void method() {
        System.out.println("동물");
    }
}

class Bird extends Animal {
    void method() {
        // super
        //      바로 위 상위 클래스의 인스턴스를 지칭하는 키워드
        //      super 키워드로 바로 위 상위 클래스 인스턴스에 접근 가능
        super.method();
        System.out.println("조류");
    }
}

class Penguin extends Bird {
    void method() {
        super.method();
        System.out.println("펭귄");

        // super.super 형태로 상위 상위 클래스 인스턴스에는 접근할 수 없음
        // super.super.method();
    }
}
