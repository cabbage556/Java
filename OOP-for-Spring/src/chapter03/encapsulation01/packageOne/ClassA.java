package chapter03.encapsulation01.packageOne;

public class ClassA {
    /*
    UML 접근 제어자 표기법
        - 표시: private
        ~ 표시: [default]
        # 표시: protected
        + 표시: public
     */

    /*
    정적 멤버를 '클래스명.정적멤버' 형식으로 접근해야 하는 이유
        1. 일관된 형식으로 정적 멤버에 접근하기 때문
        2. '클래스명.정적멤버' 형식이 '객체참조변수명.정적멤버' 형식보다 메모리 접근이 빠르기 때문
            클래스명.정적멤버: 스태틱 영역의 클래스를 바로 찾아감
            객체참조변수명.정적멤버: 스택 영역 스택 프레임 -> 힙 영역 객체 -> 스태틱 영역 클래스 과정을 따라 찾아감
     */

    // 객체 속성
    private int pri;
    int def;
    protected int pro;
    public int pub;

    // 정적 속성
    static private int priSt;
    static int defSt;
    static protected int proSt;
    static public int pubSt;

    void runSomething() {
        // 객체 메서드에서 모든 객체 속성에 접근 가능
        pri = 1;
        def = 1;
        pro = 1;
        pub = 1;

        // 객체 메서드에서 모든 정적 속성에 접근 가능
        priSt = 1;
        defSt = 1;
        proSt = 1;
        pubSt = 1;
    }

    static void runStaticThing() {
        // 정적 메서드에서 객체 속성에 접근 불가능
        // pri = 1;
        // def = 1;
        // pro = 1;
        // pub = 1;

        // 정적 메서드에서 객체 속성은 객체를 생성한 후 객체참조변수를 통해 접근해야 함
        ClassA classA = new ClassA();
        classA.pri = 1;
        classA.def = 1;
        classA.pro = 1;
        classA.pub = 1;

        // 정적 메서드에서 모든 정적 속성에 접근 가능
        //      클래스명.정적속성 형태 접근 방법이 권장됨
        ClassA.priSt = 1;
        ClassA.defSt = 1;
        ClassA.proSt = 1;
        ClassA.pubSt = 1;
    }
}
