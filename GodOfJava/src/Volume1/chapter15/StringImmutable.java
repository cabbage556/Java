package Volume1.chapter15;

/*
    String 객체는 immutable 객체다.
        - 한 번 만들어지면 더 이상 그 값을 바꿀 수 없다는 의미
    String 객체는 변하지 않는다.
        - 문자열을 더하면 새로운 String 객체가 생성되고, 기존 String 객체는 버려짐
        - String 객체를 계속 더한다면, 계속 쓰레기가 만들어짐
        - String 클래스를 잘 사용해야 메모리를 효율적으로 사용할 수 있음

    StringBuffer, StringBuilder
        - String 클래스의 단점을 보완하는 클래스
        - 두 클래스의 차이점 : Thread Safe 차이
            - StringBuffer : Thread Safe함
                - Thread Safe한 StringBuffer가 StringBuilder보다 안전함
            - StringBuilder : Thread Safe하지 않음
                - Thread Safe하지 않은 StringBuilder가 StringBuffer보다 빠름
        - 두 클래스의 공통점 : 문자열을 다룸
            - CharSequence 인터페이스를 구현함
            - append() 메서드를 사용해 문자열을 더할 수 있음
        - 둘 중 선택
            - StringBuffer : 문자열 더하기를 처리하는 인스턴스 변수에 여러 스레드가 동시에 접근하는 경우
            - StringBuilder : 메서드에서 문자열을 생성해 더하는 경우

    StringBuffer 클래스와 StringBuilder 클래스로 문자열 더하기
        - 이 두 클래스를 사용해 문자열을 더하면 새로운 문자열 객체를 생성하지 않음
        - append() 메서드를 사용해 문자열을 더할 수 있음
            - 매개 변수로 기본 자료형, 참조 자료형을 모두 포함함
        - 각 클래스의 append() 메서드는 각 클래스의 객체를 리턴하므로 메서드 체이닝이 가능함

    JDK 5부터 컴파일 시 문자열의 + 연산이 자동으로 StringBuilder로 변환됨
        - 문자열의 + 연산이 StringBuilder의 append() 메서드로 변환됨
        - for 루프 같은 반복 연산의 경우 자동 변환되지 않으므로 직접 변환해야 함

    String, StringBuilder, StringBuffer 클래스의 공통점
        - 모두 문자열을 다룸
        - CharSequence 인터페이스를 구현함
            - 세 클래스 중 하나로 매개 변수 타입을 지정한다면 CharSequence로 지정하는 것이 좋음(캐스팅)

    StringBuffer, StringBuilder 어느 걸 사용할 까?
        - StringBuilder : 일반적으로 하나의 메서드 내에서 문자열을 생성해 더할 경우
        - StringBuffer : 어떤 클래스에 문자열 더하기를 처리하는 인스턴스 변수가 선언되었고, 여러 스레드에서 이 변수에 동시 접근하는 일이 있을 경우
            - StringBuffer는 Thread Safe하기 때문
 */

public class StringImmutable {

    public static void main(String[] args) {
        StringImmutable sample = new StringImmutable();
        sample.stringBufferBuilder();
    }

    public void immutableString() {
        String text = "Hello";
        text += " world";       // "Hello" 문자열에 " world" 문자열을 더함 : "Hello" 문자열 객체가 쓰레기가 됨
    }

    public void stringBufferBuilder() {
        StringBuffer sbfr = new StringBuffer();
        sbfr.append("Hello")
                .append(" StringBuffer");       // 체이닝
        System.out.println(sbfr.toString());

        StringBuilder sb = new StringBuilder();
        sb.append("Hello")
                .append(" StringBuilder");      // 체이닝
        System.out.println(sb.toString());
    }
}
