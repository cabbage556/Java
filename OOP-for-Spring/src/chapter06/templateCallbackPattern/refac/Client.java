package chapter06.templateCallbackPattern.refac;

// 기존 클라이언트 리팩터링
//      중복 코드를 없앰
public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();
        rambo.runContext("탕탕탕");
        rambo.runContext("챙챙챙");
        rambo.runContext("슝슝슝");
    }
}
