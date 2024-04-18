package chapter03.inheritance01;

public class Driver02 {

    public static void main(String[] args) {

        // 상속의 강력함
        //      상속 관계에서 "하위 클래스는 상위 클래스다"는 반드시 만족해야 함
        //      아래 코드는 이를 잘 표현함
        //      현실 세계를, 인간의 논리를 그대로 코드로 옮길 수 있는 힘이 있음
        동물 animal = new 동물();
        동물 mammalia = new 포유류();
        동물 bird = new 조류();
        동물 whale = new 고래();    // 고래 한 마리: 포유류 또는 동물
        동물 bat = new 박쥐();
        동물 sparrow = new 참새();  // 참새 한 마리: 조류 또는 동물
        동물 penguin = new 펭귄();

        animal.showMe();
        mammalia.showMe();
        bird.showMe();
        whale.showMe();
        bat.showMe();
        sparrow.showMe();
        penguin.showMe();
    }
}
