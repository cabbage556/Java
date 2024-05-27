package Volume1.chapter15;

/*
    문자열의 일부를 추출하기 위한 메서드
    char 단위로 추출하는 대표적인 메서드
        - charAt(int index) : 특정 인덱스에 위치한 char 값을 리턴함
    char 배열을 문자열로 변환하는 메서드
        - copyValueOf(char[] data) : char 배열에 있는 char 값들을 문자열로 변환해 리턴함
            - String 클래스의 static 메서드
    문자열을 char 배열로 변환하는 메서드
        - toCharArray() : 문자열을 char 배열로 변환해 리턴함
    문자열의 일부를 잘라내는 메서드
        - substring(int beginIndex) : 문자열을 beginIndex부터 끝까지 잘라 문자열로 리턴함
        - substring(int beginIndex, int endIndex) : 문자열을 beginIndex부터 endIndex까지 잘라 문자열로 리턴함
        - subSequence(int beginIndex, int endIndex) : 문자열을 beginIndex부터 endIndex까지 잘라 CharSequence 타입으로 리턴함
        - endIndex 매개 변수에 전달하는 값이 beginIndex 매개 변수에 전달하는 값보다 작은 경우
            - StringIndexOutOfBoundsException 예외 발생
    문자열을 String 배열로 나누는 메서드
        - split(String regex) : regex에 맞춰 문자열을 잘라 String 배열로 리턴함
        - split(String regex, int limit) : regex에 맞춰 문자열을 잘라 String 배열로 리턴함
            - 이때 String 배열의 크기는 limit 값보다 커서는 안 됨
 */

public class StringExtract {

    public static void main(String[] args) {
        StringExtract sample = new StringExtract();
        sample.checkCharAt();
        sample.checkCopyValueOf();
        sample.checkToCharArray();
        sample.checkSubstring();
        sample.checkSplit();
    }

    public void checkCharAt() {
        System.out.println("StringExtract.checkCharAt");

        String text = "java";

        int jIdx = text.indexOf('j');
        System.out.println("text.charAt(jIdx) = " + text.charAt(jIdx));
        int aIdx = text.indexOf('a');
        System.out.println("text.charAt(aIdx) = " + text.charAt(aIdx));
    }

    public void checkCopyValueOf() {
        System.out.println("StringExtract.checkCopyValueOf");

        char[] values = {'J', 'a', 'v', 'a'};
        System.out.println("String.copyValueOf(values) = " + String.copyValueOf(values));
    }

    public void checkToCharArray() {
        System.out.println("StringExtract.checkToCharArray");

        String text = "Java";
        char[] chArr = text.toCharArray();
        for (char c : chArr) {
            System.out.println(c);
        }
    }

    public void checkSubstring() {
        System.out.println("StringExtract.checkSubstring");

        String text = "Java technology";
        String technology = text.substring(5);
        String tech = text.substring(5, 9);

        System.out.println("text = " + text);
        System.out.println("text.substring(5) = " + technology);
        System.out.println("text.substring(5, 9) = " + tech);
    }

    public void checkSplit() {
        System.out.println("StringExtract.checkSplit");

        String text = "Java technology is both a programming and a platform";
        String[] splitArr = text.split(" ");
        for (String s : splitArr) {
            System.out.println(s);
        }
    }
}
