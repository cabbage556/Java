package Volume1.chapter14;

/*
    자바에서는 예외를 직접 던질 수 있음(발생시킬 수 있음)
        - try 블록에서 예외를 직접 던짐 : throw + 예외 객체
        - try 블록에서 예외를 던지면 그 아래 문장들은 실행되지 않고, 예외와 관련된 catch 블록이 예외를 처리함
            - catch 블록이 처리하는 예외 중에서 throw한 예외와 같거나 상속 관계에 있는 예외가 있다면 그 catch 블록이 예외를 처리하게 됨

    메서드에서 발생한 예외를 메서드 밖으로 던질 수 있음
        - 예외를 던지는 메서드를 호출한 메서드로 예외를 던진다는 것을 의미함
        - 메서드 선언에 throws를 사용함

    throws
        - throws를 선언한 메서드에서 예외를 던지면 메서드 밖으로 예외를 던질 수 있음
        - 이 메서드에서 내부적으로 try-catch로 예외를 처리하지 않으면 이 메서드를 호출한 메서드에게 예외 처리를 위임함
        - 이 메서드를 호출한 메서드에서는 try-catch를 사용해 예외를 처리해야 함

    throws가 선언된 메서드를 호출하는 메서드에서 예외를 처리하는 방법
        1. 에러 처리를 위임 받으므로 try-catch를 사용해 예외를 처리함
            - 이 방법을 사용할 때 throws 선언은 하지 않음
            - 가장 적절한 방법
        2. 자신도 throws를 선언해 자신을 호출한 메서드에 예외 처리를 위임함
            - 이 방법을 사용할 때 try-catch는 사용하지 않음
            - 좋지 않은 방법

    throw, throws
        - 메서드에 'throws 예외클래스'를 선언하면 해당 메서드에서 선언한 예외가 발생했을 때 이 메서드를 호출한 메서드로 예외가 전달됨
            - 메서드에서 두 가지 이상의 예외를 던지는 경우 콤마로 구분해 예외 클래스를 나열함
        - try 블록에서 예외를 직접 던지는 경우 throw 뒤에 예외 객체를 생성하거나 생성된 예외 객체를 명시함
            - throw한 예외 클래스를 처리하는 catch 블록이 없으면 컴파일 에러 발생
            - throws 선언에 예외 클래스가 포함되어 있지 않으면 컴파일 에러 발생
        - catch 블록에서 예외를 직접 던지는 경우에도 메서드 선언의 throws 구문에 해당 예외 클래스가 선언되어 있어야 함
 */

public class ThrowSample {

    public static void main(String[] args) throws Exception {
        ThrowSample sample = new ThrowSample();

        // throws가 선언된 메서드를 호출하는 메서드에서 예외를 처리하는 방법1 : try-catch 사용 o + throws 선언 x
        // try {
        //     sample.throwsException(13);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // throws가 선언된 메서드를 호출하는 메서드에서 예외를 처리하는 방법2 : try-catch 사용 x + throws 선언 o
        sample.throwsException(13);
    }

    public void throwException(int number) {
        try {
            if (number > 12) {
                // 예외 직접 던지기 : throw + 예외 객체
                throw new Exception("Number is over than 12");
            }
            System.out.println("number = " + number);
        } catch (Exception e) {
            // try에서 던진 예외를 처리함
            e.printStackTrace();
        }
    }

    public void throwsException(int number) throws Exception {
        if (number > 12) {
            // 예외 직접 던지기 : 이 메서드에서 try-catch로 예외를 처리하지 않으므로 이 메서드를 호출한 main 메서드에게 에러 처리 위임
            throw new Exception("Number is over 12");
        }
        System.out.println("number = " + number);
    }

    // 여러 예외를 던지는 메서드의 throws 선언 : throws 뒤에 여러 예외 클래스를 나열함
    public void multiThrows() throws NullPointerException, Exception {}
}
