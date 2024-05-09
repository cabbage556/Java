package com.cabbage556.OOPforSpringchapter7.aop003;

import org.aspectj.lang.JoinPoint;

// POJO와 XML 기반 AOP - 스프링 프레임워크에 종속되지 않음
//      스프링 프레임워크에 의존하지 않는 POJO
//      어노테이션 기반 AOP에서 사용하던 어노테이션들을 사용하지 않음
public class MyAspect {
    public void before(JoinPoint joinPoint) {
        System.out.println("얼굴 인식 확인. 문을 엽니다.");
    }
}
