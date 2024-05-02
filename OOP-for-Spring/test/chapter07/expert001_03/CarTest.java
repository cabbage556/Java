package chapter07.expert001_03;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void 자동차_코리아타이어_장착_타이어브랜드_테스트() {
        Tire koreaTire = new KoreaTire();
        Car aCar = new Car();
        aCar.setTire(koreaTire);

        assertEquals("장착된 타이어 : 코리아 타이어", aCar.getTireBrand());
    }

    @Test
    public void 자동차_미국타이어_장착_타이어브랜드_테스트() {
        Tire americaTire = new AmericaTire();
        Car aCar = new Car();
        aCar.setTire(americaTire);

        assertEquals("장착된 타이어 : 아메리카 타이어", aCar.getTireBrand());
    }
}