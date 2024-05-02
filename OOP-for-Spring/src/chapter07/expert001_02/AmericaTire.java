package chapter07.expert001_02;

// 전략 객체 : 전략 메서드를 가지고 있음
public class AmericaTire implements Tire {
    @Override
    public String getBrand() {
        return "아메리카 타이어";
    }
}
