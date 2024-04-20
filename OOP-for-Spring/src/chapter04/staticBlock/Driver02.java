package chapter04.staticBlock;

public class Driver02 {
    public static void main(String[] args) {
        System.out.println("main() 메서드 시작!");

        // Animal 클래스를 사용하지 않으므로 Animal 클래스가 스태틱 영역에 배치되지 않음
        // 따라서 Animal 클래스의 static 블록이 실행되지 않음
    }
}
