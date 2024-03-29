package Volume1.chapter14;

public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }

    public void throwable() {
        int[] intArr = new int[5];
        try {
            intArr = null;
            System.out.println(intArr[5]);
        }
        // Throwable 클래스
        //      Exception, Error 클래스의 공통 부모 클래스
        //      두 예외 클래스의 성격은 다르지만, Throwable 클래스를 상속함으로써 동일한 이름의 메서드를 사용해 에러를 처리함
        catch (Throwable t) {
            // getMessage() 메서드: 예외 메시지 출력
            System.out.println(t.getMessage());

            // toString() 메서드: 어떤 예외가 발생했는지까지 출력
            System.out.println(t.toString());

            // printStackTrace() 메서드: 예외가 발생한 메서드들의 호출 관계까지 출력
            t.printStackTrace();
        }
    }
}
