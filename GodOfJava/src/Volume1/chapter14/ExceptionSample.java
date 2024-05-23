package Volume1.chapter14;

/*
    자바에서 예외
        - 예상했든, 예상하지 못했든 예외적인 일이 발생하면 "예외"라는 것이 던져짐
        - 예상한 일 또는 예상치 못한 일이 발생할 것을 예방하기 위해 안전장치를 두어야 함

    try-catch를 사용해 예외가 발생했을 때 예외를 처리할 수 있음
        - 예외가 발생하지 않도록 개발하는 것이 우선
        - 하지만 예외가 발생하지 않도록 완벽하게 개발하는 것은 어려움

    try-catch
        - try 블록 내부에 예외가 발생할 수 있는 문장들을 위치시킴
        - try 블록 내부에서 예외가 발생했을 때 catch 블록이 예외를 처리함

    try-catch에서 예외가 발생하지 않는 경우
        - try 블록 내부의 모든 문장이 실행됨
        - catch 블록 내부의 문장들은 실행되지 않음
        - try-catch 이후 문장들이 실행됨

    try-catch에서 예외가 발생하는 경우
        - try 블록 내부에서 예외가 발생한 문장 아래에 위치한 문장들은 실행되지 않음
        - catch 블록 내부 문장들이 모두 실행됨
        - catch 블록 내부 문장들이 모두 실행되면 catch 블록을 빠져나와 try-catch 이후 문장들이 실행됨
 */

public class ExceptionSample {

    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        // sample.arrayOutOfBounds();
        sample.arrayOutOfBoundsTryCatch();
    }

    public void arrayOutOfBounds() {
        int[] intArr = new int[5];

        // 메서드 실행 중 ArrayIndexOutOfBoundsException 발생
        System.out.println(intArr[5]);
    }

    public void arrayOutOfBoundsTryCatch() {
        int[] intArr = new int[5];

        try {
            System.out.println(intArr[5]);              // 실행1 : 예외 발생
            System.out.println("This code should run"); // 실행되지 않음
        } catch (Exception e) {
            System.err.println("Exception occured");    // 실행2 : catch 내부에서 발생한 예외를 처리함
        }
        System.out.println("This code must run");       // 실행3
    }
}
