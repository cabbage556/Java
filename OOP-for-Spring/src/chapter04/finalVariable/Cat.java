package chapter04.finalVariable;

// final 변수
//      값을 변경할 수 없는 상수가 됨
public class Cat {
    // 정적 상수
    //      선언 시, static 블록에서 초기화 가능
    final static int 정적상수1 = 1;
    final static int 정적상수2;

    // 객체 상수
    //      선언 시, 생성자 블록, 인스턴스 블록에서 초기화 가능
    final int 객체상수1 = 1;
    final int 객체상수2;

    static {
        정적상수2 = 2;

        // 상수는 한 번 초기화되면 값 변경 불가능
        // 정적상수2 = 3;
    }

    Cat() {
        객체상수2 = 2;

        // 상수는 한 번 초기화되면 값 변경 불가능
        // 객체상수2 = 3;

        // 지역 상수
        //      선언 시, 최초 한 번만 초기화 가능
        final int 지역상수1 = 1;
        final int 지역상수2;
        지역상수2 = 2;

        // 상수는 한 번 초기화되면 값 변경 불가능
        // 지역상수2 = 3;
    }
}
