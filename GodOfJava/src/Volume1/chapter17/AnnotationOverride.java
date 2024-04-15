package Volume1.chapter17;

public class AnnotationOverride extends Parent {

    // @Override 어노테이션
    //      부모 클래스의 메서드를 오버라이딩했음을 명시적으로 선언하는 어노테이션
    //      장점
    //          오버라이딩한 메서드임을 쉽게 확인할 수 있음
    //          잘못 오버라이딩하면 에러가 발생하므로 오버라이딩이 잘못되었는지 다시 확인할 수 있음
    @Override
    public void printName() {
        System.out.println("AnnotationOverride.printName");
    }
}
