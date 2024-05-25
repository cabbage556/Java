package Volume1.chapter16;

/*
    자바에서는 클래스 안에 클래스가 들어갈 수 있음, 이런 클래스를 "Nested 클래스"라고 표현함
        - 주로 사용하는 곳 : 자바 기반의 UI 처리
            - 사용자 입력 또는 외부 이벤트를 처리할 때 가장 많이 사용됨

    Nested 클래스를 감싸고 있는 클래스를 컴파일하면 Nested 클래스도 자동으로 컴파일됨
        - 외부클래스$Nested클래스.class 클래스 파일이 별도로 생성됨

    Nested 클래스의 종류 : static 선언 여부에 따라 크게 두 가지로 구분됨
        - Static Nested 클래스 : static이 선언된 nested 클래스
        - 내부 클래스 : static이 선언되지 않은 nested 클래스
            - 내부 클래스는 다시 두 가지로 나뉨
                - 로컬/지역 내부 클래스(줄여서 "내부 클래스"로 표현함)
                - 익명 내부 클래스(줄여서 "익명 클래스"로 표현함)

    Nested 클래스 사용 이유
        - 한 곳에서만 사용하는 클래스를 논리적으로 묶어서 처리할 필요가 있을 때
            - static nested 클래스를 사용하는 이유
        - 캡슐화가 필요할 때(내부 구현을 감추고 싶을 때)
            - 클래스 A에 private 변수가 있고, 이 변수에 접근하는 클래스 B를 외부에 노출시키고 싶지 않을 때
            - 내부 클래스를 사용하는 이유
        - 코드 가독성과 유지보수성을 높이고 싶을 때
 */

/*
    static nested 클래스의 특징
        - static이 선언되어 있어 감싸고 있는 클래스의 어떤 변수에도 접근할 수 없음
 */

public class OuterOfStatic {

    // static nested 클래스
    static class StaticNested {
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
