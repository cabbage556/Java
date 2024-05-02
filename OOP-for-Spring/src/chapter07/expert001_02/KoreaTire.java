package chapter07.expert001_02;

// 전략 객체 : 전략 메서드를 가지고 있음
public class KoreaTire implements Tire {
    @Override
    public String getBrand() {
        return "코리아 타이어";
    }
}
