package chapter03.abstraction02;

public class Mouse {

    /*
    인스턴스 변수
        객체가 생성되어 힙 영역에 배치되면 객체 내부에 존재함
        초기화하지 않으면 변수 타입에 따라 기본값 할당
     */
    public String name;
    public int age;

    /*
    static 변수(정적 속성)
        클래스가 스태틱 영역에 배치되면 클래스 내부에 존재함
        초기화하지 않으면 변수 타입에 따라 기본값 할당

    static 변수(정적 속성)를 사용하는 경우
        모든 Mouse 객체가 같은 값 1을 갖는 속성으로, Mouse 객체 수만큼 메모리 공간(힙 영역)을 차지함
        같은 클래스의 모든 객체가 같은 값을 갖는다면 그 값은 클래스(스태틱 영역)에 저장하는 것이 효율적임
     */
    public static int countOfTail = 1;

    public void sing() {
        System.out.println(name + " 찍찍!!!");
    }
}
