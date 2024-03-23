package Volume1.chapter03;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Calculator.main");

        // 기본 생성자로 Calculator 인스턴스 생성
        //      클래스 내부에 생성자가 존재하지 않지만 컴파일 시 기본 생성자가 자동으로 클래스 파일 안에 추가되므로 인스턴스를 생성할 수 있음
        Calculator calc = new Calculator();
        int a = 10, b = 5;
        System.out.println("add = " + calc.add(a, b));
        System.out.println("subtract = " + calc.sub(a, b));
        System.out.println("multiply = " + calc.mul(a, b));
        System.out.println("divide = " + calc.div(a, b));
    }
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }
}
