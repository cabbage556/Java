package Volume1.chapter14;

public class ThrowSample {

    public static void main(String[] args) throws Exception {
        ThrowSample sample = new ThrowSample();
        // sample.throwException(13);

        // 1. throws가 선언된 메서드를 호출할 때 try-catch로 예외를 처리함
        //      throws 선언은 하지 않음
        // try {
        //     sample.throwsException(13);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // 2. throws가 선언된 메서드를 호출할 때 자신도 throws를 선언해 자신을 호출한 메서드에 예외 처리를 위임함
        //      좋은 방법은 아님
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

    // throws: 예외 처리를 자신을 호출한 메서드로 위임함
    public void throwsException(int number) throws Exception {
        if (number > 12) {
            throw new Exception("Number is over 12");
        }
        System.out.println("number = " + number);
    }

    // 여러 예외를 던지는 경우
    public void multiThrows() throws NullPointerException, Exception {}
}
