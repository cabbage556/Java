package Volume1.chapter07;

public class ArrayNewFor {
    public static void main(String[] args) {
        ArrayNewFor array = new ArrayNewFor();
        // array.oneDimNewFor();
        array.twoDimNewFor();
    }

    public void oneDimNewFor() {
        int[] oneDim = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // JDK 5부터 Collection을 처리할 때 for 루프를 편리하게 사용할 수 있게 되었음
        //      oneDim 배열의 0번 인덱스부터 마지막 인덱스에 위치한 값이 순서대로 data에 할당됨
        for (int data : oneDim) {
            System.out.println("data = " + data);
        }
    }

    public void twoDimNewFor() {
        int[][] twoDim = {
                {1, 2, 3},
                {4, 5, 6}
        };
        for (int[] oneDim : twoDim) {
            for (int data : oneDim) {
                System.out.println("data = " + data);
            }
        }
    }
}
