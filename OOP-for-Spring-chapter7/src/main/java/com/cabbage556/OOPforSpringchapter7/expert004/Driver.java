package com.cabbage556.OOPforSpringchapter7.expert004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("expert004.xml");

        // id="car" 속성을 갖는 bean을 가져옴
        Car aCar = context.getBean("car", Car.class);
        System.out.println(aCar.getTireBrand());
    }
}
