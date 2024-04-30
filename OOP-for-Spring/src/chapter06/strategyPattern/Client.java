package chapter06.strategyPattern;

/*
    전략 패턴
        "클라이언트가 전략을 생성해 전략을 실행하는 컨텍스트에 주입하는 패턴"
            클라이언트 : 전략 객체를 생성해 컨텍스트에 주입하는 제3자(전략 객체의 공급자)
            전략 : 전략 메서드를 갖는 전략 객체
                전략 객체를 공통된 방식으로 사용하기 위해 인터페이스 사용
            컨텍스트 : 전략 객체를 사용하는 전략 객체의 사용자/소비자
        개방 폐쇄 원칙(OCP)과 의존 역전 원칙(DIP)이 적용된 디자인 패턴
 */

// 클라이언트
//      전략 객체 생성 후 컨텍스트에 주입
public class Client {
    public static void main(String[] args) {
        Strategy strategy = null;
        Soldier rambo = new Soldier();  // 컨텍스트 생성

        // StrategyGun 전략 객체 생성/주입, 컨텍스트 실행
        strategy = new StrategyGun();
        rambo.runContext(strategy);

        // StrategySword 전략 객체 생성/주입, 컨텍스트 실행
        strategy = new StrategySword();
        rambo.runContext(strategy);

        // StrategyBow 전략 객체 생성/주입, 컨텍스트 실행
        strategy = new StrategyBow();
        rambo.runContext(strategy);
    }
}
