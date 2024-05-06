package com.cabbage556.OOPforSpringchapter7.expert004;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(locations = {"file:src/main/resources/expert004.xml"})
public class CarTest {
    @Autowired
    Car car;

    @Test
    public void 자동차_코리아타이어_장착_타이어브랜드_테스트() {
        assertEquals("장착된 타이어 : 코리아 타이어", car.getTireBrand());
    }
}