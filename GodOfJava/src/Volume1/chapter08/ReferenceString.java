package Volume1.chapter08;

public class ReferenceString {
    String instanceVariable;

    // 기본 생성자
    //      다른 생성자가 있을 경우 컴파일 시 자동으로 생성되지 않으므로 직접 작성해야 함
    public ReferenceString() {}

    // 생성자
    //      리턴 타입이 없음
    //      메서드 이름이 클래스 이름과 같음
    public ReferenceString(String arg) {}

    public static void main(String[] args) {
        ReferenceString reference = new ReferenceString();  // 기본 생성자 사용
    }

    public String getString() {
        return instanceVariable;
    }

    public void setString(String string) {
        instanceVariable = string;
    }
}
