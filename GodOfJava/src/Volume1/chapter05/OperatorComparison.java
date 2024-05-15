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
        /*
            등가 비교 연산자는 모든 타입(기본 자료형, 참조 자료형)에 사용 가능함
                - 기본 자료형은 같은 종류끼리 비교 가능
                    - 실제 타입이 다르더라도 숫자끼리 비교 가능
                    - boolean은 boolean끼리 비교 가능
                - 기본 자료형은 숫자와 boolean 비교 불가능
                - 참조 자료형은 주소값을 비교함
         */

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
