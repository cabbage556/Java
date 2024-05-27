package Volume1.chapter15;

/*
    String 객체의 내용을 비교하고 검색하는 메서드
    length() 메서드
        - String 객체(문자열)의 길이를 확인하는 메서드
        - 공백도 길이에 포함됨
    isEmpty() 메서드
        - 문자열이 비어 있는지 확인해 비어 있다면 true를, 비어 있지 않다면 false를 리턴하는 메서드
        - 문자열이 비어 있는지 확인할 때 길이가 0인지 확인하는 것보다 이 메서드를 사용하는 것이 더 간단함
    equals() 메서드
        - 문자열 값이 같은지 확인해 같다면 true를, 같지 않다면 false를 리턴하는 메서드
    equalsIgnoreCase() 메서드
        - equals() 메서드와 동일하게 동작하는데, 대소문자를 구분하지 않는다는 점만 다름
    compareTo() 메서드
        - 문자열의 순서를 비교해 0, 음수, 양수 중 하나를 리턴함
            - 0 : 문자열의 순서가 같은 경우
            - 양수 : 호출한 String 객체가 매개 변수로 전달한 String 객체보다 알파벳 순서상 뒤에 있는 경우
            - 음수 : 호출한 String 객체가 매개 변수로 전달한 String 객체보다 알파벳 순서상 앞에 있는 경우
        - 알파벳 순서 차이만큼 숫자 값이 커짐
        - 보통 정렬할 때 사용하는 메서드
    compareToIgnoreCase() 메서드
        - compareTo() 메서드와 동일하게 동작하는데, 대소문자를 구분하지 않는다는 점만 다름
    contentEquals(CharSequence), contentEquals(StringBuffer) 메서드
        - 매개 변수로 전달한 CharSequence 객체, StringBuffer 객체가 호출한 String 객체와 같은지 비교하는 데 사용함
 */

public class StringCompare {

    public static void main(String[] args) {
        StringCompare sample = new StringCompare();
        sample.checkString();
        sample.checkCompare();
        sample.checkCompareTo();
    }

    public void checkString() {
        String text = "String 클래스를 반드시 알아야 한다.";
        System.out.println("text.length() = " + text.length());
        System.out.println("text.isEmpty() = " + text.isEmpty());
    }

    public void checkCompare() {
        String text = "Check value";
        String text2 = "Check value";

        // if문 실행 : Constant Pool에 이미 존재하는 문자열을 재활용하기 때문
        if (text == text2) {
            System.out.println("text == text2 result is same.");
        } else {
            System.out.println("text == text2 result is different");
        }

        text2 = new String("Check value");  // 별도의 객체 생성

        // else문 실행 : 값이 같더라도 Constant Pool에서 재활용하지 않고, 별도의 객체를 생성함
        if (text == text2) {
            System.out.println("text == text2 result is same.");
        } else {
            System.out.println("text == text2 result is different");
        }

        // 두 문자열 값이 동일하므로 true
        if (text.equals(text2)) {
            System.out.println("text.equals(text2) result is same.");
        }

        // 두 문자열 값이 대소문자 상관 없이 동일하므로 true
        String text3 = "check value";
        if (text.equalsIgnoreCase(text3)) {
            System.out.println("text.equalsIgnoreCase(text3) result is same.");
        }
    }

    public void checkCompareTo() {
        String text = "a";
        String text2 = "b";
        String text3 = "c";
        String text4 = "c";

        System.out.println(text2.compareTo(text));  // 1 : "b"는 "a"보다 1칸 뒤에 있음
        System.out.println(text2.compareTo(text3)); // -1 : "b"는 "c"보다 1칸 앞에 있음
        System.out.println(text.compareTo(text3));  // -2 : "a"는 "c"보다 2칸 앞에 있음
        System.out.println(text3.compareTo(text4)); // 0
    }
}
