package Volume1.chapter12;

public class Equals {
    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalsMethod();
        thisObject.equalsMethod2();
    }

    public void equalsMethod() {
        // 두 객체는 서로 다른 객체이므로, 주소값이 서로 다름
        MemberDTO member1 = new MemberDTO("Sangmin", null, null);
        MemberDTO member2 = new MemberDTO("Sangmin", null, null);

        // 두 객체의 주소값을 비교하므로 else문이 실행됨
        if (member1 == member2) {
            System.out.println("member1 and member2 is same");
        } else {
            System.out.println("member1 and member2 is different");
        }
    }

    public void equalsMethod2() {
        MemberDTO member1 = new MemberDTO("Sangmin", null, null);
        MemberDTO member2 = new MemberDTO("Sangmin", null, null);

        // MemberDTO 클래스에서 오버라이딩한 equals() 메서드가 호출됨
        if (member1.equals(member2)) {
            System.out.println("member1 and member2 is same");
        } else {
            System.out.println("member1 and member2 is different");
        }
    }
}
