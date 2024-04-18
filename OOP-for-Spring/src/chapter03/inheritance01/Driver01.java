package chapter03.inheritance01;

public class Driver01 {

    public static void main(String[] args) {
        동물 animal = new 동물();
        포유류 mammalia = new 포유류();
        조류 bird = new 조류();
        고래 whale = new 고래();
        박쥐 bat = new 박쥐();
        참새 sparrow = new 참새();
        펭귄 penguin = new 펭귄();

        // 상속의 강력함
        //      상위 클래스에서만 showMe() 메서드를 구현했으나 모든 하위 클래스의 객체에서 사용 가능
        //      상속의 의미: 상위 클래스의 특성을 상속한다는 것, 부모-자식 관계가 아님
        animal.showMe();
        mammalia.showMe();
        bird.showMe();
        whale.showMe();
        bat.showMe();
        sparrow.showMe();
        penguin.showMe();
    }
}
