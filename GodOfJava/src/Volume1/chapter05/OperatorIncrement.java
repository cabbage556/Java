package Volume1.chapter05;

public class OperatorIncrement {
    public static void main(String[] args) {
        OperatorIncrement operator = new OperatorIncrement();
        operator.increment();
    }

    public void increment() {
        int intValue = 1;

        // ++ 뒤에 붙이는 경우
        //      변수 참조 후 1을 더함
        // ++ 앞에 붙이는 경우
        //      1을 더한 후 변수 참조
        System.out.println(intValue++);  // 1
        System.out.println(intValue);    // 2
        System.out.println(++intValue);  // 3
        System.out.println(intValue);    // 3
    }
}
