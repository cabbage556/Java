package Volume1.chapter06;

public class ControlElseIf {
    public static void main(String[] args) {
        ControlElseIf control = new ControlElseIf();
        // control.elseIf(100);
        // control.elseIf(81);
        // control.elseIf(71);
        // control.elseIf(61);
        // control.elseIf(51);
        // control.elseIf(41);
        // control.elseIf(31);

        control.elseIf2(100);
        control.elseIf2(81);
        control.elseIf2(71);
        control.elseIf2(61);
        control.elseIf2(51);
        control.elseIf2(41);
        control.elseIf2(31);
    }

    public void elseIf(int point) {
        if (point > 90) {
            System.out.println("A");
        } else if (point > 80) {
            System.out.println("B");
        } else if (point > 70) {
            System.out.println("C");
        } else if (point > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public void elseIf2(int point) {
        // else if 보다 간단하지만, 가독성은 떨어지는 방식 -> switch로 개선
        String result = point > 90 ? "A" : point > 80 ? "B" : point > 70 ? "C" : point > 60 ? "D" : "F";
        System.out.println(result);
    }
}
