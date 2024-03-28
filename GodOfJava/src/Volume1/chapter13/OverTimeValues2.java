package Volume1.chapter13;

public enum OverTimeValues2 {
    // 상수의 값 지정 가능
    //      단, 값을 동적으로 할당할 수 없음
    THREE_HOUR(18000),  // 선언한 생성자를 사용함
    FIVE_HOUR(30000),
    WEEKEND_FOUR_HOUR(40000),
    WEEKEND_EIGHT_HOUR(60000);

    private final int amount;

    // enum 클래스에서 생성자 선언 가능
    // enum 클래스의 생성자는 package-private, private 접근 제어자만 사용 가능
    // enum 클래스에 생성자를 선언하지 않으면 컴파일 시 자동으로 생성됨
    OverTimeValues2(int amount) {
        this.amount = amount;
    }

    // enum 클래스에서도 메서드 선언 가능
    public int getAmount() {
        return amount;
    }
}
