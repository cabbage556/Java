package chapter06.nonTemplateMethodPattern;

// Cat 클래스의 playWithOwner() 메서드와 "멍멍!" 출력 부분만 빼고 중복됨
//      상속을 통해 중복은 상위 클래스로, 달라지는 부분만 하위 클래스로 분할할 수 있음
public class Dog {
    public void playWithOwner() {
        System.out.println("귀염둥이 이리온~");
        System.out.println("멍멍!");
        System.out.println("꼬리 살랑 살랑~");
        System.out.println("잘했어");
    }
}
