package Volume1.chapter12;

public class MemberDTOToString {
    public static void main(String[] args) {
        MemberDTO member = new MemberDTO("Sangmin", "010xxxxyyyy", "godofjava@godofjava.com");

        // 객체를 출력하면 오버라이딩한 toString() 메서드가 호출됨
        //      객체를 쉽게 확인할 수 있게 toString() 메서드를 오버라이딩했음
        System.out.println(member);
    }
}
