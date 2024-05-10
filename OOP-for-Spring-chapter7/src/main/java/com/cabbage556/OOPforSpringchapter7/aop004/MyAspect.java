package com.cabbage556.OOPforSpringchapter7.aop004;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
    // Before 어드바이스
    //      POJO와 XML 기반 AOP이므로 AOP 어노테이션을 사용하지 않음
    public void before(JoinPoint joinPoint) {
        System.out.println("얼굴 인식 확인. 문을 엽니다.");
    }

    // After 어드바이스
    //      POJO와 XML 기반 AOP이므로 AOP 어노테이션을 사용하지 않음
    public void lockDoor(JoinPoint joinPoint) {
        System.out.println("외출 확인. 문을 잠급니다.");
    }
}
