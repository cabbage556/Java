package Volume1.chapter08;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
        reference.makeMemberObject();
    }

    public void makeMemberObject() {
        // MemberDTO 클래스의 네 가지 생성자를 각각 활용해 객체 4개 생성
        //      네 객체들은 서로 다른 인스턴스 변수 값들을 갖게 됨
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Sangmin");
        MemberDTO dto3 = new MemberDTO("Sangmin", "010xxxxyyyy");
        MemberDTO dto4 = new MemberDTO("Sangmin", "010xxxxyyyy", "god@godofjava.com");
    }
}
