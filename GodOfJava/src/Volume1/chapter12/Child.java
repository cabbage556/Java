package Volume1.chapter12;

public class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();

        // Object 클래스의 toString() 메서드 사용 가능
        //      상속 관계를 통해 Object 클래스를 상속하므로 Object 클래스의 메서드를 사용할 수 있기 때문
        //      Child 클래스는 Object 클래스의 하위-하위 클래스
        System.out.println(child.toString());
    }
}
