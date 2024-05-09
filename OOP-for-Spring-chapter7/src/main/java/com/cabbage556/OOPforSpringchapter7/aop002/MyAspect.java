package com.cabbage556.OOPforSpringchapter7.aop002;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
    PointCut : 타깃 클래스의 타깃 메서드 지정자
        횡단 관심사를 적용할 타깃 메서드를 선택하는 지시자의 역할을 하는 것

    PointCut에는 정규식과 AspectJ 표현식을 사용할 수 있음
        [접근제한자패턴] 리턴타입패턴 [패키지&클래스패턴] 메서드이름패턴(파라미터패턴) [throws 예외패턴]

    아래에서 PointCut은 * runSomething()가 됨
    @Before(...)의 의미 : before() 메서드를 PointCut 메서드를 실행하기 전에 실행하라는 것
 */
/*
    JoinPoint : Aspect 적용이 가능한 모든 지점
        PointCut : JoinPoint의 부분 집합
        Aspect를 적용할 수 있는 지점 중 일부가 PointCut이 되므로 PointCut은 JoinPoint의 부분 집합이 됨

    스프링 AOP에서 광의의 JoinPoint : 스프링 프레임워크가 관리하는 모든 빈의 메서드
        Aspect 적용이 가능한 모든 지점을 말함

    스프링 AOP에서 협의의 JoinPoint : 호출된 객체의 메서드
        aBoy.runSomething() 호출 -> JoinPoint : aBoy 객체의 runSomething() 메서드
        aGirl.runSomething() 호출 -> JoinPoint : aGirl 객체의 runSomething() 메서드
 */
/*
    Advice : 언제, 무엇을 적용할지를 정의한 메서드
        PointCut에 적용할 로직 + 시기

    아래 코드에서 Advice는 지정된 PointCut이 실행되기 전에 before() 메서드를 실행하라는 것이 됨
        로직 : before() 메서드
        시기 : PointCut 실행 전
 */
/*
    Aspect : 여러 개의 Advice와 여러 개의 PointCut의 결합체
        Aspect = Advice들 + PointCut들
            Advice : 언제, 무엇을
            PointCut : 어디에
            Aspect : 언제, 어디에, 무엇을

    아래 코드에서 Aspect는 지정된 PointCut인 runSomething() 메서드가 실행되기 전에 before() 메서드를 실행하라는 것이 됨
 */
/*
    Advisor : 하나의 Advice와 하나의 PointCut의 결합체
        스프링이 발전함에 따라 여러 개의 Advice와 여러 개의 PointCut을 다양하게 조합해서 사용할 수 있는 Aspect가 등장하였음
        Aspect의 등장으로 Advisor는 스프링 버전이 올라감에 따라 더이상 사용하지 않기를 권고하는 기능임
 */

// @Aspect : 스프링 AOP에서 이 클래스를 사용함
@Aspect
public class MyAspect {

    // @Before : 대상 메서드 실행 전 이 메서드를 실행함
    @Before("execution(* runSomething())")
    public void before(JoinPoint joinPoint) {  // 횡단 관심사를 실행하는 before() 메서드
        System.out.println("얼굴 인식 확인. 문을 엽니다.");
    }
}
