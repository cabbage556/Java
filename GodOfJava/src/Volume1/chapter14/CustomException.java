package Volume1.chapter14;

public class CustomException {

    public static void main(String[] args) {
        CustomException sample = new CustomException();

        // throws MyException이 선언된 메서드를 호출할 때 try-catch로 예외 처리
        try {
            sample.throwMyException(13);
        } catch (MyException myE) {
            myE.printStackTrace();
        }
    }

    // throws MyException 선언
    //      이 메서드는 MyException 예외를 던지는 메서드임을 선언함
    public void throwMyException(int number) throws MyException {
        // MyException 예외를 던지지만 try-catch 블록으로 예외를 처리하지 않음
        //      이 메서드를 호출한 메서드에게 예외 처리 위임
        if (number > 12) {
            throw new MyException("Number is over than 12");
        }
    }
}
