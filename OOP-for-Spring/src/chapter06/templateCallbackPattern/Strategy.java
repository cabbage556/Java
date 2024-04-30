package chapter06.templateCallbackPattern;

// 다양한 전략을 공통 방식으로 사용하기 위한 전략 인터페이스
//      여러 전략들이 같은 이름의 전략 메서드를 구현하게 됨
public interface Strategy {
    // 전략 메서드
    void runStrategy();
}
