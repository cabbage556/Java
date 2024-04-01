package Volume1.chapter15;

public class StringIndexOf {

    public static void main(String[] args) {
        StringIndexOf sample = new StringIndexOf();
        // sample.checkIndexOf();
        sample.checkLastIndexOf();
    }

    public void checkIndexOf() {
        String text = "Java technology is both a programming language and a platform";

        // indexOf() 메서드
        //      문자열 앞에서부터 문자열이나 char 값을 찾는 메서드
        //          fromIndex 매개 변수: 앞에서부터 fromIndex 위치부터 오른쪽으로 탐색
        //      찾은 문자열이나 char의 위치를 리턴함
        //      찾지 못하면 -1을 리턴함
        //      char는 정수 타입이므로 char 값을 넘겨주면 int로 자동 형변환됨
        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf('a', 20));
        System.out.println(text.indexOf("a ", 20));
        System.out.println(text.indexOf('z'));
    }

    public void checkLastIndexOf() {
        String text = "Java technology is both a programming language and a platform";

        // lastIndexOf() 메서드
        //      문자열 뒤에서부터 문자열이나 char 값을 찾는 메서드
        //          fromIndex 매개 변수: 앞에서부터 fromIndex 위치부터 왼쪽으로 탐색
        //      찾은 문자열이나 char의 위치를 리턴함
        //      찾지 못하면 -1을 리턴함
        //      char는 정수 타입이므로 char 값을 넘겨주면 int로 자동 형변환됨
        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf('a', 20));
        System.out.println(text.lastIndexOf("a ", 20));
        System.out.println(text.lastIndexOf('z'));
    }
}
