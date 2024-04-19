package chapter03.encapsulation01.packageOne;

public class ClassAA extends ClassA {
    void runSomething() {
        // ClassA를 상속하고, 같은 패키지에 위치하므로 private을 제외한 객체 속성에 접근 가능
        // pri = 1;  this.pri = 2;
        def = 1;  this.def = 2;
        pro = 1;  this.pro = 2;
        pub = 1;  this.pub = 2;

        // ClassA와 같은 패키지에 위치하므로 private을 제외한 정적 속성에 접근 가능
        //      클래스명.정적속성 형태 접근 방법이 권장됨
        // ClassA.priSt = 1;
        ClassA.defSt = 1;
        ClassA.proSt = 1;
        ClassA.pubSt = 1;
    }

    static void runStaticThing() {
        ClassAA classAA = new ClassAA();

        // ClassA와 같은 패키지에 위치하므로 private을 제외한 객체 속성에 접근 가능
        // classAA.pri = 1;
        classAA.def = 1;
        classAA.pro = 1;
        classAA.pub = 1;

        // ClassA와 같은 패키지에 위치하므로 private을 제외한 정적 속성에 접근 가능
        // ClassA.priSt = 1;
        ClassA.defSt = 1;
        ClassA.proSt = 1;
        ClassA.pubSt = 1;
    }
}
