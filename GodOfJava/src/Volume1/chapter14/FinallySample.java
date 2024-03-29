package Volume1.chapter14;

public class FinallySample {

    public static void main(String[] args) {
        FinallySample sample = new FinallySample();
        // sample.finallySample();
        sample.finallySample2();
    }

    public void finallySample() {
        int[] intArr = new int[5];

        try {
            System.out.println(intArr[5]);  // 실행1 -> 예외 발생
        } catch (Exception e) {
            System.out.println(intArr.length);  // 실행2
        } finally {
            System.out.println("Here is finally");  // 실행3
        }

        System.out.println("This code must run");  // 실행4
    }

    public void finallySample2() {
        int[] intArr = new int[5];

        try {
            System.out.println(intArr[4]);  // 실행1
        } catch (Exception e) {
            System.out.println(intArr.length);
        } finally {
            System.out.println("Here is finally");  // 실행2
        }

        System.out.println("This code must run");  // 실행3
    }
}
