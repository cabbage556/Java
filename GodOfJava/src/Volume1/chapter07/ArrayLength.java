package Volume1.chapter07;

public class ArrayLength {
    public static void main(String[] args) {
        ArrayLength array = new ArrayLength();
        // array.printArrayLength();
        array.printArray();
    }

    public void printArrayLength() {
        int[] oneDim = new int[3];
        int[][] twoDim = new int[4][2];

        System.out.println("oneDim.length: " + oneDim.length);
        System.out.println("twoDim.length: " + twoDim.length);        // 4: 1차원 배열 크기
        System.out.println("twoDim[0].length: " + twoDim[0].length);  // 2: 2차원 배열 크기
    }

    public void printArray() {
        // 2 x 3 배열
        int[][] twoDim = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("twoDim.length = " + twoDim.length);
        System.out.println("twoDim[0].length = " + twoDim[0].length);

        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                System.out.println("twoDim[" + i + "][" + j + "] = " + twoDim[i][j]);
            }
        }
    }
}
