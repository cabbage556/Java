package Volume1.chapter17;

/*
    메타 어노테이션 : 어노테이션을 직접 선언할 때 사용하는 어노테이션
    메타 어노테이션 4가지
        - @Target : 어노테이션을 어떤 것에 적용할지를 선언할 때 사용하는 메타 어노테이션
            - 적용 방법 : @Target() 괄호 안에 적용 대상을 지정함
            - 적용 대상 목록
                - CONSTRUCTOR : 생성자
                - FIELD : enum 상수를 포함한 필드
                - LOCAL_VARIABLE : 지역 변수
                - METHOD : 메서드
                - PACKAGE : 패키지
                - PARAMETER : 매개 변수
                - TYPE : 클래스, 인터페이스, enum 등
        - @Retention : 어노테이션 정보가 얼마나 오래 유지되는지를 선언할 때 사용하는 메타 어노테이션
            - 적용 방법 : @Retention() 괄호 안에 적용 대상을 지정함
            - 적용 대상 목록
                - SOURCE : 어노테이션 정보가 컴파일 시 사라짐
                - CLASS : 클래스 파일에 있는 어노테이션 정보가 컴파일러에 의해 참조 가능함, 가상 머신에서는 사라짐.
                - RUNTIME : 실행 시 어노테이션 정보가 가상 머신에 의해 참조 가능함
        - @Documented : 어노테이션에 대한 정보가 Javadocs(API) 문서에 포함됨을 선언할 때 사용하는 메타 어노테이션
        - @Inherited : 상위 클래스에 선언된 어노테이션이 모든 하위 클래스에도 적용됨을 선언할 때 사용하는 메타 어노테이션

    추가 어노테이션 @interface
        어노테이션을 직접 선언할 때 사용하는 어노테이션
 */

// java.lang.annotation 패키지 : 어노테이션 관련 클래스들이 선언되어 있는 패키지
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)             // 이 어노테이션은 메서드에 적용 가능함
@Retention(RetentionPolicy.RUNTIME)     // 이 어노테이션은 실행 시 참조 가능함
public @interface UserAnnotation {      // @UserAnnotation 어노테이션을 선언함

    // 어노테이션 안에 선언된 메서드
    //      어노테이션을 사용할 때 선언된 메서드의 리턴 타입에 해당하는 값을 지정할 수 있음
    public int number();
    public String text() default "This is first annotation";  // default 뒤에 있는 값이 어노테이션을 사용할 때의 기본값이 됨
}
