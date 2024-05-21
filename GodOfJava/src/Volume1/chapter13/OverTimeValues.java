package Volume1.chapter13;

/*
    enum 클래스
        - 클래스가 상수만으로 구성되는 경우 class 대신 enum으로 선언할 수 있음
        - enum으로 선언하면 "이 클래스가 상수의 집합이다"라는 것을 명시적으로 나타내는 것
        - enum도 클래스의 일종임
            - "enum 클래스" 또는 "열거형"이라고 표현함

    enum 클래스의 상수
        - 별도로 타입과 값을 지정할 필요가 없음
        - 값은 할당할 수 있음
        - 상수들의 이름만 콤마로 구분해 나열함

    enum 클래스의 객체 생성 방법 간단하게 이해하기
        - "enum클래스이름.상수이름"으로 enum 클래스의 객체가 생성됨
        - 예시 : OverTimeValues.THREE_HOUR
 */

// OverTimeValues enum 클래스 선언
public enum OverTimeValues {

    // 상수 선언
    THREE_HOUR,
    FIVE_HOUR,
    WEEKEND_FOUR_HOUR,
    WEEKEND_EIGHT_HOUR;
}
