package Volume1.chapter13;

public class OverTimeManager {
    public static void main(String[] args) {
        OverTimeManager manager = new OverTimeManager();

        // enum 클래스의 객체 생성 방법 : enum클래스이름.상수이름
        int myAmount = manager.getOverTimeAmount(OverTimeValues.THREE_HOUR);
        System.out.println("myAmount = " + myAmount);
    }

    public int getOverTimeAmount(OverTimeValues value) {
        int amount = 0;
        System.out.println("value = " + value);

        // enum 클래스를 가장 효과적으로 사용하는 방법 : switch문에서 사용하기
        switch (value) {
            case THREE_HOUR:
                amount = 18000;
                break;
            case FIVE_HOUR:
                amount = 30000;
                break;
            case WEEKEND_FOUR_HOUR:
                amount = 40000;
                break;
            case WEEKEND_EIGHT_HOUR:
                amount = 60000;
                break;
        }

        return amount;
    }
}
