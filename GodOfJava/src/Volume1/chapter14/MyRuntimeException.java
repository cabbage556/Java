package Volume1.chapter14;

// RuntimeException 상속 커스텀 예외 클래스
//      런타임에 발생할 가능성이 높은 예외는 런타임 예외로 만드는 것이 권장됨
//      try-catch 블록으로 이 예외를 처리하지 않아도 컴파일 에러가 발생하지 않음
//      checked exception인 Exception을 상속한다면 꼭 try-catch 블록으로 예외 처리 필요
public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException() {
        super();
    }

    public MyRuntimeException(String message) {
        super(message);
    }
}
