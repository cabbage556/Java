package Volume1.chapter13;

// 인터페이스
//      실제 코드는 만들지 않더라도 어떤 메서드들이 있어야 하는지를 정의할 때 인터페이스 사용
//      interface 키워드 사용
public interface MemberManager {
    // 인터페이스 내부에 선언한 메서드들은 바디가 존재하면 안 됨
    public boolean addMember(MemberDTO member);
    public boolean removeMember(String name, String phone);
    public boolean updateMember(MemberDTO member);
}
