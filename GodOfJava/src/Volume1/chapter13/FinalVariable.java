package Volume1.chapter13;

/*
    final 변수 : 값을 변경할 수 없는 변수
        - 변하지 않는 값을 저장해야 하는 변수에 final 키워드를 붙여 값을 변경할 수 없는 변수로 선언함
    final 인스턴스 변수, final 클래스 변수
        - 값을 변경할 수 없으므로 선언과 동시에 초기화해야 함
        - 초기화 이후 값 변경 불가능
    final 매개 변수
        - 메서드 호출 시 초기화됨
        - 초기화 이후 값 변경 불가능
    final 지역 변수
        - 메서드 내부에서 초기화됨
        - 초기화 이후 값 변경 불가능
 */

public class FinalVariable {

    final int finalInstanceVariable = 1;
    final static int finalClassVariable = 2;

    public void method(final int finalParameter) {
        // final int finalLocalVariable = 2;
        final int finalLocalVariable;
        finalLocalVariable = 2;
    }
}
