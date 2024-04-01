package Volume1.chapter15;

public class StringExtract {

    public static void main(String[] args) {
        StringExtract sample = new StringExtract();
        // sample.checkCharAt();
        // sample.checkCopyValueOf();
        // sample.checkToCharArray();
        // sample.checkSubstring();
        sample.checkSplit();
    }

    public void checkCharAt() {
        String text = "java";

        // charAt() 메서드
        //      특정 인덱스의 char 값을 리턴함
        System.out.println(text.charAt(text.indexOf('j')));
        System.out.println(text.charAt(text.indexOf('a')));
    }

    public void checkCopyValueOf() {
        char[] values = {'J', 'a', 'v', 'a'};

        // copyValueOf() static 메서드
        //      char 배열에 있는 값을 문자열로 변환함
        System.out.println(String.copyValueOf(values));
    }

    public void checkToCharArray() {
        String text = "Java";

        // toCharArray() 메서드
        //      문자열을 char 배열로 변환함
        char[] chArr = text.toCharArray();
        for (char c : chArr) {
            System.out.println(c);
        }
    }

    public void checkSubstring() {
        String text = "Java technology";

        // substring(int beginIndex) 메서드
        //      문자열을 beginIndex부터 끝까지 잘라 String으로 리턴함
        String technology = text.substring(5);

        // substring(int beginIndex, int endIndex) 메서드
        //      문자열을 beginIndex부터 endIndex까지 잘라 String으로 리턴함
        String tech = text.substring(5, 9);
        System.out.println(technology);
        System.out.println(tech);
    }

    public void checkSplit() {
        String text = "Java technology is both a programming and a platform";
        String[] splitArr = text.split(" ");
        for (String s : splitArr) {
            System.out.println(s);
        }
    }
}
