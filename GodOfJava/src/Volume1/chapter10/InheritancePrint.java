package Volume1.chapter10;

public class InheritancePrint {

    public static void main(String[] args) {
        // Child 인스턴스 생성
        //      1. 상위 인스턴스 생성 : 하위 클래스 생성자의 첫 번째 줄에서 super();가 호출됨
        //      2. 하위 인스턴스 생성 : super(); 종료 이후 생성자 계속 실행
        Child child = new Child();

        // 상속한 printName() 메서드 호출
        child.printName();
    }
}
