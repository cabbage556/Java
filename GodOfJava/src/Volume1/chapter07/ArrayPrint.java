package Volume1.chapter07;

public class ArrayPrint {
    public static void main(String[] args) {
        ArrayPrint array = new ArrayPrint();
        array.printStringArray();
        array.printPrimitiveArray();
    }

    public void printStringArray() {
        System.out.println("strings = " + new String[0]);

        // 출력 결과
        // strings = [Ljava.lang.String;@66d33a
        //      [L: "["은 객체가 배열임을 나타냄, "L"은 배열이 참조 자료형 배열임을 나타냄
        //      java.lang.String: 해당 배열이 어떤 타입의 배열인지를 나타냄
        //      @66d33a: 객체의 고유번호를 나타냄
    }

    public void printPrimitiveArray() {
        // 기본 자료형의 배열을 출력하면 대괄호 뒤에 해당 타입을 대표하는 문자가 출력된다.
        //      long 타입 배열의 경우: J 사용 -> 참조 자료형 배열과 구분하기 위해
        //      boolean 타입 배열의 경우: Z 사용 -> byte 타입이 B를 사용하므로
        System.out.println("byteArray = " + new byte[1]);        // [B@...
        System.out.println("shortArray = " + new short[1]);      // [S@...
        System.out.println("intArray = " + new int[1]);          // [I@...
        System.out.println("longArray = " + new long[1]);        // [J@...
        System.out.println("charArray = " + new char[1]);        // [C@...
        System.out.println("floatArray = " + new float[1]);      // [F@...
        System.out.println("doubleArray = " + new double[1]);    // [D@...
        System.out.println("booleanArray = " + new boolean[1]);  // [Z@...
    }
}
