package Volume1.chapter09.c.javapackage.sub;

// 접근 제어자
//      클래스, 메서드, 인스턴스 변수, 클래스 변수에 선언 가능
//      public: 어느 곳에서든 접근 가능
//      protected: 같은 패키지에 있거나 상속받은 경우에만 접근 가능
//      package-private: 아무 접근 제어자를 적지 않는 경우로, 같은 패키지 내에 있을 때만 접근 가능
//      private: 해당 클래스 내부에서만 접근 가능

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
