package Volume1.chapter10;

public class ChildOverridingPrivate extends ParentOverridingPrivate {
    public ChildOverridingPrivate() {
        // super()
        System.out.println("ChildOverridingPrivate.ChildOverridingPrivate");
    }

    public void printName() {
        System.out.println("ChildOverridingPrivate.printName");
    }
}
