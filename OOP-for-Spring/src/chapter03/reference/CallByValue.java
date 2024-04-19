package chapter03.reference;

public class CallByValue {
    public static void main(String[] args) {
        int a = 10;

        // Call By Value
        //      변수의 값이 복사되어 할당됨
        //      두 변수는 서로에게 영향을 주지 않음
        int b = a;
        b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
