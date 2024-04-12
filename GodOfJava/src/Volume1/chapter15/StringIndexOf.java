package Volume1.chapter15;

public class StringIndexOf {

    public static void main(String[] args) {
        StringIndexOf sample = new StringIndexOf();
        sample.checkIndexOf();
        sample.checkLastIndexOf();
    }

    public void checkIndexOf() {
        String text = "Java technology is both a programming language and a platform.";

        // indexOf()
        //      문자열의 가장 왼쪽부터 문자열이나 char 값의 위치를 찾는 메서드
        //          fromIndex 매개 변수: fromIndex 위치부터 오른쪽으로 탐색
        //      찾은 문자열이나 char의 위치를 리턴함
        //      찾지 못하면 -1을 리턴함
        System.out.println("indexOf()");
        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf('a', 20));
        System.out.println(text.indexOf("a ", 20));
        System.out.println(text.indexOf('z'));
    }

    public void checkLastIndexOf() {
        String text = "Java technology is both a programming language and a platform.";

        // lastIndexOf()
        //      문자열의 가장 오른쪽부터 문자열이나 char 값의 위치를 찾는 메서드
        //          fromIndex 매개 변수: fromIndex 위치부터 왼쪽으로 탐색
        //      찾은 문자열이나 char의 위치를 리턴함
        //      찾지 못하면 -1을 리턴함
        System.out.println("lastIndexOf()");
        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf('a', 20));
        System.out.println(text.lastIndexOf("a ", 20));
        System.out.println(text.lastIndexOf('z'));
    }
}
