package Volume1.chapter06;

public class ControlSwitch {
    public static void main(String[] args) {
        ControlSwitch control = new ControlSwitch();
        // control.switchStatement(1);
        // control.switchStatement(2);
        // control.switchStatement(3);
        // control.switchStatement(4);
        // control.switchStatement(6);

        control.switchStatement2(1);
    }

    public void switchStatement(int numberOfWheel) {
        // switch문 활용 : 하나의 값이 여러 범위에 걸쳐서 비교되어야 하는 경우
        //      break; : case 종료 시 필수 작성
        //      default : 모든 case 조건에 맞지 않는 경우에만 실행됨
        switch (numberOfWheel) {
            case 1:
                System.out.println(numberOfWheel + ": It is one foot bicycle");
                break;
            case 2:
                System.out.println(numberOfWheel + ": It is a motorcycle or bicycle");
                break;
            case 3:
                System.out.println(numberOfWheel + ": It is a three wheel car");
                break;
            case 4:
                System.out.println(numberOfWheel + ": It is a car");
                break;
            default:
                System.out.println(numberOfWheel + ": It is an expensive car");
                break;
        }
    }

    public void switchStatement2(int numberOfWheel) {
        /*
            case 1 실행 순서 : case 1 -> case 2 -> case 3
            case 2 실행 순서 : case 2 -> case 3
                case1, case2에 break;가 존재하지 않음
         */
        switch (numberOfWheel) {
            case 1:
                System.out.println(numberOfWheel + ": It is one foot bicycle");
                // break;
            case 2:
                System.out.println(numberOfWheel + ": It is a motorcycle or bicycle");
                // break;
            case 3:
                System.out.println(numberOfWheel + ": It is a three wheel car");
                break;
            case 4:
                System.out.println(numberOfWheel + ": It is a car");
                break;
            default:
                System.out.println(numberOfWheel + ": It is an expensive car");
                break;
        }
    }
}
