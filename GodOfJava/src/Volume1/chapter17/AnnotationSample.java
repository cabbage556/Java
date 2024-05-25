package Volume1.chapter17;

public class AnnotationSample {

    public static void main(String[] args) {
        AnnotationSample sample = new AnnotationSample();
        sample.useDeprecated();
    }

    public void useDeprecated() {
        AnnotationDeprecated deprecated = new AnnotationDeprecated();

        // deprecated 경고를 확인할 수 있음
        deprecated.noMoreUse();
    }

    /*
        @SupressWarnings 어노테이션
            - 컴파일러에게 경고를 띄우지 말라고 선언하는 어노테이션
     */

    @SuppressWarnings("deprecation")  // 이 경우 컴파일러에게 Deprecated 경고를 띄우지 말라고 지정함
    public void useDeprecated2() {
        AnnotationDeprecated deprecated = new AnnotationDeprecated();

        // deprecated 경고가 나오지 않음
        deprecated.noMoreUse();
    }
}
