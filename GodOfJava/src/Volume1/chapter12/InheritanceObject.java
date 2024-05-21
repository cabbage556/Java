package Volume1.chapter12;

/*
    java.lang.Object(Object) 클래스
        - 모든 클래스의 부모 클래스
        - 기본적으로 아무 클래스도 상속하지 않으면 Object 클래스를 상속함

    자바의 모든 클래스가 Object 클래스를 상속하게 한 이유
        - Object 클래스의 메서드를 통해 클래스의 기본적인 행동을 정의할 수 있기 때문
 */

// Object 클래스를 상속함
//      아무 클래스도 상속하지 않기 때문
public class InheritanceObject {
    public static void main(String[] args) {
        InheritanceObject object = new InheritanceObject();

        // InheritanceObject 클래스는 Object 클래스를 상속하게 되므로 Object 클래스의 메서드를 사용할 수 있음
        System.out.println(object.toString());
    }
}
