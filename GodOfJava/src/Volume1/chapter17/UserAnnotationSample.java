package Volume1.chapter17;

public class UserAnnotationSample {

    // 메서드에 @UserAnnotation 어노테이션 적용
    //      @UserAnnotation 어노테이션 내부에 선언한 메서드의 이름에 해당하는 값을 괄호 안에 넣어줘야 함
    //          number(), text() 메서드에 해당하는 값을 넣어주는 것
    //          number() 메서드의 경우 default 값을 지정하지 않았으므로 값을 지정해야 함
    //          text() 메서드의 경우 default 값을 지정했으므로 별도로 값을 지정하지 않아도 컴파일 시 문제가 없음
    @UserAnnotation(number = 0)
    public static void main(String[] args) {
        UserAnnotationSample sample = new UserAnnotationSample();
    }

    @UserAnnotation(number = 1)
    public void annotationSample1() {}

    @UserAnnotation(number = 2, text = "second")
    public void annotationSample2() {}

    @UserAnnotation(number = 3, text = "third")
    public void annotationSample3() {}

    public void noAnnotationSample() {}
}
