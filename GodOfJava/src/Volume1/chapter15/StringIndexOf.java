package Volume1.chapter15;

/*
    문자열 내에서 위치를 찾아내는 메서드
    indexOf() 메서드
        - 문자열 앞에서부터 문자열 또는 char를 찾는 메서드
            - 찾은 경우 : 문자열 또는 char의 위치 리턴
            - 찾지 못한 경우 : -1 리턴
        - fromIndex 매개 변수 : fromIndex 위치부터 오른쪽으로 탐색함
    lastIndexOf() 메서드
        - 문자열 뒤에서부터 문자열 또는 char를 찾는 메서드
            - 찾은 경우 : 문자열 또는 char의 위치 리턴
            - 찾지 못한 경우 : -1 리턴
        - fromIndex 매개 변수 : fromIndex 위치부터 왼쪽으로 탐색함
 */

public class StringIndexOf {

    public static void main(String[] args) {
        StringIndexOf sample = new StringIndexOf();
        sample.checkIndexOf();
        sample.checkLastIndexOf();
    }

    public void checkIndexOf() {
        String text = "Java technology is both a programming language and a platform.";

        // 매개 변수 int ch에 char 값을 넘겨주어도 int로 캐스팅되므로 문제 없음
        System.out.println(text);
        System.out.println("indexOf()");
        System.out.println("text.indexOf('a') = " + text.indexOf('a'));
        System.out.println("text.indexOf(\"a \") = " + text.indexOf("a "));
        System.out.println("text.indexOf('a', 20) = " + text.indexOf('a', 20));         // fromIndex부터 오른쪽으로 탐색
        System.out.println("text.indexOf(\"a \", 20) = " + text.indexOf("a ", 20));     // fromIndex부터 오른쪽으로 탐색
        System.out.println("text.indexOf('z') = " + text.indexOf('z'));
    }

    public void checkLastIndexOf() {
        String text = "Java technology is both a programming language and a platform.";

        // 매개 변수 int ch에 char 값을 넘겨주어도 int로 캐스팅되므로 문제 없음
        System.out.println(text);
        System.out.println("lastIndexOf()");
        System.out.println("text.lastIndexOf('a') = " + text.lastIndexOf('a'));
        System.out.println("text.lastIndexOf(\"a \") = " + text.lastIndexOf("a "));
        System.out.println("text.lastIndexOf('a', 20) = " + text.lastIndexOf('a', 20));         // fromIndex부터 왼쪽으로 탐색
        System.out.println("text.lastIndexOf(\"a \", 20) = " + text.lastIndexOf("a ", 20));     // fromIndex부터 왼쪽으로 탐색
        System.out.println("text.lastIndexOf('z') = " + text.lastIndexOf('z'));
    }
}
