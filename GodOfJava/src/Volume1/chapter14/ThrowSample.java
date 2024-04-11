package Volume1.chapter14;

public class ThrowSample {

    /*
    throw, throws
        메서드에 'throws 예외클래스'를 선언하면 해당 메서드에서 선언한 예외가 발생했을 때 이 메서드를 호출한 메서드로 예외가 전달됨
        try 블록에서 예외를 직접 던지는 경우 throw 뒤에 예외 객체를 생성하거나 생성된 예외 객체를 명시함
        throw한 예외 클래스를 처리하는 catch 블록이 없거나, throws 선언에 예외 클래스가 포함되어 있지 않으면 컴파일 에러 발생
        catch 블록에서 예외를 throw할 때에도 메서드에 throws 선언에 예외 클래스가 선언되어 있어야 함
     */

    public static void main(String[] args) throws Exception {
        ThrowSample sample = new ThrowSample();
        // sample.throwException(13);

        // throws가 선언된 메서드를 호출할 때 처리하는 방법
        //      1. throws가 선언된 메서드를 호출할 때, 에러 처리를 위임 받으므로 try-catch로 예외를 처리함
        //          throws 선언은 하지 않음
        // try {
        //     sample.throwsException(13);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        //      2. throws가 선언된 메서드를 호출할 때 자신도 throws를 선언해 자신을 호출한 메서드에 예외 처리를 위임함
        //          좋은 방법은 아님
        sample.throwsException(13);
    }

    public void throwException(int number) {
        try {
            if (number > 12) {
                // 예외 직접 던지기
                //      throw + 예외 객체 생성
                throw new Exception("Number is over than 12");
            }
            System.out.println("number = " + number);
        }
        // catch 블록이 던져진 예외를 처리하거나 상속 관계에 있는 예외를 처리한다면 그 catch 블록에서 예외를 처리함
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    // throws
    //      throws를 선언한 메서드에서 발생한 예외를 메서드 밖으로 던질 수 있음
    //      이 메서드에서 내부적으로 try-catch로 예외를 처리하지 않으면 이 메서드를 호출한 메서드에게 예외 처리를 위임함
    public void throwsException(int number) throws Exception {
        if (number > 12) {
            // 예외 던짐
            //      try-catch로 예외를 처리하지 않으므로 이 메서드를 호출한 메서드에게 에러 처리 위임
            throw new Exception("Number is over 12");
        }
        System.out.println("number = " + number);
    }

    // 여러 예외를 던지는 경우
    public void multiThrows() throws NullPointerException, Exception {}
}
