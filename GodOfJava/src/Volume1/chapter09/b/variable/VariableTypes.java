package Volume1.chapter09.b.variable;

public class VariableTypes {
    int instanceVariable;  // 인스턴스 변수
    static int classVariable;  // 클래스 변수

    public void method(
        int param  // 매개 변수
    ) {
        int localVariable;  // 지역 변수
    }

    public void anotherMethod() {
        if (true) {
            int localVariable;  // else 중괄호 내부의 지역 변수와 서로 다름
        } else {
            int localVariable;  // if 중괄호 내부의 지역 변수와 서로 다름
        }
    }

    public void anotherMethod2() {
        if (true) {
            int localVariable;
            if (true) {
                // int localVariable;  // 컴파일 에러: 동일한 이름을 갖는 지역 변수를 선언할 수 없음
            }
        }
    }
}
