package Volume1.chapter10;

public class ParentArg {

    // 기본 생성자가 아닌 생성자 -> 컴파일 시 기본 생성자가 자동으로 클래스 파일에 추가되지 않음
    public ParentArg(String name) {
        System.out.println("ParentArg(" + name + ") constructor");
    }

    // 기본 생성자가 아닌 생성자 -> 컴파일 시 기본 생성자가 자동으로 클래스 파일에 추가되지 않음
    public ParentArg(InheritancePrint obj) {
        System.out.println("ParentArg(InheritancePrint) constructor");
    }

    public void printName() {
        System.out.println("ParentArg.printName");
    }
}
