package Volume1.chapter05;

public class OperatorCompound {
    public static void main(String[] args) {
        OperatorCompound operator = new OperatorCompound();
        operator.compound();
    }

    public void compound() {
        int intValue = 10;

        // +=
        intValue += 5;
        System.out.println("intValue = " + intValue);

        // -=
        intValue -= 5;
        System.out.println("intValue = " + intValue);

        // *=
        intValue *= 5;
        System.out.println("intValue = " + intValue);

        // /=
        intValue /= 5;
        System.out.println("intValue = " + intValue);

        // %=
        intValue %= 5;
        System.out.println("intValue = " + intValue);
    }
}
