package Volume1.chapter04;

public class PrimitiveTypesSecond {
    byte byteDefault;
    short shortDefault;
    int intDefault;
    long longDefault;
    float floatDefault;
    double doubleDefault;
    char charDefault;
    boolean booleanDefault;

    public static void main(String[] args) {
        PrimitiveTypesSecond second = new PrimitiveTypesSecond();
        second.defaultValues();
    }

    public void defaultValues() {
        // 인스턴스 변수의 기본값 확인
        System.out.println("byteDefault = " + byteDefault);
        System.out.println("shortDefault = " + shortDefault);
        System.out.println("intDefault = " + intDefault);
        System.out.println("longDefault = " + longDefault);
        System.out.println("floatDefault = " + floatDefault);
        System.out.println("doubleDefault = " + doubleDefault);
        System.out.println("charDefault = " + charDefault);  // '\u0000'
        System.out.println("booleanDefault = " + booleanDefault);  // false
    }
}
