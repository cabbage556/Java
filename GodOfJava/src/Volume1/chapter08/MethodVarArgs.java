package Volume1.chapter08;

public class MethodVarArgs {
    public static void main(String[] args) {
        MethodVarArgs varArgs = new MethodVarArgs();
        varArgs.calculateNumbersWithArray(new int[] {1, 2, 3, 4, 5});

        varArgs.calculateNumbers();
        varArgs.calculateNumbers(1);
        varArgs.calculateNumbers(1, 2);
        varArgs.calculateNumbers(1, 2, 3);
    }

    public void calculateNumbersWithArray(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("total = " + total);
    }

    // 임의 개수의 매개 변수를 넘겨주는 방법
    //      "타입...매개변수명"으로 사용 -> 메서드 내부에서 배열로 간주됨
    //      매개 변수에 값을 넘겨줄 때 배열에 넣지 않아도 됨
    //      주의할 점
    //          1. 하나의 메서드에 하나만 선언 가능
    //          2. 여러 매개 변수가 있다면 가장 마지막에 선언해야 함
    public void calculateNumbers(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("total = " + total);
    }
}
