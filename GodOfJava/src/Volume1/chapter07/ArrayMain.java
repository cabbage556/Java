package Volume1.chapter07;

public class ArrayMain {
    public static void main(String[] args) {
        // main 메서드 실행 시 args 매개 변수로 넘겨준 값을 순회하기
        if (args.length > 0) {
            for (String arg : args) {
                System.out.println("arg = " + arg);
            }
        }
    }
}
