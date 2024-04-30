package chapter06.templateCallbackPattern.refac;

// 기존 클라이언트 리팩터링
//      전략 생성 중복 코드를 없앰
public class Client {
    public static void main(String[] args) {
        // 컨텍스트 생성
        Soldier rambo = new Soldier();

        // 익명 전략 객체를 생성하기 위해 필요한 아규먼트 전달
        rambo.runContext("탕탕탕");
        rambo.runContext("챙챙챙");
        rambo.runContext("슝슝슝");
    }
}
