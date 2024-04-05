package Volume1.chapter06;

public class ControlIfAndOr {
    public static void main(String[] args) {
        ControlIfAndOr control = new ControlIfAndOr();
        // control.ifAndOr(25, true);
        control.tripleOrAnd(25, true, 180);
    }

    public void ifAndOr(int age, boolean isMarried) {
        if (age > 25 && isMarried) {
            System.out.println("Age is over 25 and Married");
        }
        if (age > 25 || isMarried) {
            System.out.println("Age is over 25 or Married");
        }
    }

    public void tripleOrAnd(int age, boolean isMarried, double height) {
        // 괄호로 묶어 표현하여 명확하게 이해할 수 있게 하자.
        if ((age > 25 || isMarried) && height >= 180) {
            System.out.println("Age is over 25 or Married and height is over 180");
        }
    }
}
