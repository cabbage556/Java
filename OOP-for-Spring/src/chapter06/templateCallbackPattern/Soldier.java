package chapter06.templateCallbackPattern;

// 컨텍스트
//      전략 객체의 사용자/소비자
public class Soldier {
    void runContext(Strategy strategy) {
        System.out.println("전투 시작");
        strategy.runStrategy();
        System.out.println("전투 종료");
    }
}
