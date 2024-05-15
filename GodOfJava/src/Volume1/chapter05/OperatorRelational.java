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
        //      모든 숫자 타입에 사용 가능함
        //      boolean과 참조 자료형에 사용 불가능함
        System.out.println("intValue1 > intValue2: " + (intValue1 > intValue2));
        System.out.println("intValue1 < intValue2: " + (intValue1 < intValue2));
        System.out.println("intValue1 >= intValue2: " + (intValue1 >= intValue2));
        System.out.println("intValue1 <= intValue2: " + (intValue1 <= intValue2));
    }
}
