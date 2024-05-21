package Volume1.chapter13;

/*
    추상 클래스
        - abstract 메서드가 하나라도 있으면 그 클래스는 반드시 추상 클래스로 선언해야 함
        - 인터페이스와 마찬가지로 추상 클래스의 객체는 생성 불가능
        - 추상 클래스를 상속한 클래스의 객체는 생성 가능
        - extends 키워드를 사용해 추상 클래스를 상속함
        - 추상 클래스를 상속한 클래스는 추상 클래스에 선언된 모든 abstract 메서드를 구현해야 함
        - 일반 클래스 상속과 마찬가지로 추상 클래스도 단일 상속만 가능함

    추상 클래스에 존재할 수 있는 메서드
        - abstract 메서드 : abstract 키워드를 붙인 메서드
            - 메서드 바디가 없는 메서드에 abstract 키워드를 붙임
            - 인터페이스의 메서드와 같지만 인터페이스의 메서드에는 abstract 키워드를 붙이지 않음
        - static 메서드
        - final 메서드
        - 구현된 메서드
            - 인터페이스와 달리 구현된 메서드가 존재할 수 있음

    추상 클래스 선언 방법 : class 앞에 abstract 키워드 사용(abstract class)

    추상 클래스 활용 : 상속 관계 캐스팅 + 구현 메서드 호출 + 구현된 메서드 호출

    추상 클래스 사용 이유
        - 인터페이스를 사용하다 보면 어떤 메서드는 미리 구현해두어도 문제가 없는 경우가 있음
        - 공통 기능은 미리 구현해 놓으면 개발에 도움이 되는 경우가 많음
        - 이런 경우 추상 클래스를 사용해 공통 기능을 미리 구현해 놓음
 */

// MemberManagerAbstract 추상 클래스 선언
public abstract class MemberManagerAbstract {

    // abstract 메서드 선언
    public abstract boolean addMember(MemberDTO member);
    public abstract boolean removeMember(String name, String phone);
    public abstract boolean updateMember(MemberDTO member);

    // 구현된 메서드
    public void printLog(String data) {
        System.out.println("data = " + data);
    }
}
