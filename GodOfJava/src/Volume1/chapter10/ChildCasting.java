package Volume1.chapter10;

public class ChildCasting extends ParentCasting {
    public ChildCasting() {
        // super();
    }

    public ChildCasting(String name) {
        // super();
    }

    // 오버라이딩
    public void printName() {
        System.out.println("ChildCasting.printName");
    }

    public void printAge() {
        System.out.println("ChildCasting.printAge");
    }
}
