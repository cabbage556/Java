package Volume1.chapter14;

public class FinallySample {

    public static void main(String[] args) {
        FinallySample sample = new FinallySample();
        // sample.finallySample();
        sample.finallySample2();
    }

    /*
    finally 블록
        예외 발생 여부와 상관 없이 반드시 실행되는 블록
        코드 중복을 줄이기 위해 필요함
     */

    public void finallySample() {
        int[] intArr = new int[5];

        try {
            System.out.println(intArr[5]);  // 실행1 -> 예외 발생
        } catch (Exception e) {
            System.out.println(intArr.length);  // 실행2
        } finally {
            System.out.println("Here is finally");  // 실행3: 예외가 발생해도 실행됨
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
            System.out.println("Here is finally");  // 실행2: 예외가 발생하지 않아도 실행됨
        }

        System.out.println("This code must run");  // 실행3
    }
}
