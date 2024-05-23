package Volume1.chapter14;

/*
    커스텀 예외 클래스
        - Exception을 처리하는 예외 클래스를 개발자가 만들 수 있음
            - 조건 : Throwable 클래스 또는 Throwable의 직계 하위 클래스를 상속해야 함
        - Throwable 클래스를 상속해도 되지만, Exception을 처리하는 예외 클래스라면 Exception 클래스를 상속하는 것이 좋음
        - 또한 try-catch 블록으로 반드시 처리해야 하는 예외라면 Exception 클래스를 상속함

    커스텀 예외 클래스를 정의하면 커스텀 예외 클래스의 객체를 던질 수 있음
 */

// Exception 클래스를 상속하는 MyException 커스텀 예외 클래스 선언
//      예외를 던질 때 MyException 객체를 사용할 수 있음
public class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
