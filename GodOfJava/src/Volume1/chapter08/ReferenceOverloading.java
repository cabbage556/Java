package Volume1.chapter08;

public class ReferenceOverloading {
    public static void main(String[] args) {
        ReferenceOverloading reference = new ReferenceOverloading();
        reference.print(10);
        reference.print("10");
        reference.print(10, "10");
        reference.print("10", 10);
    }

    // 메서드 오버로딩
    //      오버로딩한 메서드의 매개 변수 타입의 순서가 모두 다름
    //      "같은 역할을 하는 메서드는 같은 메서드 이름을 가져야 한다"는 모토로 사용하는 기능
    //      같은 역할을 하는 메서드가 매개 변수 타입에 따라 여러 이름을 가지면 사용하기가 불편함
    public void print(int data) {
        System.out.println("intData = " + data);
    }

    // 메서드 오버로딩
    public void print(String data) {
        System.out.println("stringData = " + data);
    }

    // 메서드 오버로딩
    public void print(int intData, String stringData) {
        System.out.println("intData = " + intData);
        System.out.println("stringData = " + stringData);
    }

    // 메서드 오버로딩
    public void print(String stringData, int intData) {
        System.out.println("stringData = " + stringData);
        System.out.println("intData = " + intData);
    }
}
