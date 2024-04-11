package Volume1.chapter14;

public class StrategySample {

    public static void main(String[] args) {
        StrategySample sample = new StrategySample();
        sample.methodCaller();
    }

    public void methodCaller() {
        // RuntimeException을 상속한 커스텀 예외를 던지는 메서드를 호출할 때
        // try-catch 블록으로 묶지 않아도 컴파일 에러가 발생하지 않음
        //      RuntimeException은 checked exception이 아니기 때문
        // methodCallee();

        // 하지만 안전 장치로서 try-catch 블록을 사용하는 것이 좋음
        try {
            methodCallee();
        } catch (MyRuntimeException myRuntimeException) {

            // catch 블록 내부에서 예외 처리는 반드시 해야 함
            //      예를 들어 관련 로그를 남겨 예외 원인을 파악할 수 있음

            System.out.println(myRuntimeException.getMessage());
        }
    }

    public void methodCallee() throws MyRuntimeException {
        // RuntimeException을 상속한 커스텀 예외를 던짐
        throw new MyRuntimeException("런타임 예외 발생");
    }
}
