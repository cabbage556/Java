package Volume1.chapter10;

/*
    상속과 생성자
        - 하위 클래스의 생성자는 상위 클래스의 기본 생성자를 찾는 것이 기본
        - 상위 클래스에 기본 생성자가 아닌 생성자만 있다면 상위 클래스 생성자를 명시적으로 호출해야 함
 */

public class ChildArg extends ParentArg {

    public ChildArg() {
        /*
            ParentArg(String name) 생성자 호출
                - 하위 클래스 생성자의 첫 번째 줄에서 상위 클래스의 생성자를 호출해야 함
                - 상위 클래스의 생성자를 호출하지 않으면 컴파일 시 자동으로 상위 클래스의 기본 생성자가 하위 클래스의 생성자 첫 번째 줄에 추가됨
                - 하지만 상위 클래스인 ParentArg 클래스에 기본 생성자가 존재하지 않으므로 컴파일 에러가 발생함
                - 따라서 명시적으로 Parent(String name) 생성자를 명시적으로 호출함
         */
        super("ChildArg");
        System.out.println("ChildArg.ChildArg");
    }
}
