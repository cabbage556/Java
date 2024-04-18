package chapter03.inheritance01;

public class Driver03 {

    public static void main(String[] args) {
        동물[] animals = {
                new 동물(),
                new 포유류(),
                new 조류(),
                new 고래(),
                new 박쥐(),
                new 참새(),
                new 펭귄()
        };

        // 상속의 강력함
        //      상위 클래스 하나만으로 모든 하위 클래스의 객체에 대해 반응할 수 있음
        for (동물 animal : animals) {
            animal.showMe();
        }
    }
}
