package com.cabbage556.OOPforSpringchapter7.expert006;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    @Resource(name="tire")
    // @Autowired
    // @Qualifier("tire")
    Tire tire;

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }
}
