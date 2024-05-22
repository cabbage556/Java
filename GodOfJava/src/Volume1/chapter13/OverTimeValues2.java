package Volume1.chapter13;

/*
    enum 클래스의 생성자
        - enum 클래스에서도 생성자를 선언할 수 있음
        - 하지만 생성자를 통해 객체를 생성할 수 없음
        - package-private(default), private 접근 제어자만 사용 가능
            - enum 클래스 내에서 상수를 선언할 때만 생성자를 사용할 수 있는 것
        - enum 클래스에 생성자를 선언하지 않으면 컴파일 시 자동으로 생성됨

    enum 클래스의 상수 선언 시 생성자 사용
        - enum 클래스 OverTimeValues2에 상수를 선언할 때 OverTimeValues2(int amount) 생성자를 사용함
        - 상수의 값을 지정하면 amount 인스턴스 변수에 상수의 값이 할당됨
        - 상수의 값을 동적으로 할당하는 것은 불가능함

    enum 클래스에서도 메서드 선언 가능
 */
public enum OverTimeValues2 {

    // 상수 선언 : OverTimeValues2(int amount) 생성자 사용
    THREE_HOUR(18000),  // amount 인스턴스 변수에 18000이 할당됨
    FIVE_HOUR(30000),
    WEEKEND_FOUR_HOUR(40000),
    WEEKEND_EIGHT_HOUR(60000);

    // 인스턴스 변수 선언
    private final int amount;

    // 생성자 선언
    OverTimeValues2(int amount) {
        this.amount = amount;  // 인스턴스 생성 시 값이 할당됨
    }

    // 메서드 선언
    public int getAmount() {
        return amount;
    }
}
