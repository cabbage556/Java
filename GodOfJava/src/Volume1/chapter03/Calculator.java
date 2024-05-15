package Volume1.chapter03;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Calculator.main");

        // Calculator 객체 / 인스턴스 생성
        //      컴파일 시 기본 생성자가 자동으로 클래스 파일 안에 추가되므로 기본 생성자 사용 가능
        //      생성자를 아무것도 작성하지 않으면 컴파일할 때 클래스 파일 안에 자동으로 기본 생성자가 추가됨
        Calculator calc = new Calculator();

        // 매개변수에 전달하는 값을 변수에 저장하면 유연하게 값을 변경할 수 있음
        int a = 10, b = 5;

        // Calculator 객체를 통해 메서드 호출
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
