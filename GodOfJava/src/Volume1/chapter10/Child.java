package Volume1.chapter10;

// extends Parent: Parent 클래스를 상속(확장)함
//      Parent 클래스에 선언된 public, protected, package-private 변수, 메서드를 자신의 것처럼 사용할 수 있게 됨
//      만약 Parent 클래스가 다른 패키지에 존재한다면 package-private 변수, 메서드는 사용할 수 없음
public class Child extends Parent {
    public Child() {
        // super()
        // 부모 클래스의 기본 생성자 자동 호출
        //      자식 클래스의 생성자에 super()를 명시적으로 지정하지 않으면 컴파일 시 자동으로 자식 클래스의 생성자 첫 번째 줄에 super()가 추가됨
        //          즉 부모 클래스의 기본 생성자 호출 코드가 컴파일 시 자동으로 삽입되는 것
        //      만약 부모 클래스에 기본 생성자가 아닌 생성자가 존재하는 경우에는 반드시 명시적으로 부모 클래스의 생성자를 호출해야 함
        //          기본적으로 클래스에 기본 생성자가 아닌 생성자가 존재하면, 컴파일 시 기본 생성자가 자동으로 추가되지 않기 때문
        //          따라서 부모 클래스 생성자의 매개 변수에 적절한 값을 넘겨 부모 클래스의 생성자를 호출해야 함
        System.out.println("Child.Child");
    }
}
