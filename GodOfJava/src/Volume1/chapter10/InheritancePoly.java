package Volume1.chapter10;

public class InheritancePoly {
    public static void main(String[] args) {
        InheritancePoly inheritance = new InheritancePoly();
        inheritance.callPrintNames();
    }

    public void callPrintNames() {
        // 상위 타입에는 하위 인스턴스를 담을 수 있음
        Parent parent1 = new Parent();      // Parent 인스턴스
        Parent parent2 = new Child();       // Child 인스턴스
        Parent parent3 = new ChildOther();  // ChildOther 인스턴스

        // 다형성
        //      캐스팅하더라도(상위 타입에 하위 인스턴스를 담더라도)
        //      실제 호출되는 메서드는 원래 객체의 메서드가 호출된다는 것

        // 메서드를 오버라이딩했다면 오버라이딩된 메서드가 호출됨
        parent1.printName();  // Parent.printName 메서드가 호출됨
        parent2.printName();  // Parent.printName 메서드가 호출됨
        parent3.printName();  // ChildOther.printName 메서드가 호출됨
    }
}
