package Volume1.chapter08;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass reference = new ReferencePass();
        // reference.callPassByValue();
        reference.callPassByReference();
    }

    public void callPassByValue() {
        int a = 10;
        String b = "b";

        System.out.println("before passByValue");
        System.out.println("a = " + a);  // 10
        System.out.println("b = " + b);  // b

        // 기본 자료형: pass by value
        // 참조 자료형: pass by reference
        passByValue(a, b);

        System.out.println("after passByValue");
        System.out.println("a = " + a);  // 10
        System.out.println("b = " + b);  // b
    }

    public void passByValue(int a, String b) {
        a = 20;
        b = "z";  // 매개 변수를 새로운 객체로 대체하면 새로운 객체의 참조값이 할당됨
        System.out.println("in passByValue");
        System.out.println("a = " + a);  // 20
        System.out.println("b = " + b);  // z
    }

    public void callPassByReference() {
        MemberDTO member = new MemberDTO("Sangmin");

        System.out.println("before passByReference");
        System.out.println("member.name = " + member.name);  // Sangmin

        passByReference(member);

        System.out.println("after passByReferece");
        System.out.println("member.name = " + member.name);  // Sungchoon: passByReference 메서드의 매개 변수를 통해 인스턴스 변수의 값이 수정되었음
    }

    public void passByReference(MemberDTO member) {
        member.name = "Sungchoon";  // 전달 받은 참조값을 통해 인스턴스 변수의 값을 수정함
        System.out.println("in passByReference");
        System.out.println("member.name = " + member.name);  // Sungchoon
    }
}
