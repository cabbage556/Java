package Volume1.chapter03;

public class Car {

    // 클래스의 변수
    //      클래스의 변수로 상태를 나타냄
    int speed;
    int distance;
    String color;

     // 기본 생성자
     //     매개변수가 없는 생성자
     //     생성자를 아무것도 작성하지 않으면 컴파일할 때 클래스 파일 안에 자동으로 추가됨
    public Car() {}

    // 클래스의 메서드
    //      클래스의 메서드로 행동을 나타냄
    public void speedUp() {
        speed += 5;
    }
    public void breakDown() {
        speed -= 10;
    }
    public int getCurrentSpeed() {
        return speed;
    }
}
