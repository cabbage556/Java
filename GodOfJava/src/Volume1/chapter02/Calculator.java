package Volume1.chapter02;

public class Calculator {

    /*
        메서드는 여섯 부분으로 나눌 수 있음
            - 제어자(modifier) : 메서드의 특성을 정하는 부분
                - public static
            - 리턴 타입(return type) : 메서드 종료 시 돌려주는 타입
                - void
            - 메서드 이름 : 소괄호 앞에 있는 메서드 이름
                - main
            - 매개변수 목록 : 소괄호 안에 있는 매개 변수의 목록
                - String[] args
            - 예외 목록 : 소괄호와 중괄호 사이에 예외 목록을 선언할 수 있음
                - 이 메서드에는 없음
            - 메서드 내용 : 중괄호 내부 코드들
                - System.out.println("Calculator.main");

        메서드 선언 시 필수적인 것
            - 리턴 타입
            - 메서드 이름
            - 메서드 내용
     */
    public static void main(String[] args) {
        System.out.println("Calculator.main");
    }
}
