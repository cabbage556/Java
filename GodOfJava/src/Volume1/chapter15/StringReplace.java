package Volume1.chapter15;

/*
    문자열을 바꾸는 메서드
    문자열의 공백을 없애는 메서드
        - trim() : 문자열의 앞뒤 공백을 제거하는 메서드
            - 문자열의 앞뒤 공백을 일일이 찾아 제거하지 않아도 되므로 공백 제거 시 유용함
            - trim() 메서드를 사용하면 문자열이 공백으로만 이루어졌는지, 아닌지 확인하기가 편리함

    문자열의 내용을 교체하는 메서드
        - replace(char oldChar, char newChar) : 문자열에서 oldChar를 newChar로 대치해 새로운 문자열을 리턴함
        - replace(CharSequence target, CharSequence replacement) : 문자열에서 target과 같은 값을 replacement로 대치해 새로운 문자열을 리턴함
        - replaceAll(String regex, String replacement) : 문자열에서 regex에 포함되는 모든 값을 replacement로 대치해 새로운 문자열을 리턴함
        - replaceFirst(String regex, String replacement) : 문자열에서 regex에 포함되는 첫 번째 값을 replacement로 대치해 새로운 문자열을 리턴함

    특정 형식에 맞춰 문자열을 치환하는 메서드
        - format(String format, Object... args) : format 문자열 중 변환해야 하는 부분을 args로 변환함
        - format(Locale l, String format, Object args) : for 문자열 중 변환해야 하는 부분을 args로 변환함, 단 매개 변수 l에 전달한 지역에 맞추어 변환함
        - String 클래스의 static 메서드
        - 정해진 기준에 맞춘 문자열이 있으면, 그 기준에 해당하는 내용을 매개 변수에 전달한 값으로 대치하는 메서드
            - %s : String 타입
            - %d : 정수 타입
            - %f : 소수 타입
            - java.util.Formatter 클래스에서 format 사용 방법 확인 가능
        - Locale은 지역적으로 다른 표현 형식을 제공하기 위한 것
            - Locale을 지정하지 않으면 보통 기본적으로 자바 프로그램이 실행되는 OS의 지역 정보가 기준이 됨
        _ 대치하는 문자열 개수보다 매개 변수의 개수가 부족한 경우
            - MissingFormatArgumentException 예외 발생

    대소문자를 바꾸는 메서드
        - toLowerCase() : 문자열을 소문자로 변경해 새로운 문자열을 리턴함
        - toLowerCase(Locale locale) : 지역 정보에 맞춰 문자열을 소문자로 변경해 새로운 문자열을 리턴함
        - toUpperCase() : 문자열을 대문자롭 변경해 새로운 문자열을 리턴함
        - toUpperCase(Locale locale) : 지역 정보에 맞춰 문자열을 대문자로 변경해 새로운 문자열을 리턴함

    기본 자료형을 문자열로 변환하는 메서드
        - valueOf() : 기본 자료형의 값을 문자열로 변환해 리턴함
            - String 클래스의 static 메서드

    절대로 사용하면 안 되는 메서드
        - intern()
            - String 클래스의 메서드 중에서 초보자들이 절대 사용해서는 안 되는 메서드
            - 자바로 구현되어 있지 않고 C로 구현되어 있는 native 메서드 중 하나
            - 시스템의 심각한 성능 저하를 발생시킬 수 있음
 */

public class StringReplace {

    public static void main(String[] args) {
        StringReplace sample = new StringReplace();
        sample.checkTrim();
        sample.checkTrim2();
        sample.checkReplace();
        sample.checkFormat();
        sample.checkToLowerCase();
        sample.checkToUpperCase();
        sample.checkValueOf();
        sample.checkValueOf2();
        sample.internCheck();
    }

    public void checkTrim() {
        System.out.println("StringReplace.checkTrim");

        String[] strs = {" a", "b ", "   c", "d      ", "e   f", "   "};
        for (String str : strs) {
            System.out.println("[" + str + "]");
            System.out.println("[" + str.trim() + "]");
        }
    }

    public void checkTrim2() {
        System.out.println("StringReplace.checkTrim2");

        String text = " a ";

        // 작업하려는 문자열이 공백만으로 이뤄졌는지 아닌지 판단함 : null 체크 + trim() 활용
        if (text != null && text.trim().length() > 0) {
            System.out.println("OK");  // 문자열에 공백을 제외한 char 값이 하나라도 존재하면 실행됨
        }
    }

    public void checkReplace() {
        System.out.println("StringReplace.checkReplace");

        String text = "The String class represents character strings";
        System.out.println(text.replace('s', 'z'));
        System.out.println(text);       // 기존 문자열이 변경되지 않음
        System.out.println(text.replace("tring", "trike"));
        System.out.println(text.replaceAll(" ", "|"));
        System.out.println(text.replaceFirst(" ", "|"));
        System.out.println(text);       // 기존 문자열이 변경되지 않음
    }

    public void checkFormat() {
        System.out.println("StringReplace.checkFormat");

        String text = "제 이름은 %s입니다. 지금까지 %d권의 책을 썼고, "
                + "하루에 %f%%의 시간을 책을 쓰는 데 할애하고 있습니다.";

        // %s : "이상민", %d : 7, %f : 10.5
        String realText = String.format(text, "이상민", 7, 10.5);
        System.out.println(realText);

        // MissingFormatArgumentException 예외 발생
        // realText = String.format(text, "이상민", 7);
        // System.out.println(realText);
    }

    public void checkToLowerCase() {
        System.out.println("StringReplace.checkToLowerCase");

        String text = "JAVA STRING TOLOWERCASE()";
        System.out.println("text = " + text);
        System.out.println("text.toString() = " + text.toLowerCase());
        System.out.println("text = " + text);  // 기존 문자열이 변경되지 않음
    }

    public void checkToUpperCase() {
        System.out.println("StringReplace.checkToUpperCase");

        String text = "java string touppercase()";
        System.out.println("text = " + text);
        System.out.println("text.toString() = " + text.toUpperCase());
        System.out.println("text = " + text);  // 기존 문자열이 변경되지 않음
    }

    public void checkValueOf() {
        System.out.println("StringReplace.checkValueOf");

        byte b = 1;
        String byte1 = String.valueOf(b);
        String byte2 = b + "";              // valueOf() 메서드 대신 빈 문자열을 더해 String으로 변환할 수도 있음

        System.out.println(byte1);
        System.out.println(byte2);
    }

    public void checkValueOf2() {
        Object obj = null;

        // null인 객체에 toString() 메서드를 호출하면 NullPointerException 예외 발생
        // System.out.println(obj.toString());

        // 이런 경우를 방지하기 위해 객체 출력 시 valueOf() 메서드를 사용하는 것이 좋음
        //      valueOf() 메서드는 null인 객체의 경우 "null" 문자열을 리턴함
        System.out.println(String.valueOf(obj));
    }

    public void internCheck() {
        String text1 = "Java Basic";
        String text2 = "Java Basic";
        String text3 = new String("Java Basic");

        // intern()
        //      new String(String)으로 생성한 String 객체일지라도 intern() 메서드를 호출하면,
        //      문자열 풀에 해당하는 문자열이 있다면 문자열 풀에 있는 문자열을 참조하는 String 객체를 리턴함
        //      만약 문자열 풀에 문자열이 존재하지 않는다면 문자열 풀에 문자열을 추가함
        //      intern() 메서드를 수행한 뒤 == 연산자로 객체가 동일한지 비교할 수 있게 됨
        //          문자열 풀에 있는 동일한 문자열을 참조하기 때문
        text3 = text3.intern();
        System.out.println(text1 == text2);
        System.out.println(text1 == text3);  // true
        System.out.println(text1.equals(text3));

        // intern() 메서드는 사용하지 말자.
        //      문자열 풀에 새로운 문자열을 계속 추가하면, 저장 영역에 대해 별도로 메모리를 청소하는 단계를 거치게 됨
        //      결과적으로 시스템의 성능에 악영향을 주게 됨
    }
}
