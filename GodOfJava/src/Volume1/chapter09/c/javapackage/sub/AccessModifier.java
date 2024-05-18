package Volume1.chapter09.c.javapackage.sub;

/*
    접근 제어자
        - 클래스, 메서드, 인스턴스 변수, 클래스 변수에 선언 가능
        - public : 어디서든 접근 가능
        - protected : 같은 패키지에 있거나 상속받은 경우에만 접근 가능
        - package-private(default) : 아무 접근 제어자를 적지 않는 것을 말함, 같은 패키지 내에 있을 때만 접근 가능
        - private : 해당 클래스 내부에서만 접근 가능

    메서드에 접근 제어자를 사용하는 경우
        - 어떤 메서드를 해당 클래스 내부에서만 사용할 수 있게 하려면 메서드에 private 접근 제어자를 붙여서 다른 클래스에서 접근할 수 없게 함

    변수에 접근 제어자를 사용하는 경우
        - 변수에 직접 접근해 변수의 값을 변경하지 못하게 하려면 변수에 private 접근 제어자를 붙이고 public 메서드를 통해 변수의 값을 변경하거나 조회하게 함
 */

public class AccessModifier {
    public void publicMethod() {
        System.out.println("AccessModifier.publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("AccessModifier.protectedMethod");
    }

    void packagePrivateMethod() {
        System.out.println("AccessModifier.packagePrivateMethod");
    }

    private void privateMethod() {
        System.out.println("AccessModifier.privateMethod");
    }
}
