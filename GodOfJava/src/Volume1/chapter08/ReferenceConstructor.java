package Volume1.chapter08;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
        reference.makeMemberObject();
    }

    public void makeMemberObject() {
        // 네 가지 생성자를 활용해 객체 생성
        //      객체들은 서로 다른 속성 값들을 갖게 됨
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Sangmin");
        MemberDTO dto3 = new MemberDTO("Sangmin", "010xxxxyyyy");
        MemberDTO dto4 = new MemberDTO("Sangmin", "010xxxxyyyy", "god@godofjava.com");
    }
}
