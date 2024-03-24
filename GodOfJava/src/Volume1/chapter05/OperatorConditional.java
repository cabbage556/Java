package Volume1.chapter05;

public class OperatorConditional {
    public static void main(String[] args) {
        OperatorConditional operator = new OperatorConditional();
        operator.condition();
    }

    public void condition() {
        boolean x = true;
        boolean y = true;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("---------");

        // x = false, y = true
        x = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("---------");

        // x = false, y = false
        y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
    }
}
