package Volume1.chapter15;

/*
    특정 조건에 맞는 문자열이 있는지 확인하는 메서드
    startsWith() 메서드
        - 문자열이 매개 변수에 전달한 문자열로 시작하는지 확인하는 메서드
    endsWith() 메서드
        - 문자열이 매개 변수에 전달한 문자열로 끝나는지 확인하는 메서드
    contains() 메서드
        - 문자열에 매개 변수에 전달한 문자열이 존재하는지 확인하는 메서드
    matches() 메서드
        - 문자열에 매개 변수로 전달한 값(정규 표현식)이 존재하는지 확인하는 메서드
        - JDK 1.4부터 정규 표현식 제공
        - java.util.regex 패키지의 Pattern 클래스 API에서 확인
    regionMathces(boolean ignoreCase, int toffset, String other, int ooffset, int len) 메서드
        - 문자열 중에서 특정 영역이 매개 변수로 전달한 문자열과 동일한지 확인하는 메서드
        - 매개 변수의 의미
            - ignoreCase : true인 경우 대소문자를 구분하지 않음
            - toffset : 호출한 String 객체의 확인 시작 위치
            - other : 존재하는지 확인할 문자열
            - ooffset : other 객체의 확인 시작 위치
            - len : 비교할 char 갯수
 */

public class StringCheck {

    public static void main(String[] args) {
        StringCheck sample = new StringCheck();

        String[] addresses = {
                "서울시 구로구 신도림동",
                "경기도 성남시 분당구 정자동 개발 공장",
                "서울시 구로구 개봉동"
        };
        sample.checkAddress(addresses);
        sample.containsAddress(addresses);
        sample.checkMatch();
    }

    public void checkAddress(String[] addresses) {
        int startCount = 0, endCount = 0;
        String startText = "서울시";
        String endText = "동";

        for (String address : addresses) {
            if (address.startsWith(startText)) {
                startCount++;
            }
            if (address.endsWith(endText)) {
                endCount++;
            }
        }

        System.out.println("Starts with " + startText + " count is " + startCount);
        System.out.println("Ends with " + endText + " count is " + endCount);
    }

    public void containsAddress(String[] addresses) {
        int containCount = 0;
        String containText = "구로";

        for (String address : addresses) {
            if (address.contains(containText)) {
                containCount++;
            }
        }
        System.out.println("Contains " + containText + " count is " + containCount);
    }

    public void checkMatch() {
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";

        // text의 2번 인덱스부터의 문자열과 compare1의 0번 인덱스부터의 문자열을 1글자만 비교
        System.out.println(text.regionMatches(2, compare1, 0, 1));

        // text의 5번 인덱스부터의 문자열과 compare1의 0번 인덱스부터의 문자열을 2글자만 비교
        System.out.println(text.regionMatches(5, compare1, 0, 2));

        // text의 0번 인덱스부터의 문자열과 compare2의 전체 문자열을 비교, 대소문자 무시
        System.out.println(text.regionMatches(true, 0, compare2, 0, compare2.length()));
    }
}
