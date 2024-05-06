package com.cabbage556.OOPforSpringchapter7.expert005;

import jakarta.annotation.Resource;

public class Car {
    /*
        @Resource를 통한 속성 주입
            @Autowired : 스프링 어노테이션
            @Resource : 자바 표준 어노테이션
                스프링 프레임워크를 사용하지 않는다면 @Resource만 사용해야 함
            @Resource 속성 매칭 규칙의 경우 id 기준 매칭이 type 기준 매칭보다 우선함
                @Autowired 속성 매칭 규칙과 반대임
                id를 기준으로 매칭할 빈을 찾지 못하면 type을 기준으로 매칭할 빈을 찾게 됨
     */
    @Resource
    Tire tire;

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }
}
