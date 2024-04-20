package chapter04.staticBlock;

public class Animal {
    /*
        static 블록
            클래스가 스태틱 영역에 배치될 때 실행되는 코드 블록
            static 속성과 메서드에만 접근할 수 있음
                static 블록 실행 시점에는 해당 클래스의 객체가 하나도 존재하지 않기 때문
     */
    static {
        System.out.println("class Animal ready on!");
    }
}
