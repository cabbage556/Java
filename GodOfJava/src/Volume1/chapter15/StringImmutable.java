package Volume1.chapter15;

public class StringImmutable {

    public static void main(String[] args) {
        StringImmutable sample = new StringImmutable();
        sample.stringBufferBuilder();
    }

    public void immutableString() {
        // String은 immutable 객체다.
        //      한 번 만들어지면 더 이상 그 값을 바꿀 수 없음
        //      String 객체는 변하지 않음
        //          문자열을 더하면 새로운 String 객체가 생성되고, 기존 String 객체는 버려짐
        //          String을 계속 더하는 작업을 한다면, 계속 쓰레기가 만들어짐
        //      String 클래스를 잘 사용해야 메모리를 효율적으로 사용할 수 있음
        String text = "Hello";
        text += " world";  // "Hello" 문자열을 갖는 객체가 쓰레기가 됨
    }

    public void stringBufferBuilder() {
        // StringBuffer, StringBuilder
        //      String 클래스의 단점을 보완하는 클래스
        //      두 클래스의 차이점
        //          Thread Safe 차이
        //              StringBuffer: Thread Safe함
        //              StringBuilder: Thread Safe하지 않음
        //          Thread Safe한 StringBuffer가 StringBuilder보다 안전함
        //          Thread Safe하지 않은 StringBuilder가 StringBuffer보다 빠름
        //      두 클래스의 공통점
        //          문자열을 다룸
        //          CharSequence 인터페이스를 구현함
        //          append() 메서드를 사용해 문자열을 더할 수 있음
        //      선택
        //          StringBuffer: 문자열 더하기를 처리하는 인스턴스 변수에 여러 스레드가 동시에 접근하는 경우
        //          StringBuilder: 메서드에서 문자열을 생성해 더하는 경우

        StringBuffer sbfr = new StringBuffer();
        sbfr.append("Hello")
                .append(" StringBuffer");
        System.out.println(sbfr.toString());

        StringBuilder sb = new StringBuilder();
        sb.append("Hello")
                .append(" StringBuilder");
        System.out.println(sb.toString());
    }
}
