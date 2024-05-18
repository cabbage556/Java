package Volume1.chapter08;

public class ReferenceOverloading {
    public static void main(String[] args) {
        ReferenceOverloading reference = new ReferenceOverloading();
        reference.print(10);
        reference.print("10");
        reference.print(10, "10");
        reference.print("10", 10);
    }

    /*
        메서드 오버로딩
            메서드 이름은 같지만, 매개 변수를 다르게 하여 여러 메서드를 정의하는 것
            오버로딩한 메서드들은 모두 매개 변수의 타입, 개수, 순서가 모두 다름
        사용 이유
            "같은 역할을 하는 메서드는 같은 메서드 이름을 가져야 한다"는 모토로 사용하는 기능
            같은 역할을 하는 메서드가 매개 변수 타입에 따라 여러 이름을 가지면 사용하기가 불편함
        주의할 점
            매개 변수 이름이 아니라 매개 변수 타입의 순서가 달라야 함
        메서드 오버로딩 대표적인 예시
            System.out.println()
                - int, long, String 등의 값을 출력하고 줄바꿈하는 메서드
                - int, long, String 등 타입에 따라 다른 메서드 이름을 갖지 않음
     */

    // 메서드 오버로딩
    //      매개 변수 타입의 순서가 다른 메서드와 다름
    public void print(int data) {
        System.out.println("intData = " + data);
    }

    // 메서드 오버로딩
    //      매개 변수 타입의 순서가 다른 메서드와 다름
    public void print(String data) {
        System.out.println("stringData = " + data);
    }

    // 메서드 오버로딩
    //      매개 변수 타입의 순서가 다른 메서드와 다름
    public void print(int intData, String stringData) {
        System.out.println("intData = " + intData);
        System.out.println("stringData = " + stringData);
    }

    // 메서드 오버로딩
    //      매개 변수 타입의 순서가 다른 메서드와 다름
    public void print(String stringData, int intData) {
        System.out.println("stringData = " + stringData);
        System.out.println("intData = " + intData);
    }
}
