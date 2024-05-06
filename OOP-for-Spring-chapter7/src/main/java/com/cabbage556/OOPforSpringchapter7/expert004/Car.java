package com.cabbage556.OOPforSpringchapter7.expert004;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    /*
        @Autowired를 통한 속성 주입
            속성의 setter 메서드 없이 스프링 설정 파일(XML)을 통해 속성에 대한 의존성을 주입 받음
            스프링 설정 파일을 보고 자동으로 속성의 setter 메서드에 해당하는 역할을 담당함
        @Autowired를 통한 속성 매칭 규칙
            1. type을 구현한 빈이 있는가?
                아니오 -> No matching bean 에러
                예 -> 다음 단계
            2. 빈이 한 개인가?
                아니오 -> 다음 단계
                예 -> 유일한 빈을 객체에 할당함
            3. id가 일치하는 하나의 빈이 있는가?
                아니오 -> No unique bean 에러
                예 -> 유일한 빈을 객체에 할당함
        @Autowired를 통한 속성 매칭은 type 기준 매칭을 id 기준 매칭보다 우선시함
            만약 같은 타입을 구현한 클래스가 여러 개라면 bean 태그의 id 속성으로 구분해서 속성을 매칭하게 됨
     */
    @Autowired
    Tire tire;

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }
}
