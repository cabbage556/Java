package Volume1.chapter10;

public class ParentOverridingPrivate {
    public ParentOverridingPrivate() {
        System.out.println("ParentOverridingPrivate.ParentOverridingPrivate");
    }

    // 부모 메서드 접근 제어자: private
    private void printName() {
        System.out.println("ParentOverridingPrivate.printName");
    }
}
