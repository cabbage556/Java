package Volume1.chapter15;

public class StringCheck {

    public static void main(String[] args) {
        StringCheck sample = new StringCheck();

        String[] addresses = {
                "서울시 구로구 신도림동",
                "경기도 성남시 분당구 정자동 개발 공장",
                "서울시 구로구 개봉동"
        };
        // sample.checkAddress(addresses);
        // sample.containsAddress(addresses);
        sample.checkMatch();
    }

    public void checkAddress(String[] addresses) {
        int startCount = 0, endCount = 0;
        String startText = "서울시";
        String endText = "동";

        for (String address : addresses) {
            // startsWith() 메서드
            //      문자열이 매개 변수로 전달한 문자열로 시작하는지 확인하는 메서드
            if (address.startsWith(startText)) {
                startCount++;
            }

            // endsWith() 메서드
            //      문자열이 매개 변수로 전달한 문자열로 끝나는지 확인하는 메서드
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
            // contains 메서드
            //      문자열에 매개 변수로 전달한 문자열이 존재하는지 확인하는 메서드
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

        // regionMatches() 메서드
        //      문자열 중에서 특정 영역이 매개 변수로 전달한 문자열과 동일한지 확인하는 메서드
        //          ignoreCase: true인 경우 대소문자를 구분하지 않음
        //          toffset: 비교 대상 문자열(호출 String 객체)의 확인 시작 위치
        //          other: 존재하는지 확인할 문자열(매개 변수로 전달한 String 객체)
        //          ooffset: other 객체의 확인 시작 위치
        //          len: 비교할 char 개수
        System.out.println(text.regionMatches(2, compare1, 0, 1));
        System.out.println(text.regionMatches(5, compare1, 0, 2));
        System.out.println(text.regionMatches(true, 0, compare2, 0, compare2.length()));
    }
}
