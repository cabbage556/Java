package Volume1.chapter05;

public class OperatorComparison {
    public static void main(String[] args) {
        OperatorComparison operator = new OperatorComparison();
        // operator.comparison();
        operator.comparison2();
    }

    public void comparison() {
        int intValue1 = 1;
        int intValue2 = 2;
        int intValue3 = 1;
        System.out.println("intValue1 == intValue2: " + (intValue1 == intValue2));
        System.out.println("intValue1 == intValue3: " + (intValue1 == intValue3));

        System.out.println("intValue1 != intValue2: " + (intValue1 != intValue2));
        System.out.println("intValue1 != intValue3: " + (intValue1 != intValue3));
    }

    public void comparison2() {
        // 기본 자료형의 비교
        //      같은 종류끼리의 비교는 가능
        //          숫자 타입은 숫자 타입끼리 비교 가능
        //          boolean 타입은 boolean 타입끼리 비교 가능
        //      다른 종류끼리의 비교는 불가능
        //          숫자 타입과 boolean 타입 비교 불가능
        // char 타입의 값과 int 타입의 값 비교
        char charValue = 'a';
        System.out.println("'a' == 97: " + (charValue == 97));

        // int 타입의 값과 double 타입의 값 비교
        int intValue = 1;
        double doubleValue = 1.0;
        System.out.println("intValue == doubleValue: " + (intValue == doubleValue));

        // boolean 타입의 값과 boolean 타입의 값 비교
        boolean flag1 = false;
        boolean flag2 = true;
        System.out.println("flag1 == flag2: " + (flag1 == flag2));
        System.out.println("flag1 != flag2: " + (flag1 != flag2));
    }
}
