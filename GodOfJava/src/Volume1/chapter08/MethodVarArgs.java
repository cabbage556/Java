package Volume1.chapter08;

public class MethodVarArgs {
    public static void main(String[] args) {
        MethodVarArgs varArgs = new MethodVarArgs();
        varArgs.calculateNumbersWithArray(new int[] {1, 2, 3, 4, 5});

        // 매개 변수에 값을 넘겨줄 때 0~N개의 값들을 콤마로 구분해 넘겨줄 수 있음
        varArgs.calculateNumbers();
        varArgs.calculateNumbers(1);
        varArgs.calculateNumbers(1, 2);
        varArgs.calculateNumbers(1, 2, 3);
    }

    /*
        임의 개수의 값을 매개 변수에 넘겨주는 방법1 : 매개 변수 타입을 배열로 선언하기
            - 단점 : 배열을 생성해 매개 변수에 전달해야 함
     */
    public void calculateNumbersWithArray(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("total = " + total);
    }

    /*
        임의 개수의 값을 매개 변수에 넘겨주는 방법2 : 매개 변수를 "타입... 매개변수명"으로 선언하기
            알아둘 점
                - 메서드 내부에서 매개 변수는 배열로 인식되므로 매개 변수를 배열처럼 사용할 수 있음
                - 매개 변수에 값을 넘겨줄 때 값들을 배열에 넣지 않아도 됨
            주의할 점
                - 하나의 메서드에 하나만 선언 가능
                - 메서드에 여러 매개 변수를 선언한다면 이 매개 변수는 가장 마지막에 선언해야 함
     */
    public void calculateNumbers(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("total = " + total);
    }
}
