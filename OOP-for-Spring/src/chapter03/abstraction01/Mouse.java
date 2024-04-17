package chapter03.abstraction01;

// 추상화 결과는 모델, 모델은 클래스로 표현됨
public class Mouse {
    public String name;
    public int age;
    public int countOfTail;

    public void sing() {
        System.out.println(name + " 찍찍!!!");
    }
}
