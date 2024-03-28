package Volume1.chapter13;

// implements 키워드: 인터페이스를 구현한다는 의미의 키워드
//      여러 인터페이스를 구현할 수 있음(상속은 단일 상속만 가능)
public class MemberManagerImpl implements MemberManager {
    // 인터페이스를 구현하는 경우 인터페이스에 선언한 메서드들을 모두 구현해야 함
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
