package Volume1.chapter13;

// 추상 클래스는 extends 키워드를 사용해 상속함
// 추상 클래스는 클래스이므로 단일 상속만 가능함
public class MemberManagerImpl2 extends MemberManagerAbstract {
    // abstract 메서드를 구현해야 함
    //      abstract 메서드는 메서드 바디가 없음
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
