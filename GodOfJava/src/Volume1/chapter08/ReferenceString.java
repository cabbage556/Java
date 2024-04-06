package Volume1.chapter08;

public class ReferenceString {
    String instanceVariable;

    // 기본 생성자
    //      다른 생성자가 있을 경우 컴파일 시 자동으로 생성되지 않으므로 직접 작성해야 함
    public ReferenceString() {}

    // 생성자
    //      객체(인스턴스)를 생성하기 위해 존재함
    // 메서드와 다른 점
    //      리턴 타입이 없음
    //      클래스 이름과 동일하게 이름을 지정함
    // 위치
    //      인스턴스 변수 아래, 메서드 위
    public ReferenceString(String arg) {}

    public static void main(String[] args) {
        ReferenceString reference = new ReferenceString();
    }

    public String getString() {
        return instanceVariable;
    }

    public void setString(String string) {
        instanceVariable = string;
    }
}
