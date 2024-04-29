package chapter06.templateMethodPattern;

/*
    템플릿 메서드 패턴
        "상위 클래스의 템플릿 메서드에서 하위 클래스가 오버라이딩한 메서드를 호출하는 패턴"
        상위 클래스에 템플릿 메서드, 추상 메서드, 훅 메서드를 두는 패턴
            템플릿 메서드 : 공통 로직을 수행함, 로직 중에서 하위 클래스에서 오버라이딩한 추상 메서드 또는 훅 메서드 호출함
            추상 메서드 : 하위 클래스는 반드시 오버라이딩해야 함
            훅 메서드 : 하위 클래스는 선택적으로 오버라이딩함
        의존 역전 원칙(DIP)을 활용함
 */

public abstract class Animal {
    // 템플릿 메서드
    public void playWithOwner() {
        System.out.println("귀염둥이 이리온~");
        play();
        runSomething();
        System.out.println("잘했어");
    }

    // 추상 메서드
    abstract void play();

    // 훅(갈고리) 메서드
    void runSomething() {
        System.out.println("꼬리 살랑 살랑~");
    }
}
