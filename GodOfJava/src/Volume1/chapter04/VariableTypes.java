package Volume1.chapter04;

public class VariableTypes {
    // 인스턴스 변수
    //      메서드 밖에, 클래스 내부에 선언한 변수
    //      static 키워드를 붙이지 않음
    // 생명주기
    //      객체 생성 시 생명 시작, 객체가 더 이상 참조되지 않으면 소멸
    int instanceVariable;

    // 클래스 변수
    //      메서드 밖에, 클래스 내부에 선언한 변수
    //      static 키워드를 붙임
    // 생명주기
    //      클래스 첫 호출 시 생명 시작, 자바 프로그램 종료 시 소멸
    static int classVariable;

    // 매개 변수
    //      메서드에 넘겨주는 값을 받는 변수
    // 생명주기
    //      메서드 호출 시 생명 시작, 메서드 종료 시 소멸
    public void method(int param) {
        // 지역 변수
        //      중괄호 내부에 선언한 변수
        //      메서드, if, else, for 등
        // 생명주기
        //      지역 변수를 선언한 중괄호 내부에서만 유효함
        int localVariable;
    }

    public void anotherMethod() {
        // if문과 else문에 존재하는 두 변수는 서로 다른 지역 변수
        if (true) {
            int localVariable;
        } else {
            int localVariable;
        }
    }

    public void anotherMethod2() {
        if (true) {
            int localVariable;
            if (true) {
                // 컴파일 에러 발생
                //      동일한 이름을 갖는 지역 변수를 선언할 수 없음
                //      첫 번째 if문에 선언한 localVariable 변수가 두 번째 if문에서도 유효함
                // int localVariable;
            }
        }
    }
}
