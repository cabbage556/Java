package Volume1.chapter14;

public class CustomException {

    public static void main(String[] args) {
        CustomException sample = new CustomException();

        // try-catch로 예외 처리
        //      try 블록에서 throwMyException() 메서드 호출
        //      catch 블록에서 throwMyException() 메서드가 던지는 MyException 예외 처리
        try {
            sample.throwMyException(13);
        } catch (MyException myE) {
            myE.printStackTrace();
        }
    }

    // throws MyException : MyException 예외를 던지는 메서드임을 선언함
    public void throwMyException(int number) throws MyException {

        // 자신을 호출한 메서드에게 예외 처리 위임
        //      MyException 예외를 던지지만 try-catch로 예외를 처리하지 않기 때문
        if (number > 12) {
            throw new MyException("Number is over than 12");
        }
    }
}
