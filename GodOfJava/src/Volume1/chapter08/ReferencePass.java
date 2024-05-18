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

        /*
            기본 자료형은 pass by value로 값을 전달함
                pass by value : 값을 복사해 매개 변수에 전달하는 것
            참조 자료형은 pass by reference로 값을 전달함
                pass by reference : 참조값을 복사해 매개 변수에 전달하는 것

            두 방식 모두 변수의 값을 복사해 전달한다는 것은 동일하다.
         */

        // a : pass by value
        // b : pass by reference
        passByValue(a, b);

        System.out.println("after passByValue");
        System.out.println("a = " + a);  // 10
        System.out.println("b = " + b);  // b
    }

    public void passByValue(int a, String b) {
        a = 20;   // 매개 변수에 새로운 정수값 20을 할당함
        b = "z";  // 매개 변수에 새로운 객체의 참조값을 할당함 : new String("z")와 같음
        System.out.println("in passByValue");
        System.out.println("a = " + a);  // 20
        System.out.println("b = " + b);  // z
    }

    public void callPassByReference() {
        MemberDTO member = new MemberDTO("Sangmin");

        System.out.println("before passByReference");
        System.out.println("member.name = " + member.name);  // Sangmin

        // pass by reference : 변수 member와 매개 변수 member가 동일한 객체를 참조하게 됨
        passByReference(member);

        System.out.println("after passByReferece");
        System.out.println("member.name = " + member.name);  // Sungchoon: passByReference 메서드의 매개 변수를 통해 인스턴스 변수의 값이 수정되었음
    }

    public void passByReference(MemberDTO member) {
        member.name = "Sungchoon";  // 전달 받은 참조값을 통해 인스턴스 변수 name의 값을 수정함
        System.out.println("in passByReference");
        System.out.println("member.name = " + member.name);  // Sungchoon
    }
}
