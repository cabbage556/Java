package chapter07.expert001_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    // Car 클래스 인스턴스의 getTireBrand() 메서드 리턴값 테스트
    @Test
    public void 자동차_장착_타이어브랜드_테스트() {
        Car aCar = new Car();

        assertEquals("장착된 타이어 : 코리아 타이어", aCar.getTireBrand());
    }
}