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
                break;
            }
        }
    }

    public void whileContinue() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while (loop < 12) {
            loop++;
            if (loop == 6) {
                continue;
            }
            control.switchCalendar(loop);
        }
    }

    // if (...) continue;에 의해 무한 루프 실행 -> 자바 프로세스가 종료될 때까지 계속 반복됨
    public void whileContinueInfinite() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while (loop < 12) {
            if (loop == 6) {
                continue;
            }
            loop++;
            control.switchCalendar(loop);
        }
    }
}
