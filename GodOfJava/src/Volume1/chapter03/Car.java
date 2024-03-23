package Volume1.chapter03;

public class Car {
    int speed;
    int distance;
    String color;

    /**
     * 기본 생성자: 매개변수가 없는 생성자
     *      기본 생성자의 경우 클래스를 컴파일할 때 클래스 파일 안에 자동으로 추가됨 -> 반드시 작성할 필요는 없음
     */
    public Car() {}

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
