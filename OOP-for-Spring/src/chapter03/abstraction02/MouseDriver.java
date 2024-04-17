package chapter03.abstraction02;

public class MouseDriver {

    /*
    main() 메서드가 정적 메서드인 이유
        정적 메서드는 객체 존재 여부와 상관 없이 호출할 수 있는 메서드
        JVM 구동 시 클래스는 스태틱 영역에 배치되고, 정적 메서드는 클래스 내부에 존재하기 때문에 객체 존재 여부와 상관 없이 호출 가능함
        T 메모리가 초기화되는 순간 객체는 아무것도 존재하지 않으므로 객체 멤버 메서드를 바로 실행할 수 없음
        main() 메서드는 프로그램의 시작점 역할을 담당하기 때문에 객체가 없어도 호출할 수 있어야 하므로 정적 메서드로 선언함
     */

    /*
    정적 메서드를 사용하는 경우
        main() 메서드의 논리를 함수로 분할하는 경우
        정적 속성에 대한 getter, setter로 사용하는 경우
        클래스 인스턴스를 생성하지 않고 사용 가능한 유틸리티성 메서드를 구성하는 경우
     */
    public static void main(String[] args) {
        /*
        지역 변수
            메서드가 실행되어 스택 프레임이 스택 영역에 배치되면, 스택 프레임 내부에 존재함
            초기화하지 않으면 쓰레기값이 할당되므로 사용 전에 초기화 필요
         */
        Mouse mickey = new Mouse();
        Mouse jerry = new Mouse();
        Mouse mightyMouse = new Mouse();

        /*
        정적 속성 접근 방법
            객체명.countOfTail
            클래스명.countOfTail
         */
        System.out.println(mickey.countOfTail);
        System.out.println(jerry.countOfTail);
        System.out.println(mightyMouse.countOfTail);
        System.out.println(Mouse.countOfTail);
    }
}
