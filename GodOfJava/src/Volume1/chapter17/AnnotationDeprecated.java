package Volume1.chapter17;

/*
    @Deprecated 어노테이션
        - 더 이상 사용하지 않는 클래스나 메서드에 선언하는 어노테이션
        - 이 어노테이션을 추가하면 "그 클래스나 메서드는 더 이상 사용하지 않는다"고 선언할 수 있음
        - 이 어노테이션이 선언된 클래스나 메서드를 사용하면 컴파일러는 deprecated 경고를 띄워줌
        - 이 어노테이션이 선언된 클래스나 메서드를 사용하면 경고만 나올뿐 컴파일 에러는 발생하지 않음
        - 하위 호환성을 위해 @Deprecated를 선언하는 것이 꼭 필요함
            - 계도 기간을 거쳐 알림을 준 후에 클래스나 메서드를 지우는 것이 바람직함
 */

public class AnnotationDeprecated {
    @Deprecated
    public void noMoreUse() {
        System.out.println("AnnotationDeprecated.noMoreUse");
    }
}
