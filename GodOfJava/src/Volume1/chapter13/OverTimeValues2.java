package Volume1.chapter13;

// java.lang.Enum 클래스
//      모든 enum 클래스가 무조건 상속하는 클래스
//      컴파일 시 Enum 클래스 상속 선언문이 추가됨
//      enum 클래스를 선언할 때 다른 enum 클래스를 상속할 수 없음
public enum OverTimeValues2 {
    // 상수 선언
    //      상수의 값 지정 가능
    //      단, 값을 동적으로 할당할 수 없음
    THREE_HOUR(18000),  // 아래 생성자를 사용해 상수를 선언함, amount 변수에 값이 할당됨
    FIVE_HOUR(30000),
    WEEKEND_FOUR_HOUR(40000),
    WEEKEND_EIGHT_HOUR(60000);

    // final 인스턴스 변수
    private final int amount;

    // enum 클래스의 생성자
    //      생성자 선언 가능
    //      접근 제어자는 package-private, private만 사용 가능
    //      enum 클래스에 생성자를 선언하지 않으면 컴파일 시 자동으로 생성됨
    // 특이한 점
    //      상수를 enum 클래스 내에서 선언할 때만 생성자를 사용할 수 있음
    OverTimeValues2(int amount) {
        this.amount = amount;  // 인스턴스 생성 시 값이 할당됨
    }

    // enum 클래스의 메서드
    //      메서드 선언 가능
    public int getAmount() {
        return amount;
    }
}
