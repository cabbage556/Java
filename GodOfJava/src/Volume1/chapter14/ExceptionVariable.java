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
            // try 블록에 선언한 변수는 catch 블록에서 접근할 수 없음
            //      try 블록에 선언한 변수는 try 블록 내부에서만 유효하기 때문
            // System.out.println(intArr.length);
        }
        System.out.println("This code must run");
    }

    public void checkVariable3() {
        // 일반적으로 catch 블록에서도 사용할 변수는 try 블록 앞에 미리 선언함
        int[] intArr = null;

        try {
            intArr = new int[5];                // 아래 문장에서 예외가 발생하지만 실행 결과가 무시되지 않음
            System.out.println(intArr[5]);      // 예외 발생
        } catch (Exception e) {
            System.out.println(intArr.length);  // 5: 실행 결과가 무시되지 않으므로 배열 길이가 출력됨
        }
        System.out.println("This code must run");
    }
}
