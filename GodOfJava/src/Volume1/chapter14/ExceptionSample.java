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

        /*
        try-catch에서 예외가 발생하지 않는 경우
            try 내부의 모든 문장이 실행됨
            try-catch 이후 문장들이 실행됨
            catch 내부의 문장들은 실행되지 않음

        try-catch에서 예외가 발생하는 경우
            try 내부에서 예외가 발생한 문장 아래의 문장들은 실행되지 않음
            catch 내부의 모든 문장이 실행됨, 모두 실행하면 catch 블록을 빠져나옴
            try-catch 이후 문장들이 실행됨
         */

        try {
            System.out.println(intArr[5]);  // 실행1 -> 예외 발생
            System.out.println("This code should run");  // 실행되지 않음
        } catch (Exception e) {
            System.err.println("Exception occured");  // 실행2
        }
        System.out.println("This code must run");  // 실행3
    }
}
