package Volume1.chapter17;

public class AnnotationDeprecated {

    // @Deprecated 어노테이션
    //      이 메서드는 더 이상 사용되지 않음을 명시적으로 선언함
    //      이 메서드를 호출하는 곳에서 이 메서드는 deprecated 되었다는 경고 메시지를 확인할 수 있음
    //      이 메서드를 사용하더라도 컴파일 에러는 발생하지 않음
    @Deprecated
    public void noMoreUse() {
        System.out.println("AnnotationDeprecated.noMoreUse");
    }
}
