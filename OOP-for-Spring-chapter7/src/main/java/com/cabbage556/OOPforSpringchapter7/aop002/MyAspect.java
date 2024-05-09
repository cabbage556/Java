package com.cabbage556.OOPforSpringchapter7.aop002;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// @Aspect : 스프링 AOP에서 이 클래스를 사용함
@Aspect
public class MyAspect {

    // @Before : 대상 메서드 실행 전 이 메서드를 실행함
    @Before("execution(* runSomething())")
    public void before(JoinPoint joinPoint) {
        System.out.println("얼굴 인식 확인. 문을 엽니다.");
    }
}
