package chapter03.encapsulation01.packageTwo;

import chapter03.encapsulation01.packageOne.ClassA;

public class ClassC {
    void runSomething() {
        ClassA classA = new ClassA();

        // ClassA를 상속하지 않고, 다른 패키지에 존재하므로 public 객체 속성만 접근 가능
        // classA.pri = 1;
        // classA.def = 1;
        // classA.pro = 1;
        classA.pub = 1;

        // ClassA와 다른 패키지에 존재하므로 public 정적 속성만 접근 가능
        // ClassA.priSt = 1;
        // ClassA.defSt = 1;
        // ClassA.proSt = 1;
        ClassA.pubSt = 1;
    }

    static void runStaticThing() {
        ClassA classA = new ClassA();

        // ClassA를 상속하지 않고, 다른 패키지에 존재하므로 public 객체 속성만 접근 가능
        // classA.pri = 1;
        // classA.def = 1;
        // classA.pro = 1;
        classA.pub = 1;

        // ClassA와 다른 패키지에 존재하므로 public 정적 속성만 접근 가능
        // ClassA.priSt = 1;
        // ClassA.defSt = 1;
        // ClassA.proSt = 1;
        ClassA.pubSt = 1;
    }
}
