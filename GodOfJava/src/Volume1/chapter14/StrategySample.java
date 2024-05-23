package Volume1.chapter14;

/*
    RuntimeException 클래스를 상속한 커스텀 예외 클래스의 객체를 던지는 메서드를 호출하는 경우
        - try-catch를 사용하지 않아도 컴파일 에러가 발생하지 않음
            - RuntimeException 클래스는 checked exception이 아니고 unchecked exception이기 때문
        - 하지만 안전장치로 try-catch를 사용하는 것이 권장됨

    catch 블록에서 아무런 예외 처리도 하지 않는다면 문제가 발생했을 때 어디서 어떤 문제가 발생했는지 파악하기가 매우 어려움
        - catch 블록에서 어떻게 예외를 처리할지에 대해 명시적으로 표준을 잡아둘 필요가 있음
        - 예를 들어 catch 블록에서 로그를 남기고 예외를 throw 해야 문제 발생 원인을 정확히 찾을 수 있음
 */

public class StrategySample {

    public static void main(String[] args) {
        StrategySample sample = new StrategySample();
        sample.methodCaller();
        sample.methodCaller2();
    }

    public void methodCaller() {
        // RuntimeException 클래스를 상속한 커스텀 예외 객체를 던지는 메서드이므로 try-catch를 사용하지 않아도 됨
        methodCallee();

    }

    public void methodCaller2() {
        // 안전장치 : try-catch 사용
        try {
            methodCallee();
        } catch (MyRuntimeException myRuntimeException) {
            // catch 블록 내부에서 예외 처리는 반드시 해야 함
            //      예를 들어 관련 로그를 남겨 예외 원인을 파악할 수 있음
            System.out.println(myRuntimeException.getMessage());
        }
    }

    public void methodCallee() throws MyRuntimeException {
        throw new MyRuntimeException("런타임 예외 발생");
    }
}
