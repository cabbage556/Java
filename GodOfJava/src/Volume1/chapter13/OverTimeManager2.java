package Volume1.chapter13;

/*
    java.lang.Enum 클래스
        - 모든 enum 클래스가 무조건 상속하는 클래스
        - enum 클래스는 무조건 Enum 클래스를 상속해야 하므로 enum 클래스를 선언할 때 다른 enum 클래스를 상속할 수 없음
        - enum 클래스를 선언할 때 명시적으로 Enum 클래스를 상속하지 않음
        - 컴파일 시 Enum 클래스 상속 선언문이 추가됨

    Enum 클래스도 Object 클래스의 toString() 메서드를 오버라이딩함
        - enum 객체에 이 메서드를 호출하면 객체 생성 시 사용한 상수의 이름을 리턴함
        - 필요하다면 toString() 메서드는 오버라이딩할 수 있음

    Enum 클래스는 compareTo() 메서드를 제공함
        - enum 클래스에 선언된 상수들의 순서를 비교해 그 차이에 해당하는 정수값을 리턴함
            - enum 클래스에 상수들이 선언된 순서대로 상수들의 순서가 결정됨
        - 리턴값
            - 같은 순서 : 0 리턴
            - 다른 순서 : 순서의 차이 리턴
                - 양수 : 호출한 enum 객체가 매개 변수로 전달한 enum 객체보다 뒤에 있는 경우
                - 음수 : 호출한 enum 객체가 매개 변수로 전달한 enum 객체보다 앞에 있는 경우
 */

public class OverTimeManager2 {

    public static void main(String[] args) {
        OverTimeValues2 value2 = OverTimeValues2.FIVE_HOUR; // OverTimeValues2 인스턴스 생성
        int amount = value2.getAmount();                    // 인스턴스 메서드 호출
        System.out.println("value2 = " + value2);           // value2.toString() 리턴값이 위치하게 됨
        System.out.println("amount = " + amount);

        OverTimeValues2 value3 = OverTimeValues2.THREE_HOUR;
        System.out.println(value2.compareTo(value3));  // 1이 출력됨 : FIVE_HOUR 상수는 THREE_HOUR 상수의 바로 뒤에 선언되어 있기 때문
    }
}
