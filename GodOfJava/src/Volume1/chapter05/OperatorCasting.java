package Volume1.chapter05;

public class OperatorCasting {
    public static void main(String[] args) {
        OperatorCasting operator = new OperatorCasting();
        // operator.casting();
        operator.casting2();
    }

    // 캐스팅
    //      캐스팅을 명시하지 않음: 범위가 작은 타입 -> 범위가 큰 타입
    //      캐스팅을 명시함: 범위가 큰 타입 -> 범위가 작은 타입
    //          범위가 큰 타입에서 범위가 작은 타입으로 캐스팅하는 경우 예상치 못한 값이 할당될 수 있으므로 주의해야 함
    public void casting() {
        byte byteValue = 127;
        short shortValue = byteValue;  // 캐스팅을 명시하지 않음

        shortValue++;
        System.out.println("shortValue = " + shortValue); // 128

        byteValue = (byte) shortValue;  // 캐스팅을 명시함
        System.out.println("byteValue = " + byteValue); // -128: short에서 byte로 변환하므로 앞 1바이트가 잘려 나가 -128이 됨
    }

    public void casting2() {
        short shortValue = 256; // 2^8

        // 예상치 못한 값이 할당됨
        //      0: 앞 1바이트가 잘려나가 0이 됨
        byte byteValue = (byte) shortValue;
        System.out.println("byteValue = " + byteValue);

        shortValue = 255;

        // 예상치 못한 값이 할당됨
        //      -1: 앞 1바이트가 잘려나가 -1이 됨
        byteValue = (byte) shortValue;
        System.out.println("byteValue = " + byteValue); //
    }
}
