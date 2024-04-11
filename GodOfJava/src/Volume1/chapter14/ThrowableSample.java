package Volume1.chapter14;

public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }

    /*
    Throwable 클래스
        Exception, Error 클래스의 공통 부모 클래스
            두 예외 클래스는 성격이 다르지만, Throwable 클래스를 상속해 동일한 이름의 메서드를 사용해 에러를 처리할 수 있음
        Exception 클래스의 부모 클래스이므로 Exception 대신 Throwable 클래스로 예외를 처리할 수도 있음
     */

    public void throwable() {
        int[] intArr = new int[5];
        try {
            intArr = null;
            System.out.println(intArr[5]);
        } catch (Throwable t) {
            // getMessage() 메서드
            //      예외 메세지를 리턴함
            System.out.println(t.getMessage());

            // toString() 메서드
            //      예외 메세지, 발생한 예외 클래스를 리턴함
            System.out.println(t.toString());

            // printStackTrace() 메서드
            //      예외 메세지, 발생한 예외 클래스, 예외가 발생한 메서드들의 호출 관계를 리턴함
            //      운영 환경이 아닌 개발 환경에서만 사용 권장
            t.printStackTrace();
        }
    }
}
