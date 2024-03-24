package Volume1.chapter05;

public class Operator {
    public static void main(String[] args) {
        Operator sample = new Operator();
        // sample.additive();
        // sample.multipleDivision();
        // sample.divideByInt();
        // sample.divideByInt2();
        sample.remainder();
    }

    public void additive() {
        int intValue1 = 5;
        int intValue2 = 10;

        int result = intValue1 + intValue2;
        System.out.println("result = " + result);

        result = intValue2 - intValue1;
        System.out.println("result = " + result);
    }

    public void multipleDivision() {
        int intValue1 = 5;
        int intValue2 = 10;

        int result = intValue1 * intValue2;
        System.out.println("result = " + result);

        result = intValue2 / intValue1;
        System.out.println("result = " + result);
    }

    public void divideByInt() {
        int intValue1 = 5;
        int intValue2 = 10;
        int result = intValue1 / intValue2;
        System.out.println("result = " + result);
    }

    public void divideByInt2() {
        double doubleValue1 = 5;
        double doubleValue2 = 10;
        double result = doubleValue1 / doubleValue2;
        System.out.println("result = " + result);
    }

    public void remainder() {
        int intValue1 = 53;
        int intValue2 = 10;
        int result = intValue1 % intValue2;
        System.out.println("result = " + result);
    }
}
