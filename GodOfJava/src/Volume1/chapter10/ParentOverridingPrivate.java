package Volume1.chapter10;

public class ParentOverridingPrivate {
    public ParentOverridingPrivate() {
        System.out.println("ParentOverridingPrivate.ParentOverridingPrivate");
    }

    private void printName() {
        System.out.println("ParentOverridingPrivate.printName");
    }
}
