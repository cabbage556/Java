package Volume1.chapter14;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            calc.printDivide(1.0, 2.0);
            calc.printDivide(1.0, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // System.out.println(e.toString());
            // e.printStackTrace();
        }
    }

    public void printDivide(double d1, double d2) throws RuntimeException {
        if (d2 == 0.0) {
            throw new RuntimeException("Second value can't be Zero");
        }

        System.out.println(d1 / d2);
    }
}
