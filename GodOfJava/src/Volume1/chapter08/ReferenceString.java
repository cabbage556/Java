package Volume1.chapter08;

public class ReferenceString {
    String instanceVariable;

    // 기본 생성자
    //      아래에 다른 생성자가 존재하므로 기본 생성자를 사용하려면 직접 정의해야 함
    public ReferenceString() {}

    /*
        생성자 존재 목적 : 객체(인스턴스)를 생성하기 위해 존재함
        생성자가 메서드와 다른 점
            생성자에는 리턴 타입이 없음
            생성자 이름은 클래스 이름과 동일하게 지정함
        생성자 위치 : 인스턴스 변수 아래, 메서드 위
            코드 가독성을 고려해 위치시킴
     */
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
