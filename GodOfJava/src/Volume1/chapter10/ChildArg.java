package Volume1.chapter10;

public class ChildArg extends ParentArg {

    public ChildArg() {
        // 부모 클래스에 기본 생성자가 아닌 생성자가 존재하므로 자식 클래스 생성자의 첫 번째 줄에서 부모 클래스의 생성자를 직접 호출해야 함
        //      부모 클래스의 생성자를 호출하지 않으면 컴파일 시 자동으로 부모 클래스의 기본 생성자가 자식 클래스의 생성자 첫 번째 줄에 추가됨
        //      하지만 Parent 클래스에 기본 생성자가 존재하지 않으므로 컴파일 에러가 발생함
        super("ChildArg");  // ParentArg(Strign name) 생성자 호출
        System.out.println("ChildArg.ChildArg");
    }
}
