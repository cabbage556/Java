package com.cabbage556.OOPforSpringchapter7.expert002;

public class Car {
    Tire tire;

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }
}
