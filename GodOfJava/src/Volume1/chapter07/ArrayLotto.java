package Volume1.chapter07;

public class ArrayLotto {
    public static void main(String[] args) {
        ArrayLotto array = new ArrayLotto();
        array.init();
    }

    public void init() {
        int[] lottoNumbers = new int[7];
        lottoNumbers[0] = 5;
        lottoNumbers[1] = 12;
        lottoNumbers[2] = 23;
        lottoNumbers[3] = 25;
        lottoNumbers[4] = 38;
        lottoNumbers[5] = 41;
        lottoNumbers[6] = 2;

        // ArrayIndexOutOfBoundsException 발생
        //      배열의 크기를 넘는 인덱스에 값을 할당하거나 인덱스를 참조하면 발생
        // lottoNumbers[7] = 2;
        // System.out.println(lottoNumbers[7]);
    }
}
