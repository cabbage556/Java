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

        // 배열 길이 : length
        System.out.println("oneDim.length: " + oneDim.length);
        System.out.println("twoDim.length: " + twoDim.length);        // 배열 크기 : 4
        System.out.println("twoDim[0].length: " + twoDim[0].length);  // 1차원 배열 크기 : 2
    }

    public void printArray() {
        // 2 x 3 배열
        int[][] twoDim = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("twoDim.length = " + twoDim.length);         // 배열 크기 : 2
        System.out.println("twoDim[0].length = " + twoDim[0].length);   // 1차원 배열 크기 : 3

        // for문으로 배열 길이만큼 반복
        //      배열 길이를 하드 코딩하는 것보다 length를 사용하는 것이 유연함
        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                System.out.println("twoDim[" + i + "][" + j + "] = " + twoDim[i][j]);
            }
        }
    }
}
