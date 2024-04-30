package chapter06.adapterPattern;

/*
    어댑터 패턴
        "호출되는 쪽의 메서드를 호출하는 쪽의 코드에 대응하도록 중간에 어댑터(변환기)를 통해 호출하는 패턴"
        객체를 속성으로 만들어 참조하는 디자인 패턴
            어댑터 역할 : 서로 다른 두 인터페이스 사이에 통신이 가능하게 하는 것
            어댑터 예시 : JDBC, JRE
        개방 폐쇄 원칙(OCP)을 활용한 디자인 패턴임
            JDBC와 JRE는 개방 폐쇄 원칙의 예시로, JDBC와 JRE가 어댑터 역할을 수행하는 것
 */

// ServiceA를 위한 어댑터
//      ServiceA의 runServiceA() 메서드를 runService() 라는 동일한 이름으로 호출해서 사용할 수 있게 해줌
public class AdapterServiceA {
    // 합성 : 객체를 속성으로 만들어 참조함
    ServiceA sa1 = new ServiceA();

    // 어댑터 패턴을 적용해 메서드명 통일
    void runService() {
        sa1.runServiceA();
    }
}
