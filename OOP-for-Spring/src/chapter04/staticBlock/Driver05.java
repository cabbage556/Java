package chapter04.staticBlock;

public class Driver05 {
    public static void main(String[] args) {
        System.out.println("main() 메서드 시작!");

        /*
            Animal2 클래스의 정적 속성 age를 사용해도 static 블록이 실행됨
            클래스 정보는 클래스가 코드에서 처음 사용될 때 스태틱 영역에 로딩됨
            클래스가 코드에서 처음 사용되는 세 가지 경우
                클래스의 정적 속성 사용
                클래스의 정적 메서드 사용
                클래스의 인스턴스를 최초로 만들 때
            클래스 정보가 클래스가 처음 사용될 때 로딩되는 이유
                스태틱 영역도 메모리이므로 메모리 사용을 최대한 늦게 시작하고 최대한 빨리 반환하는 것이 정석
                자바는 프로그램이 종료되기 까지 스태틱 영역의 메모리를 반환할 수 없지만, 최대한 늦게 로딩하여 메모리 사용을 최대한 늦춤
         */
        System.out.println(Animal2.age);
    }
}

class Animal2 {
    static int age = 0;

    static {
        System.out.println("class Animal2 ready on!");
    }
}
