package Volume1.chapter15;

public class StringReplace {

    public static void main(String[] args) {
        StringReplace sample = new StringReplace();
        // sample.checkTrim();
        // sample.checkTrim2();
        // sample.checkReplace();
        // sample.checkFormat();
        // sample.checkFormat2();
        // sample.checkToLowerCase();
        // sample.checkToUpperCase();
        // sample.checkValueOf();
        // sample.checkValueOf2();
        sample.internCheck();
    }

    public void checkTrim() {
        String[] strs = {" a", "b ", "   c", "d      ", "e   f", "   "};
        for (String str : strs) {
            System.out.println("[" + str + "]");

            // trim() 메서드
            //      문자열 앞과 뒤에 있는 모든 공백들을 제거한 뒤 리턴함
            System.out.println("[" + str.trim() + "]");
        }
    }

    public void checkTrim2() {
        String text = " a ";
        if (text != null && text.trim().length() > 0) {
            System.out.println("OK");
        }
    }

    public void checkReplace() {
        String text = "The String class represents character strings";

        // replace() 메서드
        //      문자열 중 일부를 대치한 뒤 리턴함
        //      기존 문자열은 변경되지 않음
        System.out.println(text.replace('s', 'z'));
        System.out.println(text);
        System.out.println(text.replace("tring", "trike"));
        System.out.println(text.replaceAll(" ", "|"));
        System.out.println(text.replaceFirst(" ", "|"));
    }

    public void checkFormat() {
        String text = "제 이름은 %s입니다. 지금까지 %d권의 책을 썼고, "
                + "하루에 %f%%의 시간을 책을 쓰는 데 할애하고 있습니다.";

        // format() static 메서드
        //      정해진 기준에 맞춘 문자열을 매개 변수의 값으로 대치하는 메서드
        //          %s: String 타입
        //          %d: 정수 타입
        //          %f: 소수 타입
        //          java.util.Formatter 클래스에서 format 사용 방법 확인 가능
        String realText = String.format(text, "이상민", 7, 10.5);
        System.out.println(realText);
    }

    public void checkFormat2() {
        String text = "제 이름은 %s입니다. 지금까지 %d권의 책을 썼고, "
                + "하루에 %f%%의 시간을 책을 쓰는 데 할애하고 있습니다.";

        // format() 메서드 사용 주의점
        //      대치하는 문자열보다 매개 변수의 개수가 부족하면 MissingFormatArgumentException 예외 발생
        String realText = String.format(text, "이상민", 7);
        System.out.println(realText);
    }

    public void checkToLowerCase() {
        String text = "JAVA STRING TOLOWERCASE()";
        System.out.println(text.toLowerCase());
    }

    public void checkToUpperCase() {
        String text = "java string touppercase()";
        System.out.println(text.toUpperCase());
    }

    public void checkValueOf() {
        byte b = 1;

        // valueOf() static 메서드
        //      기본 자료형의 값을 String으로 변환함
        String byte1 = String.valueOf(b);

        // valueOf() 메서드 대신 빈문자열을 더해 String으로 변환할 수도 있음
        String byte2 = b + "";

        System.out.println(byte1);
        System.out.println(byte2);
    }

    public void checkValueOf2() {
        Object obj = null;

        // null인 객체에 toString() 메서드를 호출하면 NullPointerException 예외 발생
        // System.out.println(obj.toString());

        // 이런 경우를 방지하기 위해 객체 출력 시 valueOf() 메서드를 사용하는 것이 좋음
        //      null인 객체의 경우 "null" 문자열을 리턴함
        System.out.println(String.valueOf(obj));
    }

    public void internCheck() {
        String text1 = "Java Basic";
        String text2 = "Java Basic";
        String text3 = new String("Java Basic");

        // intern() 메서드
        //      new String(String)으로 생성한 String 객체일지라도 intern() 메서드를 호출하면,
        //      문자열 풀에 해당하는 문자열이 있다면 문자열 풀에 있는 문자열을 참조하는 String 객체를 리턴함
        //      만약 문자열 풀에 문자열이 존재하지 않는다면 문자열 풀에 문자열을 추가함
        //      intern() 메서드를 수행한 뒤 == 연산자로 객체가 동일한지 비교할 수 있게 됨
        //          문자열 풀에 있는 동일한 문자열을 참조하기 때문
        text3 = text3.intern();

        // intern() 메서드는 사용하지 말자.
        //      문자열 풀에 새로운 문자열을 계속 추가하면, 저장 영역에 대해 별도로 메모리를 청소하는 단계를 거치게 됨
        //      결과적으로 시스템의 성능에 악영향을 주게 됨

        System.out.println(text1 == text2);
        System.out.println(text1 == text3);  // true
        System.out.println(text1.equals(text3));
    }
}
