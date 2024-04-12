package Volume1.chapter15;

public class StringNull {

    public static void main(String[] args) {
        StringNull sample = new StringNull();
        // sample.nullCheck(null);
        sample.nullCheck2(null); // true
    }

    public boolean nullCheck(String text) {
        // NullPointerException 예외 발생
        //      모든 객체를 처리하기 전에 null 체크는 필수적임
        int textLength = text.length();
        System.out.println("textLength = " + textLength);

        if (text == null) return true;
        else return false;
    }

    public boolean nullCheck2(String text) {
        // 객체 null 체크
        //      객체 처리 전에 null 체크는 필수적임
        if (text == null) {
            return true;
        } else {
            int textLength = text.length();
            System.out.println("textLength = " + textLength);

            return false;
        }
    }
}
