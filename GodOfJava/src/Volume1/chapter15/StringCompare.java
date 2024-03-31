package Volume1.chapter15;

public class StringCompare {

    public static void main(String[] args) {
        StringCompare sample = new StringCompare();
        // sample.checkString();
        // sample.checkCompare();
        sample.checkCompareTo();
    }

    public void checkString() {
        String text = "String 클래스를 반드시 알아야 한다.";
        System.out.println("text.length() = " + text.length());
        System.out.println("text.isEmpty() = " + text.isEmpty());
    }

    public void checkCompare() {
        String text = "Check value";
        // String text2 = "Check value";  // 첫 번째 if문 코드 실행: Constant Pool
        String text2 = new String("Check value");  // else문 코드 실행: 별도의 String 객체 생성

        if (text == text2) {
            System.out.println("text == text2 result is same.");
        } else {
            System.out.println("text == text2 result is different");
        }

        if (text.equals(text2)) {
            System.out.println("text.equals(text2) result is same.");
        }

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

        // compareTo() 메서드
        //      문자열의 순서를 비교해 음수, 0, 양수 중에서 하나를 리턴
        //          음수: 호출한 String 객체가 매개 변수로 전달한 String 객체보다 알파벳 순으로 앞에 있음
        //          0: 호출한 String 객체가 매개 변수로 전달한 String 객체와 알파벳 순으로 같음
        //          양수: 호출한 String 객체가 매개 변수로 전달한 String 객체보다 알파벳 순으로 뒤에 있음
        //      알파벳 순서만큼 숫자 값이 커짐
        System.out.println(text2.compareTo(text));  // 1
        System.out.println(text2.compareTo(text3)); // -1
        System.out.println(text.compareTo(text3));  // -2
        System.out.println(text3.compareTo(text4)); // 0
    }
}
