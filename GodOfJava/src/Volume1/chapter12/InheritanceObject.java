package Volume1.chapter12;

// java.lang.Object(Object) 클래스
//      모든 클래스의 부모 클래스
//      기본적으로 아무 클래스도 상속하지 않으면 Object 클래스를 상속(확장)함
// 모든 클래스에서 Object 클래스를 상속하는 이유
//      Object 클래스에 있는 메서드를 통해 클래스의 기본적인 행동을 정의할 수 있기 때문
public class InheritanceObject {
    public static void main(String[] args) {
        InheritanceObject object = new InheritanceObject();

        // 아무 클래스도 상속하지 않았지만 Object 클래스의 메서드를 사용할 수 있음
        System.out.println(object.toString());

        Child child = new Child();

        // 아무 클래스도 상속하지 않았지만 Object 클래스의 메서드를 사용할 수 있음
        System.out.println(child.toString());
    }
}
