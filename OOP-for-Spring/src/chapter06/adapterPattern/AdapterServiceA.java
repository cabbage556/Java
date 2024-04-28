package chapter06.adapterPattern;

// ServiceA를 위한 어댑터
//      ServiceA의 runServiceA() 메서드를 runService() 라는 동일한 이름으로 호출해서 사용할 수 있게 해줌
public class AdapterServiceA {
    /*
        어댑터 패턴
            객체를 속성으로 만들어 참조하는 디자인 패턴
            어댑터 역할 : 서로 다른 두 인터페이스 사이에 통신이 가능하게 하는 것
            어댑터 예시 : JDBC, JRE
            어댑터 패턴은 개방 폐쇄 원칙(OCP)을 활용한 디자인 패턴임
                JDBC, JRE는 개방 폐쇄 원칙의 예시 중 하나로, JDBC, JRE가 어댑터 역할을 수행함
            한 문장 정리
                "호출되는 쪽의 메서드를 호출하는 쪽의 코드에 대응하도록 중간에 변환기를 통해 호출하는 패턴"
     */
    ServiceA sa1 = new ServiceA();

    // 어댑터 패턴을 적용해 메서드명 통일
    void runService() {
        sa1.runServiceA();
    }
}
