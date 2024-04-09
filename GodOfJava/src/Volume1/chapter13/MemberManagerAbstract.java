package Volume1.chapter13;

// 추상 클래스
//      abstract 메서드가 하나라도 있을 때 사용함
//      class 앞에 abstract 키워드 사용
//      바디가 없는 메서드에는 abstract 키워드 사용
//      인터페이스와 달리 구현되어 있는 메서드가 존재할 수 있음
public abstract class MemberManagerAbstract {
    // abstract 메서드 선언
    //      메서드 바디가 없음
    public abstract boolean addMember(MemberDTO member);
    public abstract boolean removeMember(String name, String phone);
    public abstract boolean updateMember(MemberDTO member);

    // 구현되어 있는 메서드
    public void printLog(String data) {
        System.out.println("data = " + data);
    }
}
