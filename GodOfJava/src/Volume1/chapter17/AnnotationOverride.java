package Volume1.chapter17;

/*
    @Override 어노테이션
        - 메서드가 상위 클래스의 메서드를 override했다는 것을 명시적으로 선언하는 어노테이션
        - 하위 클래스에서 override한 메서드를 쉽게 찾을 수 있음
        - 제대로 override했는지를 컴파일러를 통해 확인할 수 있음
 */

public class AnnotationOverride extends Parent {
    @Override
    public void printName() {
        System.out.println("AnnotationOverride.printName");
    }
}
