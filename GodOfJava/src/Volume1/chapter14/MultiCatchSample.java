package Volume1.chapter14;

public class MultiCatchSample {

    public static void main(String[] args) {
        MultiCatchSample sample = new MultiCatchSample();
        // sample.multiCatch();
        // sample.multiCatchChangeOrder();
        // sample.multiCatchThreeWithNull();
        sample.multiNoCatch();
    }

    public void multiCatch() {
        int[] intArr = new int[5];

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
        // Exception 클래스는 모든 예외 클래스의 부모 클래스
        // 자식 예외 클래스가 Exception 클래스 아래에서 catch하면 모든 예외를 Exception 클래스가 catch하게 됨
        // 자식 예외 클래스가 예외를 처리할 수 없게 되므로 컴파일 에러 발생
        catch (Exception e) {
            System.out.println(intArr.length);
        }
        // catch (ArrayIndexOutOfBoundsException e) {   // 컴파일 에러 발생
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
            // 예외와 관련된 catch 블록이 실행됨
            //      NullPointerException이 발생하므로 NullPointerException 예외를 처리하는 catch 블록이 실행됨
            System.out.println("NullPointerException occured");  // 실행
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
        //      모든 예외 클래스들의 부모 클래스이므로 예상치 못한 예외를 모두 처리할 수 있게 됨
        //      예외가 발생했을 때 처리하지 못하면 스레드가 종료되므로 중요함
        catch (Exception e) {
            System.out.println("Some exception occured");
        }
    }
}
