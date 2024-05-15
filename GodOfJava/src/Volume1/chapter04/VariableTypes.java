package Volume1.chapter04;

/*
    자바의 네 가지 변수
        1. 인스턴스 변수
            - 메서드 밖에, 클래스 내부에 선언한 변수
            - static 키워드를 붙이지 않음
            - 생명주기 : 객체 생성 시 생명 시작, 객체가 더이상 참조되지 않으면 객체와 함께 소멸함
        2. 클래스 변수
            - 메서드 밖에, 클래스 내부에 선언한 변수
            - static 키워드를 붙임
            - 생명주기 : 클래스 첫 호출 시 생명 시작, 자바 프로그램 종료 시 클래스와 함께 소멸함
        3. 매개 변수
            - 메서드에 넘겨주는 값을 받는 변수
            - 생명주기 : 메서드 호출 시 생명 시작, 메서드 종료 시 소멸함
        4. 지역 변수
            - 중괄호 내부에 선언한 변수
            - 메서드, if, else, for 등
            - 생명주기 : 지역 변수를 선언한 중괄호 내부에서만 유효함

    자바의 네 가지 변수는 모두 생명주기가 다름
    자바의 네 가지 변수는 모두 용도가 다름
    네 가지 변수의 특성을 이해해야 문제 없이 프로그램을 개발할 수 있음
 */

public class VariableTypes {
    int instanceVariable;       // 인스턴스 변수
    static int classVariable;   // 클래스 변수

    // 매개 변수 : int param
    public void method(int param) {
        int localVariable;  // 지역 변수
    }

    public void anotherMethod() {
        // 두 localVariable 지역 변수는 서로 다른 중괄호 안에 있으므로 서로 다른 변수임, 이름만 같을 뿐
        if (true) {
            int localVariable;
        }
        if (true) {
            int localVariable;
        }
    }

    public void anotherMethod2() {
        if (true) {
            int localVariable;
            if (true) {
                // 지역 변수가 유효한 스코프에서 동일한 이름을 갖는 지역 변수를 선언할 수 없음
                //      외부 if문에 선언한 localVariable 지역 변수가 내부 if문에서도 유효하므로 컴파일 에러 발생
                // int localVariable;
            }
        }
    }
}
