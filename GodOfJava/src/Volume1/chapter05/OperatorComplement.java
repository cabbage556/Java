package Volume1.chapter05;

public class OperatorComplement {
    public static void main(String[] args) {
        OperatorComplement operator = new OperatorComplement();
        operator.complement();
    }

    public void complement() {
        // ! 연산자
        //      boolean 타입에만 사용 가능
        //      !true -> false
        //      !false -> true
        boolean flag = true;
        System.out.println(flag);
        System.out.println(!flag);
    }
}
