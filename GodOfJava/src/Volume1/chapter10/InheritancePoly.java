package Volume1.chapter10;

public class InheritancePoly {
    public static void main(String[] args) {
        InheritancePoly inheritance = new InheritancePoly();
        inheritance.callPrintNames();
    }

    public void callPrintNames() {
        // 부모 타입은 자식 인스턴스를 담을 수 있음
        Parent parent1 = new Parent();      // Parent 인스턴스
        Parent parent2 = new Child();       // Child 인스턴스
        Parent parent3 = new ChildOther();  // ChildOther 인스턴스

        // 다형성
        //      형 변환을 하더라도(부모 타입에 자식 인스턴스를 담더라도)
        //      실제 호출되는 것은 원래 객체에 있는 메서드가 호출된다는 것

        // 오버라이딩된 메서드가 있다면 오버라이딩된 메서드가 호출됨
        //      인스턴스의 실제 타입이 다르기 때문
        parent1.printName();  // Parent.printName 메서드가 호출됨
        parent2.printName();  // Parent.printName 메서드가 호출됨
        parent3.printName();  // ChildOther.printName 메서드가 호출됨
    }
}
