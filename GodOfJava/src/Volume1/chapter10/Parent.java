package Volume1.chapter10;

public class Parent {
    // 기본 생성자
    //      작성하지 않으면 컴파일 시 기본 생성자가 클래스 파일에 자동으로 추가됨
    //      다른 생성자가 존재하면 자동으로 추가되지 않음
    public Parent() {
        System.out.println("Parent.Parent");
    }

    public void printName() {
        System.out.println("Parent.printName");
    }
}
