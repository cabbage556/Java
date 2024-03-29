package Volume1.chapter14;

public class ExceptionSample {

    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        // sample.arrayOutOfBounds();
        sample.arrayOutOfBoundsTryCatch();
    }

    public void arrayOutOfBounds() {
        int[] intArr = new int[5];

        // ArrayIndexOutOfBoundsException 발생
        System.out.println(intArr[5]);
    }

    public void arrayOutOfBoundsTryCatch() {
        int[] intArr = new int[5];

        try {
            System.out.println(intArr[5]);  // 실행1 -> 예외 발생
            System.out.println("This code should run");  // 실행되지 않음
        } catch (Exception e) {
            System.err.println("Exception occured");  // 실행2
        }
        System.out.println("This code must run");  // 실행3
    }
}
