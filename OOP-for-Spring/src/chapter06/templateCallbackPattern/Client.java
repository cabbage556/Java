package chapter06.templateCallbackPattern;

/*
    템플릿 콜백 패턴
        "전략을 익명 내부 클래스로 구현한 전략 패턴"
        전략 패턴의 변형으로 스프링의 DI(의존성 주입)에서 사용하는 특별한 형태의 전략 패턴
            스프링은 리팩터링된 템플릿 콜백 패턴을 DI에서 적극적으로 활용함
        전략 패턴과 모든 것이 동일하지만 전략을 익명 내부 클래스로 정의해서 사용한다는 특징이 있음
        전략 패턴의 일종이므로 개방 폐쇄 원칙(OCP)과 의존 역전 원칙(DIP)이 적용된 디자인 패턴
 */

// 클라이언트
//      익명 전략 객체를 생성해 컨텍스트에 주입
public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();  // 컨텍스트 생성

        // 익명 전략 객체 생성/주입, 컨텍스트 실행
        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("탕탕탕");
            }
        });

        // 익명 전략 객체 생성/주입, 컨텍스트 실행
        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("챙챙챙");
            }
        });

        // 익명 전략 객체 생성/주입, 컨텍스트 실행
        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("슝슝슝");
            }
        });
    }
}
