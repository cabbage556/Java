package Volume1.chapter06;

public class ControlLabel {
    public static void main(String[] args) {
        ControlLabel control = new ControlLabel();
        // control.printTimesTable();
        // control.printTimesTableSkip4Case();
        // control.printTimesTableSkipAfter4Case1();
        control.printTimesTableSkipAfter4Case2();
    }

    public void printTimesTable() {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + " ");
            }
            System.out.println();
        }
    }

    public void printTimesTableSkip4Case() {
        for (int i = 2; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            for (int j = 1; j < 10; j++) {
                if (j == 4) {
                    continue;
                }
                System.out.print(i + " * " + j + " = " + (i * j) + " ");
            }
            System.out.println();
        }
    }

    public void printTimesTableSkipAfter4Case1() {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 4) {
                    break;
                }
                System.out.print(i + " * " + j + " = " + (i * j) + " ");
            }
            System.out.println();
        }
    }

    public void printTimesTableSkipAfter4Case2() {
        startLabel:
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 4) {
                    continue startLabel;  // startLabel 반복문의 시작점으로 이동하기
                }
                System.out.print(i + " * " + j + " = " + (i * j) + " ");
            }
            System.out.println();
        }
    }
}
