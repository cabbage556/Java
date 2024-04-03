package Volume1.chapter17;

public class AnnotationOverride extends Parent {

    // 어노테이션
    //      클래스, 메서드, 변수 등을 선언할 때 @를 사용하는 것
    // 어노테이션을 사용하는 경우
    //      컴파일러에게 정보를 알려줄 때
    //      컴파일할 때의 설치(deployment)할 때의 작업을 지정할 때
    //      실행할 때 별도의 처리가 필요할 때
    // 일반적으로 사용 가능한 어노테이션 3가지(JDK 6까지)
    //      @Override
    //          이 어노테이션을 선언한 메서드가 부모 클래스의 메서드를 오버라이딩했다는 것을 명시적으로 선언하는 어노테이션
    //          컴파일러에게 이 메서드는 오버라이딩한 메서드이니 잘못 오버라이딩했다면 컴파일 시 알려달라고 지정하는 것
    //      @Deprecated
    //          더 이상 사용되지 않는 클래스나 메서드에 선언하는 어노테이션
    //          컴파일러에게 이 어노테이션을 적용한 클래스나 메서드가 더 이상 사용되지 않으니, 다른 곳에서 사용되고 있다면 경고해달라고 지정하는 것
    //      @SupressWarnings
    //          컴파일러에게 경고를 하지 말라고 지정하는 어노테이션

    // @Override 어노테이션
    //      부모 클래스의 메서드를 오버라이딩했음을 명시적으로 선언하여 오버라이딩한 메서드임을 쉽게 확인할 수 있음
    //      잘못 오버라이딩하면 에러가 발생하므로 오버라이딩이 잘못되었는지 다시 확인할 수 있음
    @Override
    public void printName() {
        System.out.println("AnnotationOverride.printName");
    }
}
