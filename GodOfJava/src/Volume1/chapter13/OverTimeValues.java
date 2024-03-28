package Volume1.chapter13;

// enum 클래스
//      클래스가 상수만으로 구성되는 경우 class 대신 enum을 사용할 수 있음
//      enum을 사용해 "이 클래스가 상수의 집합이다"라는 것을 명시적으로 나타냄
//      enum도 클래스의 일종이므로 enum 클래스라고 표현함
public enum OverTimeValues {
    // enum 클래스에 선언한 상수들
    //      별도로 타입과 값을 지정할 필요가 없음
    //      값을 할당할 수는 있음
    //      상수들의 이름만 콤마로 구분하여 나열함
    THREE_HOUR,
    FIVE_HOUR,
    WEEKEND_FOUR_HOUR,
    WEEKEND_EIGHT_HOUR;
}
