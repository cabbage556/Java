package com.cabbage556.OOPforSpringchapter7.aop002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    AOP : 로직(코드) 주입
        로직이 위치하는 곳 : 메서드 내부
        메서드에 핵심 관심사만 남기기 위해 횡단 관심사를 메서드로부터 분리할 수 있음
        횡단 관심사는 Aspect를 사용해 분리하고, 런타임에 횡단 관심사를 주입함

    스프링 AOP의 핵심
        1. 인터페이스 기반이다.
            - 횡단 관심사를 주입 받을 객체는 인터페이스를 구현해야 함
        2. 프록시 기반이다.
            - 횡단 관심사를 주입 받은 객체의 메서드를 호출하면 프록시 패턴으로 동작해 프록시를 통해 실제 메서드를 호출하게 됨
        3. 런타임 기반이다.
            - 런타임에 횡단 관심사가 주입됨
 */

public class Start {
    public static void main(String[] args) {
        // src/main/resources 기준
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop002.xml");

        Person aBoy = context.getBean("boy", Person.class);
        Person aGirl = context.getBean("girl", Person.class);

        // 프록시 패턴으로 runSomething() 메서드를 호출하게 됨
        //      스프링 AOP는 프록시 기반이기 때문
        aBoy.runSomething();
        aGirl.runSomething();
    }
}
