package Volume1.chapter10;

/*
    메서드 오버라이딩
        - 상위 클래스의 메서드를 하위 클래스에서 재정의하는 것
        - 조건
            - 상위 클래스 메서드의 시그니처와 동일한 시그니처를 갖도록 재정의해야 함
                - 시그니처 : 리턴 타입, 메서드 이름, 매개 변수 타입과 갯수
                - 시그니처가 다르면 컴파일 에러가 발생함
            - 오버라이딩된 메서드의 접근 제어자는 상위 클래스 메서드의 접근 제어자와 달라도 됨
                - 이때 접근 권한이 확장되는 경우만 허용됨
                    - private -> package-private -> protected -> public
                - 접근 권한이 축소되면 컴파일 에러가 발생함

        - 상위 클래스 메서드를 오버라이딩하고, 하위 클래스의 인스턴스가 오버라이딩한 메서드를 호출하면 오버라이딩한 메서드가 호출됨
 */

public class ChildOverriding extends ParentOverriding {
    public ChildOverriding() {
        // super();
        System.out.println("ChildOverriding.ChildOverriding");
    }

    // printName() 메서드 오버라이딩
    public void printName() {
        System.out.println("ChildOverriding.printName");
    }
}
