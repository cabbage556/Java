package Volume1.chapter10;

public class ChildOverriding extends ParentOverriding {
    public ChildOverriding() {
        // super()
        System.out.println("ChildOverriding.ChildOverriding");
    }

    // 메서드 오버라이딩
    //      부모 클래스의 메서드와 동일한 시그니처를 갖는 자식 클래스의 메서드가 존재할 때 성립됨
    //          시그니처: 메서드 이름, 매개 변수의 타입 및 개수
    //      오버라이딩된 메서드는 부모 클래스와 동일한 리턴 타입을 가져야 함
    //      오버라이딩된 메서드의 접근 제어자는 부모 클래스에 있는 메서드와 달라도 되지만, 접근 권한이 확장되는 경우에만 허용됨
    //          접근 권한이 축소될 경우 컴파일 에러가 발생함
    //              접근 권한이 큰 순서: public > protected > package-private > private
    public void printName() {
        System.out.println("ChildOverriding.printName");
    }
}
