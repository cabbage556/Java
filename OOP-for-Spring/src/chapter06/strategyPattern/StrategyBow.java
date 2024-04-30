package chapter06.strategyPattern;

// 전략 객체
//      전략 메서드를 가지고 있음
public class StrategyBow implements Strategy {
    // 전략 메서드
    @Override
    public void runStrategy() {
        System.out.println("슝슝슝");
    }
}
