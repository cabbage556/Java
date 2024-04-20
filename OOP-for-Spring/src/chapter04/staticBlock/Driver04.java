package chapter04.staticBlock;

public class Driver04 {
    public static void main(String[] args) {
        System.out.println("main() 메서드 시작!");

        /*
            Animal 인스턴스를 여러 개 만들어도 static 블록은 한 번만 실행됨
                Animal 클래스가 처음으로 사용될 때 Animal 클래스가 스태틱 영역에 로딩됨
                이 로딩 시점에 static 블록이 실행되기 때문
         */
        Animal pororo = new Animal();
        Animal pikachu = new Animal();
    }
}
