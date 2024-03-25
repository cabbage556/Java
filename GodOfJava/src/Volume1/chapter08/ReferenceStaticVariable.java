package Volume1.chapter08;

public class ReferenceStaticVariable {
    static String name;  // 클래스 변수: 모든 객체가 하나의 클래스 변수를 참조함

    public ReferenceStaticVariable() {}

    public ReferenceStaticVariable(String name) {
        // 객체 생성 시 클래스 변수 name의 값을 설정함
        //      마지막으로 객체를 생성할 때 전달한 name 매개 변수의 값이 클래스 변수에 할당됨
        this.name = name;
    }

    public static void main(String[] args) {
        ReferenceStaticVariable reference = new ReferenceStaticVariable();
        reference.checkName();
    }

    public void checkName() {
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("Sangmin");
        System.out.println(reference1.name); // Sangmin

        // reference2 객체를 생성할 때 "Sungchoon"을 전달하므로, 클래스 변수 name의 값이 "Sungchoon"이 됨
        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("Sungchoon");
        System.out.println(reference1.name); // Sungchoon
    }
}
