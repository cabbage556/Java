package Volume1.chapter12;

public class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();

        // Object 클래스의 toString() 메서드 사용 가능
        //      Object - Parent - Child 상속 관계를 통해 Object 클래스의 메서드를 상속하기 때문
        System.out.println(child.toString());
    }
}
