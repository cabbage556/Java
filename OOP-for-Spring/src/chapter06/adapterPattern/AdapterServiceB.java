package chapter06.adapterPattern;

// ServiceB를 위한 어댑터
//      ServiceB의 runServiceB() 메서드를 runService() 라는 동일한 이름으로 호출해서 사용할 수 있게 해줌
public class AdapterServiceB {
    ServiceB sb1 = new ServiceB();

    // 어댑터 패턴을 적용해 메서드명 통일
    void runService() {
        sb1.runServiceB();
    }
}
