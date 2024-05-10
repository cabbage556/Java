package com.cabbage556.OOPforSpringchapter7.aop005;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop005.xml");

        Person aBoy = context.getBean("boy", Person.class);
        Person aGirl = context.getBean("girl", Person.class);

        aBoy.runSomething();
        aGirl.runSomething();
    }
}
