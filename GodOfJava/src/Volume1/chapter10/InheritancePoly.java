package Volume1.chapter10;

public class InheritancePoly {
    public static void main(String[] args) {
        InheritancePoly inheritance = new InheritancePoly();
        inheritance.callPrintNames();
    }

    public void callPrintNames() {
        // 부모 타입은 자식 타입을 담을 수 있음
        Parent parent1 = new Parent();      // 실제 인스턴스: Parent
        Parent parent2 = new Child();       // 실제 인스턴스: Child
        Parent parent3 = new ChildOther();  // 실제 인스턴스: ChildOther

        // 오버라이딩된 메서드가 있다면 오버라이딩된 메서드가 호출됨
        parent1.printName();  // 실제 인스턴스의 메서드가 호출됨: Parent.printName
        parent2.printName();  // 실제 인스턴스의 메서드가 호출됨: Parent.printName
        parent3.printName();  // 실제 인스턴스의 메서드가 호출됨: ChildOther.printName
    }
}
