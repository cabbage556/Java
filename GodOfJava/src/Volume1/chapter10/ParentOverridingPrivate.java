package Volume1.chapter10;

public class ParentOverridingPrivate {
    public ParentOverridingPrivate() {
        System.out.println("ParentOverridingPrivate.ParentOverridingPrivate");
    }

    // 상위 클래스 메서드의 접근 제어자 : private
    private void printName() {
        System.out.println("ParentOverridingPrivate.printName");
    }
}
