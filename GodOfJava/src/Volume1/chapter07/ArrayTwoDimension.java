package Volume1.chapter07;

public class ArrayTwoDimension {
    public static void main(String[] args) {
        ArrayTwoDimension array = new ArrayTwoDimension();
        array.twoDimensionArray();
    }

    public void twoDimensionArray() {
        // 2차원 int 배열 선언 및 초기화
        //      1차원 배열 크기 고정, 2차원 배열 크기 고정
        //      twoDim: int[][]
        //      twoDim[0]: int[]
        //      twoDim[0][0]: int 값
        int[][] twoDim = new int[2][3];  // 1차원 배열 크기: 2, 2차원 배열 크기: 3
        twoDim[0][0] = 1;
        twoDim[0][1] = 1;
        twoDim[0][2] = 1;
        twoDim[1][0] = 4;
        twoDim[1][1] = 5;
        twoDim[1][2] = 6;

        // 2차원 int 배열 선언 및 초기화
        //      1차원 배열 크기 고정, 2차원 배열 크기 가변
        int[][] twoDim2 = new int[2][];  // 1차원 배열 크기: 2
        twoDim2[0] = new int[3];         // 첫 번째 2차원 배열 크기: 3
        twoDim2[1] = new int[2];         // 두 번째 2차원 배열 크기: 2

        // 2차원 int 배열 선언 및 초기화: 중괄호 사용
        //      첫 번째 2차원 배열 선언 및 초기화 방식과 같음
        int[][] twoDim3 = {
                {1, 2, 3},
                {4, 5, 6}
        };
    }
}
