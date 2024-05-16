package Volume1.chapter06;

public class ControlIfAndOr {
    public static void main(String[] args) {
        ControlIfAndOr control = new ControlIfAndOr();
        // control.ifAndOr(25, true);
        control.tripleOrAnd(25, true, 180);
    }

    public void ifAndOr(int age, boolean isMarried) {
        // && : 첫 번째 조건이 false이면 두 번째 조건에 상관 없이 false를 리턴함
        // || : 첫 번째 조건이 true이면 두 번째 조건에 상관 없이 true를 리턴함

        // if문 소괄호 안에 &&와 ||를 활용하면 여러 조건을 한 번에 따질 수 있음
        if (age > 25 && isMarried) {
            System.out.println("Age is over 25 and Married");
        }

        // if문 소괄호 안에 &&와 ||를 활용하면 여러 조건을 한 번에 따질 수 있음
        if (age > 25 || isMarried) {
            System.out.println("Age is over 25 or Married");
        }

    }

    public void tripleOrAnd(int age, boolean isMarried, double height) {
        // &&나 ||를 여러 개를 사용하는 경우 소괄호로 묶어 명확하게 이해할 수 있게 하는 것이 좋음
        if ((age > 25 || isMarried) && height >= 180) {
            System.out.println("Age is over 25 or Married and height is over 180");
        }
    }
}
