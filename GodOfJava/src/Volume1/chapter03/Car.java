package Volume1.chapter03;

/*
    클래스는 상태와 행위를 갖는다.
        상태 : 변수
        행위 : 메서드
 */
public class Car {

    // 변수로 클래스의 상태를 정할 수 있음
    int speed;
    int distance;
    String color;

     // 기본 생성자 : 매개변수가 없는 생성자
     //     생성자를 아무것도 작성하지 않으면 컴파일할 때 클래스 파일 안에 기본 생성자가 자동으로 추가됨
    public Car() {}

    // 메서드로 클래스의 행위를 정할 수 있음
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
