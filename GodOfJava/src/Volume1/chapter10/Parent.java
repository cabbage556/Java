package Volume1.chapter10;

public class Parent {
    // 기본 생성자를 작성하지 않으면 컴파일 시 기본 생성자가 자동으로 추가됨
    public Parent() {
        System.out.println("Parent.Parent");
    }

    public void printName() {
        System.out.println("Parent.printName");
    }
}
