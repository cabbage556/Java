package Volume1.chapter14;

public class ExceptionVariable {

    public static void main(String[] args) {
        ExceptionVariable sample = new ExceptionVariable();
        // sample.checkVariable();
        // sample.checkVariable2();
        sample.checkVariable3();
    }

    public void checkVariable() {
        int[] intArr = new int[5];

        try {
            System.out.println(intArr[5]);
        } catch (Exception e) {
            System.out.println(intArr.length);
        }
        System.out.println("This code must run");
    }

    public void checkVariable2() {
        try {
            int[] intArr = new int[5];
            System.out.println(intArr[5]);
        } catch (Exception e) {
            // catch 블록에서는 try 블록에 선언한 변수에 접근할 수 없음
            //      try 블록에 선언한 변수는 try 블록 내부에서만 유효함
            // System.out.println(intArr.length);
        }
        System.out.println("This code must run");
    }

    public void checkVariable3() {
        int[] intArr = null;
        try {
            intArr = new int[5];  // 실행 결과가 무시되지 않음
            System.out.println(intArr[5]);  // 실행 -> 예외 발생
        } catch (Exception e) {
            System.out.println(intArr.length);  // 5
        }
        System.out.println("This code must run");
    }
}
