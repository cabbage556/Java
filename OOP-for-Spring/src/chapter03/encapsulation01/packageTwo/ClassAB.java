package chapter03.encapsulation01.packageTwo;

import chapter03.encapsulation01.packageOne.ClassA;

public class ClassAB extends ClassA {
    void runSomething() {
        // ClassA를 상속하고, 다른 패키지에 위치하므로 private, [default]를 제외한 객체 속성에 접근 가능
        // pri = 1;  this.pri = 1;
        // def = 1;  this.def = 1;
        pro = 1;  this.pro = 2;
        pub = 1;  this.pub = 2;

        // ClassA와 다른 패키지에 위치하므로 private, [default]를 제외한 정적 속성에 접근 가능
        // ClassA.priSt = 1;
        // ClassA.defSt = 1;
        ClassA.proSt = 1;
        ClassA.pubSt = 1;
    }

    static void runStaticThing() {
        ClassAB classAB = new ClassAB();

        // ClassA를 상속하고, 다른 패키지에 위치하므로 private, [default]를 제외한 객체 속성에 접근 가능
        // classAB.pri = 1;
        // classAB.def = 1;
        classAB.pro = 1;
        classAB.pub = 1;

        // ClassA와 다른 패키지에 위치하므로 private, [default]를 제외한 정적 속성에 접근 가능
        // ClassA.priSt = 1;
        // ClassA.defSt = 1;
        ClassA.proSt = 1;
        ClassA.pubSt = 1;
    }
}
