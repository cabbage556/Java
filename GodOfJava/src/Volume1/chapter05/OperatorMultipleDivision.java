package Volume1.chapter05;

public class OperatorMultipleDivision {
    public static void main(String[] args) {
        OperatorMultipleDivision sample = new OperatorMultipleDivision();
        // sample.multipleDivision();
        // sample.divideInt();
        sample.divideInt2();
    }

    public void multipleDivision() {
        int intValue1 = 5, intValue2 = 10;
        int result = intValue1 * intValue2;
        System.out.println("result = " + result);
        result = intValue2 / intValue1;
        System.out.println("result = " + result);
    }

    public void divideInt() {
        int intValue1 = 5, intValue2 = 10;
        int result = intValue1 / intValue2;
        System.out.println("result = " + result);  // 0
    }

    public void divideInt2() {
        double doubleValue1 = 5, doubleValue2 = 10;
        double result = doubleValue1 / doubleValue2;
        System.out.println("result = " + result);  // 0.5
    }
}
