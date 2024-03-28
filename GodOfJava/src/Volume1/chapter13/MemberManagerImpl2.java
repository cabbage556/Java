package Volume1.chapter13;

// 인터페이스와 달리 추상 클래스는 extends 키워드를 사용해 상속함
// 인터페이스와 달리 추상 클래스는 단일 상속만 가능함
public class MemberManagerImpl2 extends MemberManagerAbstract {
    // 바디가 없는 abstract 메서드를 구현해야 함
    @Override
    public boolean addMember(MemberDTO member) {
        return false;
    }

    @Override
    public boolean removeMember(String name, String phone) {
        return false;
    }

    @Override
    public boolean updateMember(MemberDTO member) {
        return false;
    }
}
