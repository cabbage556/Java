package com.cabbage556.OOPforSpringchapter7.expert002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    스프링 도입의 장점
        Car 객체가 의존하는 Tire 객체를 변경할 때 XML 파일만 변경하면 재컴파일, 재배포하지 않아도 됨
        expert002.xml 파일에서 bean 태그가 id="tire" 속성을 갖도록 bean 태그를 수정하면 됨
 */

public class Driver {
    public static void main(String[] args) {
        // src/main/resources/expert002.xml 기준
        ApplicationContext context =
                new ClassPathXmlApplicationContext("expert002.xml");

        // id="car" 속성을 갖는 bean(Car 객체)을 가져옴
        Car aCar = context.getBean("car", Car.class);

        // id="tire" 속성을 갖는 bean(Tire 객체)을 가져옴
        Tire tire = context.getBean("tire", Tire.class);

        // Tire 객체 의존성 주입
        aCar.setTire(tire);
        System.out.println(aCar.getTireBrand());
    }
}
