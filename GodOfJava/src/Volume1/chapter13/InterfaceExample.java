package Volume1.chapter13;

public class InterfaceExample {
    public static void main(String[] args) {
        // 컴파일 에러 발생
        //      인터페이스의 객체를 생성할 수 없음
        // MemberManager memberManager = new MemberManager();

        // 인터페이스 활용
        //      상속 관계에 있는 클래스의 형 변환
        //      상속 관계에 따라 MemberManagerImpl 객체는 MemberManager 타입의 변수에 담을 수 있음
        //      memberManager 변수를 통해 MemberManager의 메서드를 호출하면 실제로는 MemberManagerImpl 클래스에서 구현한 메서드가 호출됨
        // MemberManager memberManager = new MemberManagerImpl();

        // 추상 클래스 활용
        //      인터페이스와 동일함
        MemberManagerAbstract memberManager = new MemberManagerImpl2();
    }
}
