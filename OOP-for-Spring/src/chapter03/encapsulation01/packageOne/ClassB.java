package chapter03.encapsulation01.packageOne;

public class ClassB {
    void runSomething() {
        ClassA classA = new ClassA();

        // ClassA 클래스와 같은 패키지에 위치하므로 private을 제외한 객체 속성에 접근 가능
        // classA.pri = 1;
        classA.def = 1;
        classA.pro = 1;
        classA.pub = 1;

        // ClassA 클래스와 같은 패키지에 위치하므로 private을 제외한 정적 속성에 접근 가능
        //      클래스명.정적속성 형태 접근 방법이 권장됨
        // ClassA.priSt = 1;
        ClassA.defSt = 1;
        ClassA.proSt = 1;
        ClassA.pubSt = 1;
    }

    static void runStaticThing() {
        ClassA classA = new ClassA();

        // ClassA 클래스와 같은 패키지에 위치하므로 private을 제외한 객체 속성에 접근 가능
        // classA.pri = 1;
        classA.def = 1;
        classA.pro = 1;
        classA.pub = 1;

        // ClassA 클래스와 같은 패키지에 위치하므로 private을 제외한 객체 속성에 접근 가능
        //      클래스명.정적속성 형태 접근 방법이 권장됨
        // ClassA.priSt = 1;
        ClassA.defSt = 1;
        ClassA.proSt = 1;
        ClassA.pubSt = 1;
    }
}
