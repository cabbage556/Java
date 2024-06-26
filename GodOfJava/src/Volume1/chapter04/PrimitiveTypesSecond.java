package Volume1.chapter04;

public class PrimitiveTypesSecond {

    /*
        기본 자료형인 인스턴스 변수의 기본값
            - char를 제외한 나머지 정수 타입 : 0
            - char : '\u0000'
            - float, double : 0.0
            - boolean : false
        기본 자료형인 클래스 변수의 기본값과 같음
     */
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
        System.out.println("byteDefault = " + byteDefault);
        System.out.println("shortDefault = " + shortDefault);
        System.out.println("intDefault = " + intDefault);
        System.out.println("longDefault = " + longDefault);
        System.out.println("floatDefault = " + floatDefault);
        System.out.println("doubleDefault = " + doubleDefault);
        System.out.println("charDefault = " + charDefault);         // '\u0000'
        System.out.println("booleanDefault = " + booleanDefault);   // false
    }
}
