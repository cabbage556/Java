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

        // length()
        //      문자열 길이 리턴
        System.out.println("text.length() = " + text.length());

        // isEmpty()
        //      문자열이 비어 있으면 true 리턴
        //      비어 있지 않으면 false 리턴
        System.out.println("text.isEmpty() = " + text.isEmpty());
    }

    public void checkCompare() {
        String text = "Check value";
        String text2 = "Check value";

        // if문 실행
        //      Constant Pool에 이미 존재하는 문자열을 재활용하기 때문
        if (text == text2) {
            System.out.println("text == text2 result is same.");
        } else {
            System.out.println("text == text2 result is different");
        }

        text2 = new String("Check value");  // 별도의 객체 생성

        // else문 실행
        //      값이 같더라도 Constant Pool에서 재활용하지 않고, 별도의 객체를 생성함
        if (text == text2) {
            System.out.println("text == text2 result is same.");
        } else {
            System.out.println("text == text2 result is different");
        }

        // equals()
        //      자바에서 객체를 비교할 때는 equals() 메서드를 사용해야 함
        //      String 객체에 사용하는 경우 호출한 객체의 문자열 값과 매개 변수에 전달한 객체의 문자열 값이 같은지 확인함
        if (text.equals(text2)) {
            System.out.println("text.equals(text2) result is same.");
        }

        // equalsIgnoreCase()
        //      equals() 메서드와 동일하게 동작하는 데, 대소문자를 구분하지 않음
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

        // compareTo()
        //      문자열의 순서를 비교해 음수, 0, 양수 중에서 하나를 리턴
        //          음수: 호출한 String 객체가 매개 변수로 전달한 String 객체보다 알파벳 순으로 앞에 있음
        //          0: 호출한 String 객체가 매개 변수로 전달한 String 객체와 알파벳 순으로 같음
        //          양수: 호출한 String 객체가 매개 변수로 전달한 String 객체보다 알파벳 순으로 뒤에 있음
        //      알파벳 순서만큼 숫자 값이 커짐
        //      보통 정렬을 할 때 사용하는 메서드
        System.out.println(text2.compareTo(text));  // 1
        System.out.println(text2.compareTo(text3)); // -1
        System.out.println(text.compareTo(text3));  // -2
        System.out.println(text3.compareTo(text4)); // 0
    }
}
