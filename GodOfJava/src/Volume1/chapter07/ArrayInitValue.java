package Volume1.chapter07;

public class ArrayInitValue {
    public static void main(String[] args) {
        ArrayInitValue array = new ArrayInitValue();
        // array.primitiveTypes();
        // array.referenceTypes();
        array.referenceTypesSetValue();
    }

    public void primitiveTypes() {
        // 기본 자료형 배열에서 원소의 기본값은 각 자료형의 기본값과 동일하다.
        //      byte, short, int, long: 0 / char: \u0000
        //      float, double: 0.0
        //      boolean: false
        //      지역 변수인 배열은 크기만 정하면 문제가 발생하지 않음
        byte[] byteArray = new byte[1];
        short[] shortArray = new short[1];
        int[] intArray = new int[1];
        long[] longArray = new long[1];
        char[] charArray = new char[1];
        float[] floatArray = new float[1];
        double[] doubleArray = new double[1];
        boolean[] booleanArray = new boolean[1];

        System.out.println("byteArray[0] = " + byteArray[0]);
        System.out.println("shortArray[0] = " + shortArray[0]);
        System.out.println("intArray[0] = " + intArray[0]);
        System.out.println("longArray[0] = " + longArray[0]);
        System.out.println("charArray[0] = " + charArray[0]);
        System.out.println("floatArray[0] = " + floatArray[0]);
        System.out.println("doubleArray[0] = " + doubleArray[0]);
        System.out.println("booleanArray[0] = " + booleanArray[0]);
    }

    public void referenceTypes() {
        // 참조 자료형 배열에서 원소의 기본값은 null이다.
        String[] strings = new String[2];
        ArrayInitValue[] array = new ArrayInitValue[2];

        System.out.println("strings[0] = " + strings[0]); // null
        System.out.println("array[0] = " + array[0]);     // null
    }

    public void referenceTypesSetValue() {
        String[] strings = new String[2];
        strings[0] = "GodOfJava";

        ArrayInitValue[] array = new ArrayInitValue[2];
        array[0] = new ArrayInitValue();

        System.out.println("strings[0] = " + strings[0]); // GodOfJava
        System.out.println("strings[1] = " + strings[1]); // null
        System.out.println("array[0] = " + array[0]);     // Volume1.chapter07.ArrayInitValue@...
        System.out.println("array[1] = " + array[1]);     // null
    }
}
