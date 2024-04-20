package chapter04.staticBlock;

public class Driver03 {
    /*
        패키지와 클래스의 메모리 로딩 시점
            프로그램 시작 시 모든 패키지와 클래스가 스태틱 영역에 로딩되는 것이 아님
            패키지와 클래스가 처음으로 사용될 때 스태틱 영역에 로딩됨
        main() 메서드를 실행하면 System.out.println() 메서드보다 Animal 클래스의 static 블록이 더 늦게 실행됨
            Animal 클래스가 처음으로 사용될 때 Animal 클래스가 스태틱 영역에 로딩되기 때문
     */
    public static void main(String[] args) {
        System.out.println("main() 메서드 시작!");
        Animal pororo = new Animal();
    }
}
