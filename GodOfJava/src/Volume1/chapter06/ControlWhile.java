package Volume1.chapter06;

public class ControlWhile {
    public static void main(String[] args) {
        ControlWhile control = new ControlWhile();
        // control.whileLoop1();
        // control.whileLoop2();
        // control.whileLoop3();
        control.whileContinue();
    }

    public void whileLoop1() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;

        // while문 소괄호 안에는 boolean 결과값이 있어야 함
        //      boolean 결과값이 true일 경우에만 중괄호 내부 문장들이 실행됨
        //      처음부터 boolean 결과값이 false인 경우 아예 중괄호 내부 문장들이 실행되지 않음
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
        }
    }

    public void whileLoop2() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
            if (loop == 6) {
                loop = 100;
            }
        }
    }

    public void whileLoop3() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while (loop < 12) {
            loop++;
            control.switchCalendar(loop);
            if (loop == 6) {
                break;  // break : 가장 가까운 반복문의 중괄호를 빠져 나감
            }
        }
    }

    public void whileContinue() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while (loop < 12) {
            loop++;
            if (loop == 6) {
                continue;  // continue : 가장 가까운 반복문의 boolean 조건으로 건너뜀
            }
            control.switchCalendar(loop);
        }
    }

    public void whileContinueInfinite() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while (loop < 12) {
            // 무한 루프 실행
            //      자바 프로세스가 종료될 때까지 계속 반복됨
            if (loop == 6) {
                continue;
            }
            loop++;
            control.switchCalendar(loop);
        }
    }
}
