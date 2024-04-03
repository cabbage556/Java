package Volume1.chapter17;

public class AnnotationSample {

    public static void main(String[] args) {
        AnnotationSample sample = new AnnotationSample();
        sample.useDeprecated();
    }

    public void useDeprecated() {
        AnnotationDeprecated deprecated = new AnnotationDeprecated();

        // noMoreUse() 메서드가 deprecated 되었다는 경고 메시지를 확인할 수 있음
        deprecated.noMoreUse();
    }

    // @SupressWarings 어노테이션
    //      컴파일러에게 경고하지 말라고 지정함
    //      이 경우에는 컴파일러에게 Deprecated와 관련된 경고를 하지 말라고 지정함
    @SuppressWarnings("deprecation")
    public void useDeprecated2() {
        AnnotationDeprecated deprecated = new AnnotationDeprecated();

        // noMoreUse() 메서드에 @Deprecated 어노테이션이 선언되어 있지만 경고 메시지가 나오지 않음
        deprecated.noMoreUse();
    }
}
