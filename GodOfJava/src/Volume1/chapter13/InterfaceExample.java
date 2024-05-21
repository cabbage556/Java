package Volume1.chapter13;

public class InterfaceExample {
    public static void main(String[] args) {
        // 컴파일 에러 발생 : 인터페이스의 객체를 생성할 수 없음
        // MemberManager memberManager = new MemberManager();

        // 인터페이스 활용 : 상속 관계 캐스팅 + 구현 메서드 호출
        MemberManager memberManager = new MemberManagerImpl();
        memberManager.removeMember("myName", "01012341234");

    }
}
