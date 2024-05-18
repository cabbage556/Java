package Volume1.chapter08;

public class StaticBlock {
    static int data = 1;  // 클래스 변수

    /*
        static 블록 : 클래스가 처음으로 참조될 때 단 한 번만 실행되어야 하는 코드를 넣는 블록
            클래스 초기화 시 꼭 실행되어야 하는 작업이 있을 경우 유용하게 사용할 수 있음
            개발자가 직접 호출하지 않음
                - 호출 시기에 따라 자동으로 호출되기 때문
            호출 시기
                - 클래스 첫 참조 시
                - 클래스를 처음으로 참조하자마자 한 번만 호출됨, 그 이후에는 호출되지 않음
            클래스 내부에 여러 개를 선언할 수 있음
                - 선언된 순서대로 차례로 호출됨
            내부에서 static 변수, static 메서드만 호출 가능
            선언 위치
                - 클래스 내부에 선언함
                - 메서드 내부에 선언할 수 없음
     */

    // 첫 번째 static 블록
    static {
        System.out.println("***** First Static Block *****");
        data = 3;
        System.out.println("data = " + data);
    }

    // 두 번째 static 블록
    static {
        System.out.println("***** Second Static Block *****");
        data = 5;
        System.out.println("data = " + data);
    }

    public StaticBlock() {
        System.out.println("StaticBlock Constructor");
    }

    public static int getData() {
        return data;
    }
}
