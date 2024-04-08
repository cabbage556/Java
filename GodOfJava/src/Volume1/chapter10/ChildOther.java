package Volume1.chapter10;

public class ChildOther extends Parent {
    public ChildOther() {
        // super()
        System.out.println("ChildOther.ChildOther");
    }

    // 메서드 오버라이딩
    public void printName() {
        System.out.println("ChildOther.printName");
    }
}
