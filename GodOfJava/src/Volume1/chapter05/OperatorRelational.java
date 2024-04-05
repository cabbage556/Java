package Volume1.chapter05;

public class OperatorRelational {
    public static void main(String[] args) {
        OperatorRelational operator = new OperatorRelational();
        operator.relational();
    }

    public void relational() {
        int intValue1 = 1;
        int intValue2 = 2;

        // 대소 비교 연산자
        //      boolean 타입을 제외한 모든 기본 자료형에 사용 가능
        System.out.println("intValue1 > intValue2: " + (intValue1 > intValue2));
        System.out.println("intValue1 < intValue2: " + (intValue1 < intValue2));
        System.out.println("intValue1 >= intValue2: " + (intValue1 >= intValue2));
        System.out.println("intValue1 <= intValue2: " + (intValue1 <= intValue2));
    }
}
