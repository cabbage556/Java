package Volume1.chapter13;

public class FinalVariable {
    // final 인스턴스 변수
    //      값을 변경할 수 없는 변수가 되므로 선언과 동시에 초기화해야 함
    final int instanceVariable = 1;

    // final 클래스 변수
    //      값을 변경할 수 없는 변수가 되므로 선언과 동시에 초기화해야 함
    final static int classVariable = 2;

    // final 매개 변수
    //      매개 변수는 호출 시 초기화됨
    //      값을 변경할 수 없음
    public void method(final int parameter) {
        // final 지역 변수
        //      값을 변경할 수 없음
        // final int localVariable = 2;
        // 또는
        final int localVariable;
        localVariable = 2;
    }
}
