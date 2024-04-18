package chapter03.inheritance02;

public class Driver {

    public static void main(String[] args) {
        날수있는 날것1 = new 박쥐();
        날것1.fly();

        날수있는 날것2 = new 참새();
        날것2.fly();

        헤엄칠수있는[] 헤엄칠수있는것들 = {
                new 고래(),
                new 펭귄()
        };
        for (헤엄칠수있는 헤엄칠수있는것 : 헤엄칠수있는것들) {
            헤엄칠수있는것.swim();
        }
    }
}
