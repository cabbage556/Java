package Volume1.chapter10;

public class ChildOverriding extends ParentOverriding {
    public ChildOverriding() {
        // super()
        System.out.println("ChildOverriding.ChildOverriding");
    }

    // 메서드 오버라이딩
    //      부모 클래스의 메서드와 동일한 메서드를 자식 클래스에서 선언하는 것
    //      부모 클래스의 메서드와 동일한 시그니처를 갖는 자식 클래스의 메서드가 존재할 때 성립됨
    //          시그니처: 리턴 타입, 메서드 이름, 매개 변수의 타입 및 개수
    public void printName() {
        System.out.println("ChildOverriding.printName");
    }
}
