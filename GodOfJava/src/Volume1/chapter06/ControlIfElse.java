package Volume1.chapter06;

public class ControlIfElse {
    public static void main(String[] args) {
        ControlIfElse control = new ControlIfElse();
        control.ifElseStatement(10);
        control.ifElseStatement(5);
    }

    public void ifElseStatement(int intValue) {
        if (intValue > 5) System.out.println("It's bigger than 5");
        else System.out.println("It's smaller than or equal 5");

        if (intValue <= 5)
            System.out.println("It's smaller than or equal 5");
        else
            System.out.println("It's bigger than 5");
    }

}
