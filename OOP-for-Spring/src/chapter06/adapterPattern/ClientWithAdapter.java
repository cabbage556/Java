package chapter06.adapterPattern;

public class ClientWithAdapter {
    public static void main(String[] args) {
        // 어댑터 생성
        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB asb1 = new AdapterServiceB();

        // 어댑터를 통해 동일한 이름의 메서드로 두 객체의 메서드를 호출함
        asa1.runService();
        asb1.runService();
    }
}
