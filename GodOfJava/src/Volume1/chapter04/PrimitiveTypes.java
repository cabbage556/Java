package Volume1.chapter04;

public class PrimitiveTypes {
    int intDefault1;

    public static void main(String[] args) {
        PrimitiveTypes types = new PrimitiveTypes();
        types.checkBytes();
        types.checkOtherTypes();
        types.checkChar();
        types.checkBoolean();
    }

    public void checkBytes() {
        byte byteMin = -128;  // -128: 1000_0000
        byte byteMax = 127;   //  127: 0111_1111
        System.out.println("byteMin = " + byteMin);  // -128
        System.out.println("byteMax = " + byteMax);  // 127

        byteMin = (byte) (byteMin - 1);  // 1000_0000 - 0000_0001
        byteMax = (byte) (byteMax + 1);  // 0111_1111 + 0000_0001
        System.out.println("byteMin - 1 = " + byteMin);  //  127: 0111_1111
        System.out.println("byteMax + 1 = " + byteMax);  // -128: 1000_0000
    }

    public void checkOtherTypes() {
        short shortMax = 32_767;
        int intMax = 2_147_483_647;

        // long 타입의 경우 값에 L을 붙이는 것이 좋음
        //      값에 L을 붙이지 않으면 int 타입으로 인식하기 때문
        //      기본적으로 자바는 숫자를 int 타입으로 간주하기 때문에 long 타입의 숫자를 명시적으로 지정할 때는 숫자 뒤에 L을 붙여야 함
        //      숫자에 L을 붙이지 않았을 때, 숫자가 int 범위 내에 있다면 문제가 발생하지 않지만, int 범위를 넘는다면 컴파일 에러가 발생함
        long longMax = 9_223_372_036_854_775_807L;

        System.out.println("shortMax = " + shortMax);
        System.out.println("intMax = " + intMax);
        System.out.println("longMax = " + longMax);

        shortMax = (short) (shortMax + 1);
        intMax = intMax + 1;
        longMax = (long) (longMax + 1L);
        System.out.println("shortMax + 1 = " + shortMax);
        System.out.println("intMax + 1 = " + intMax);
        System.out.println("longMax + 1 = " + longMax);
    }

    public void checkChar() {
        // char 값 초기화 방법 중 하나
        char charMin = '\u0000';
        char charMax = '\uffff';
        System.out.println("charMin = [" + charMin + "]");
        System.out.println("charMax = [" + charMax + "]");

        // char 타입은 정수 타입이므로 int 타입으로 형 변환 가능
        int intValue = 'a';
        System.out.println("intValue = [" + intValue + "]");
    }

    public void checkBoolean() {
        boolean flag = true;
        System.out.println("flag = " + flag);

        flag = false;
        System.out.println("flag = " + flag);
    }

    public void defaultValues() {
        // 인스턴스 변수 기본값
        //      값을 지정하지 않아도 사용 가능
        //      기본값이 자동으로 지정됨
        System.out.println("intDefault1 = " + intDefault1);

        // 지역 변수 기본값
        //      지역 변수가 기본 자료형일 경우 기본값이 지정되지 않음
        //      지역 변수가 기본 자료형일 경우 값을 지정하지 않으면 사용할 수 없음
        //      지역 변수를 사용하려면 반드시 초기화해야 함
        int intDefault2;
        // System.out.println("intDefault2 = " + intDefault2);
    }
}
