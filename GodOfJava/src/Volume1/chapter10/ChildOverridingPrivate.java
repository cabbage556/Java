package Volume1.chapter10;

public class ChildOverridingPrivate extends ParentOverridingPrivate {
    public ChildOverridingPrivate() {
        // super();
        System.out.println("ChildOverridingPrivate.ChildOverridingPrivate");
    }

    // 오버라이딩한 메서드의 접근 제어자 : public
    //      오버라이딩한 메서드의 접근 제어자는 상위 클래스 메서드의 접근 제어자와 달라도 됨
    //      하지만 접근 권한이 확장되는 경우에만 허용됨
    //      접근 권한이 축소될 경우 컴파일 에러가 발생함
    //      접근 권한이 큰 순서 : public > protected > package-private > private
    public void printName() {
        System.out.println("ChildOverridingPrivate.printName");
    }
}
