package com.cabbage556.OOPforSpringchapter7.aop005;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    // PointCut 중복 제거
    @Pointcut("execution(* runSomething())")
    private void iampc() {
        // 여기에 코드를 작성해도 의미가 없음
    }

    @Before("iampc()")
    public void before(JoinPoint joinPoint) {
        System.out.println("얼굴 인식 확인. 문을 엽니다.");
    }

    @After("iampc()")
    public void lockDoor(JoinPoint joinPoint) {
        System.out.println("외출 확인. 문을 잠급니다.");
    }
}
