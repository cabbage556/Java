package Volume1.chapter17;

public class AnnotationDeprecated {

    // @Deprecated 어노테이션
    //      클래스나 메서드가 더 이상 사용되지 않음을 명시적으로 선언하는 어노테이션
    //      이 어노테이션이 선언된 클래스나 메서드를 사용하는 곳에서 deprecated 되었다는 경고 메시지를 확인할 수 있음
    //      이 어노테이션이 선언된 클래스나 메서드를 사용해도 컴파일 에러는 발생하지 않음
    @Deprecated
    public void noMoreUse() {
        System.out.println("AnnotationDeprecated.noMoreUse");
    }
}
