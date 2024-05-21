package Volume1.chapter13;

public class AbstractClassExample {
    public static void main(String[] args) {
        // 컴파일 에러 : 추상 클래스의 객체를 생성할 수 없음
        // MemberManagerAbstract memberManagerAbstract = new MemberManagerAbstract();

        // 추상 클래스 활용 : 상속 관계 캐스팅 + 구현 메서드 호출 + 구현된 메서드 호출
        MemberManagerAbstract memberManager2 = new MemberManagerImpl2();
        memberManager2.removeMember("myName", "01012341234");
        memberManager2.printLog("data");
    }
}
