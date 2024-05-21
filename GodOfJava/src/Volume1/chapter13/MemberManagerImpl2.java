package Volume1.chapter13;

// MemberManagerAbstract 추상 클래스 상속
//      MemberManagerAbstract 추상 클래스의 추상 메서드를 구현해야 함
public class MemberManagerImpl2 extends MemberManagerAbstract {

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
