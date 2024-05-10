package com.cabbage556.OOPforSpringchapter7.aop004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop004.xml");

        Person aBoy = context.getBean("boy", Person.class);
        Person aGirl = context.getBean("girl", Person.class);

        // 지정된 PointCut이 실행되기 전 before() 메서드가 문제 없이 실행됨
        // 지정된 PointCut이 실행된 후 lockDoor() 메서드가 문제 없이 실행됨
        aBoy.runSomething();
        aGirl.runSomething();
    }
}
