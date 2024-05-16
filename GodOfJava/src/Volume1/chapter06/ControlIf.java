package Volume1.chapter06;

public class ControlIf {
    public static void main(String[] args) {
        ControlIf control = new ControlIf();
        control.ifStatement();
    }

    public void ifStatement() {
        // if문 소괄호 안에는 boolean 결과값이 있어야 함
        //      if문 소괄호의 boolean 결과값이 true이면 if문의 문장들이 실행됨
        if (true);
        if (true) System.out.println("It's true");
        if (true)
            System.out.println("It's also true");
        if (false) System.out.println("It's false");
    }
}
