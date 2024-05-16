package Volume1.chapter07;

public class ArrayLotto {
    public static void main(String[] args) {
        ArrayLotto array = new ArrayLotto();
        array.init();
    }

    public void init() {
        /*
            int 타입 배열 선언 및 초기화
                배열은 참조 자료형이므로 new를 사용해 초기화할 수 있음
                배열 초기화 시 무조건 배열의 크기를 지정해야 함
                    이후 배열의 크기를 변경할 수 없음
                    이 단점을 보완하기 위해 Collection이 존재함
                모든 기본 자료형과 참조 자료형은 배열로 선언할 수 있음
         */
        int[] lottoNumbers = new int[7];
        lottoNumbers[0] = 5;
        lottoNumbers[1] = 12;
        lottoNumbers[2] = 23;
        lottoNumbers[3] = 25;
        lottoNumbers[4] = 38;
        lottoNumbers[5] = 41;
        lottoNumbers[6] = 2;

        // ArrayIndexOutOfBoundsException 발생
        //      배열에 존재하지 않는 인덱스에 값을 할당하거나 존재하지 않는 인덱스를 참조하면 발생
        // lottoNumbers[7] = 2;
        // System.out.println(lottoNumbers[7]);
    }
}
