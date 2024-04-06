package Volume1.chapter08;

public class StaticBlock {
    static int data = 1;  // 클래스 변수

    // static 블록
    //      클래스 초기화 시 꼭 수행되어야 하는 작업이 있을 경우 유용하게 사용할 수 있음
    //      호출 시기에 따라 자동으로 호출됨
    //          개발자가 호출하지 않음
    //      호출 시기: 클래스 첫 참조 시
    //          클래스를 처음으로 참조하자마자 한 번만 호출됨, 그 이후에는 호출되지 않음
    //      클래스 내부에 여러 개를 선언할 수 있음
    //          선언된 순서대로 차례로 호출됨
    //      블록 내부에서 static 변수, static 메서드만 호출 가능
    //      클래스 내부에 선언함
    //      메서드 내부에 선언할 수 없음
    static {
        System.out.println("***** First Static Block *****");
        data = 3;
        System.out.println("data = " + data);
    }

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
