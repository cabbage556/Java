package Volume1.chapter14;

// Exception을 처리하는 예외 클래스를 개발자가 만들 수 있음
//      Throwable 클래스 또는 Throwable 자식 클래스를 상속해야 함
//      Exception을 처리하는 예외 클래스라면 Exception 클래스를 상속하는 것이 좋음
public class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
