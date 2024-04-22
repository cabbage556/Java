package chapter04.Stack;

public class Driver01 {
    public static void main(String[] args) {
        Penguin pororo = new Penguin();

        pororo.test();
        /*
        test() 메서드 실행 시 스택에 쌓인 스택 프레임의 모습
            Penguin.test()
            Driver.main()
        JVM은 지능적으로 객체 멤버 메서드를 스태틱 영역에 단 하나만 보유한다.
        코드에서 확인할 수 없지만 test() 메서드를 호출할 때 객체 자신을 나타내는 this 객체참조변수를 넘긴다.
        객체 멤버 메서드는 각 객체별로 바뀌지 않는다. 다만 객체 멤버 메서드가 사용하는 객체 멤버 속성의 값만 바뀔 뿐이다.
        따라서 객체를 생성할 때마다 모든 객체에서 동일한 객체 멤버 메서드를 힙 영역에 생성하는 것은 메모리 낭비이다.
            객체 멤버 속성만 힙 영역에 배치된 객체 내부에 배치됨
            객체 멤버 메서드는 스태틱 영역에 배치된 클래스 정보 내부에 배치됨
         */
    }
}

class Penguin {
    void test() {
        System.out.println("Test");
    }

    // JVM이 다음과 같이 test() 메서드를 변경한다고 생각할 수 있음
    static void test(Penguin me) {
        System.out.println("Test");
    }
}
