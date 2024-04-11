package Volume1.chapter14;

public class MultiCatchSample {

    public static void main(String[] args) {
        MultiCatchSample sample = new MultiCatchSample();
        // sample.multiCatch();
        // sample.multiCatchChangeOrder();
        // sample.multiCatchThreeWithNull();
        sample.multiNoCatch();
    }

    /*
    try 다음 catch 블록은 1개 이상 넣을 수 있음
    try 블록에서 발생한 예외와 관련된 catch 블록이 실행됨
    try 블록에서 발생한 예외와 관련된 catch 블록이 없으면 예외가 발생하며 스레드가 종료됨
    먼저 선언한 catch 블록의 예외 클래스가 다음 catch 블록의 예외 클래스의 부모 클래스인 경우
        자식 예외 클래스에 해당하는 catch 블록이 실행되지 않으므로 컴파일 에러 발생
    마지막 catch 블록은 모든 예외 클래스의 부모 클래스인 Exception의 catch 블록으로 사용해 예상치 못한 예외를 처리하는 것이 좋음
     */

    public void multiCatch() {
        int[] intArr = new int[5];

        // catch 블록은 1개 이상 넣을 수 있음
        try {
            System.out.println(intArr[5]);  // 실행1 -> 예외 발생
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured");  // 실행2
        } catch (Exception e) {
            System.out.println(intArr.length);
        }

        System.out.println("This code must run");  // 실행3
    }

    public void multiCatchChangeOrder() {
        int[] intArr = new int[5];

        try {
            System.out.println(intArr[5]);
        }
        catch (Exception e) {
            System.out.println(intArr.length);
        }
        // 부모 예외 클래스인 Exception 클래스에 대한 catch 블록이 위에 존재하므로 컴파일 에러 발생
        // catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("ArrayIndexOutOfBoundsException occured");
        // }

        System.out.println("This code must run");
    }

    public void multiCatchThreeWithNull() {
        int[] intArr = new int[5];

        try {
            intArr = null;
            System.out.println(intArr[5]);  // NullPointerException 발생
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occured");  // 예외와 관련된 catch 블록이 실행됨
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured");
        } catch (Exception e) {
            System.out.println(intArr.length);
        }
    }

    public void multiNoCatch() {
        int[] intArr = new int[5];

        try {
            intArr = null;
            System.out.println(intArr[5]);  // NullPointerException 발생
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured");
        }
        // Exception catch 블록은 가장 아래에 추가하는 것이 좋음
        catch (Exception e) {
            System.out.println("Some exception occured");
        }
    }
}
