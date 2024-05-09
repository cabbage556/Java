package com.cabbage556.OOPforSpringchapter7.aop002;

// 스프링 AOP를 적용하기 위해 인터페이스 기반으로 수정함
//      스프링 AOP가 인터페이스 기반으로 동작하기 때문
public class Girl implements Person {
    @Override
    public void runSomething() {
        // Aspect로부터 횡단 관심사가 런타임에 주입됨
        //      스프링 AOP가 런타임 기반이기 때문

        // 스프링 AOP를 적용함으로써 핵심 관심사만 남게 됨
        //      횡단 관심사는 제외되었음
        //      추가 개발과 유지보수가 편리해짐
        System.out.println("요리를 한다.");
    }
}
