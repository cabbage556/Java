package Volume1.chapter14;

/*
    Throwable 클래스
        - Exception, Error 클래스의 공통 상위 클래스
        - Exception, Error 클래스는 성격이 서로 다르지만, Throwable 클래스를 상속해 동일한 이름의 메서드를 사용해 에러를 처리할 수 있음
        - Exception 클래스의 상위 클래스이므로 Exception 대신 Throwable 클래스로 예외를 처리할 수도 있음

    Throwable 클래스에 선언되어 있고, Exception 클래스에서 오버라이딩한 메서드 중 가장 많이 사용되는 메서드
        - getMessage()
            - 예외 메세지를 String 타입으로 리턴함
            - 어떤 예외가 발생했는지 확인할 때 유용함
            - 예외 메세지를 활용해 별도의 예외 메세지를 사용자에게 보여줄 때 사용함
        - toString()
            - 예외 메세지를 String 타입으로 리턴함
            - 예외 클래스 이름까지 제공하므로 getMessage() 메서드보다 더 자세한 예외 메세지를 리턴함
        - printStackTrace()
            - 첫 줄에 예외 메세지를 출력하고, 둘째 줄부터 예외가 발생한 메서드들의 호출 관계를 출력함
            - 개발 환경에서만 사용 권장
            - 운영 시에 사용하면 로그양이 엄청나게 많아 지기 때문
 */

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
        } catch (Throwable t) {
            System.out.println(t.getMessage());
            System.out.println(t.toString());
            t.printStackTrace();
        }
    }
}
