package Volume1.chapter06;

public class ControlDoWhile {
    public static void main(String[] args) {
        ControlDoWhile control = new ControlDoWhile();
        control.doWhile();
    }

    public void doWhile() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;

        // do-while문
        //      적어도 한 번은 중괄호 내부 문장들이 실행됨
        //      한 번은 꼭 실행시키고 싶을 때 사용함
        do {
            loop++;
            control.switchCalendar(loop);
        } while (loop < 12);
    }
}
