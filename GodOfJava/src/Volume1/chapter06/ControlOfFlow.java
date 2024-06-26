package Volume1.chapter06;

public class ControlOfFlow {
    public static void main(String[] args) {
        ControlOfFlow control = new ControlOfFlow();
        control.switchCalendar(1);
        control.switchCalendar(3);
        control.switchCalendar(4);
        control.switchCalendar(9);
        control.switchCalendar(2);
    }

    public void switchCalendar(int month) {
        // break;를 사용하지 않고 switch문을 활용하는 예시
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + " has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + " has 30 days");
                break;
            case 2:
                System.out.println(month + " has 28 or 29 days");
                break;
            default:
                System.out.println(month + " is not a month");
                break;
        }
    }
}
