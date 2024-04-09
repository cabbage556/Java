package Volume1.chapter13;

public class OverTimeManager2 {

    public static void main(String[] args) {
        OverTimeValues2 value2 = OverTimeValues2.FIVE_HOUR;  // OverTimeValues2 인스턴스 생성
        int amount = value2.getAmount();                    // 인스턴스 메서드 호출
        System.out.println("value2 = " + value2);
        System.out.println("amount = " + amount);

        OverTimeValues2 value3 = OverTimeValues2.THREE_HOUR;

        // Enum 클래스가 제공하는 compareTo() 메서드
        //      enum 클래스에 선언된 상수들의 순서를 비교함
        //      같은 순서: 0 리턴
        //      다른 순서: 순서의 차이 리턴
        //          양수: 전달하는 enum 객체를 기준으로 호출 enum 객체가 뒤에 있는 경우
        //          음수: 전달하는 enum 객체를 기준으로 호출 enum 객체가 앞에 있는 경우
        System.out.println(value2.compareTo(value3));  // 1
    }
}
