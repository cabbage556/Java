package Volume1.chapter15;

/*
    객체의 null 체크
        - String 객체 뿐만 아니라 모든 객체를 처리할 때는 반드시 null 체크를 해야 함
        - 모든 참조 자료형 변수는 null을 저장할 수 있음
        - 객체가 null이라는 것은 객체가 초기화되어 있지 않고, 클래스에 선언된 어떤 인스턴스 메서드도 사용할 수 없음을 의미함
        - 객체가 null인 경우 객체에 대해 메서드를 호출하면 모두 예외를 발생시킴
    객체의 null 체크를 제대로 하지 않으면 애플리케이션이 비정상적으로 동작해 장애로 이어질 수 있으므로 null 체크는 매우 중요함
        - 메서드의 매개 변수 타입이 참조 자료형인 경우 반드시 null 체크를 하는 습관이 필요함
 */

public class StringNull {

    public static void main(String[] args) {
        StringNull sample = new StringNull();
        // sample.nullCheck(null);
        sample.nullCheck2(null); // true
    }

    public boolean nullCheck(String text) {
        // null인 객체에 대해 메서드를 호출하는 경우 NullPointerException 예외 발생
        int textLength = text.length();
        System.out.println("textLength = " + textLength);

        if (text == null) return true;
        else return false;
    }

    public boolean nullCheck2(String text) {
        // 객체 null 체크 : == 또는 != 연산자 사용
        if (text == null) {
            return true;
        } else {
            int textLength = text.length();
            System.out.println("textLength = " + textLength);

            return false;
        }
    }
}
