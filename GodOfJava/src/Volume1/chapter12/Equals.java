package Volume1.chapter12;

public class Equals {
    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalsMethod();
        thisObject.equalsMethod2();
    }

    /*
        ==, != 연산자를 참조 자료형에 대해 사용하면 객체의 주소값을 비교함
        equals() 메서드
            - 두 객체를 비교할 때 사용해야 하는 메서드
            - equals() 메서드를 오버라이딩해서 두 객체를 적절하게 비교할 수 있음
            - 오버라이딩하지 않은 equals() 메서드는 두 객체에 대한 hashCode() 메서드의 리턴값을 비교함
        hashCode() 메서드
            - 기본적으로 객체의 메모리 주소를 16진수로 리턴함
            - 만약 어떤 두 객체가 서로 동일하다면 두 객체에 대한 hashCode() 메서드의 리턴값은 무조건 동일해야 함
            - 오버라이딩한 equals() 메서드가 두 객체에 대해 true를 리턴한다면 두 객체에 대한 hashCode() 메서드의 리턴값도 동일하도록 오버라이딩해야 함
     */

    public void equalsMethod() {
        // 두 객체는 서로 다른 객체이므로 두 객체의 주소값은 서로 다름
        MemberDTO member1 = new MemberDTO("Sangmin", null, null);
        MemberDTO member2 = new MemberDTO("Sangmin", null, null);

        // 두 객체의 주소값이 서로 다르고 두 객체의 주소값을 비교하므로 else문이 실행됨
        if (member1 == member2) {
            System.out.println("member1 and member2 is same");
        } else {
            System.out.println("member1 and member2 is different");
        }
    }

    public void equalsMethod2() {
        MemberDTO member1 = new MemberDTO("Sangmin", null, null);
        MemberDTO member2 = new MemberDTO("Sangmin", null, null);

        // if문이 실행됨
        //      오버라이딩한 equals() 메서드가 호출됨
        //      두 객체의 인스턴스 변수들의 값이 모두 같기 때문에 오버라이딩한 로직에 따라 true를 리턴함
        if (member1.equals(member2)) {
            System.out.println("member1 and member2 is same");
        } else {
            System.out.println("member1 and member2 is different");
        }
    }
}
