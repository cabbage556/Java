package Volume1.chapter14;

/*
    RuntimeException 상속 커스텀 예외 클래스
        - 런타임에 발생할 가능성이 높은 예외는 런타임 예외로 만드는 것이 권장됨
            - RuntimeException 클래스를 상속하는 커스텀 예외 클래스를 선언하는 것
        - try-catch를 사용하지 않아도 컴파일 에러가 발생하지 않음
            - RuntimeException 클래스는 checked exception이 아니고 unchecked exception이기 때문
            - checked exception인 Exception을 상속한다면 꼭 try-catch으로 예외 처리 필요
 */

// RuntimeException 클래스를 상속하는 MyRuntimeException 커스텀 예외 클래스 선언
//      예외를 던질 때 MyRuntimeException 객체를 사용할 수 있음
public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException() {
        super();
    }

    public MyRuntimeException(String message) {
        super(message);
    }
}
