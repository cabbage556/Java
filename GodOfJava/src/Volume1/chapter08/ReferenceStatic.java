package Volume1.chapter08;

public class ReferenceStatic {
    String name = "min";  // 인스턴스 변수

    public static void main(String[] args) {
        ReferenceStatic.staticMethod();  // 객체를 생성하지 않고도 static 메서드 호출 가능
    }

    // static 메서드
    public static void staticMethod() {
        System.out.println("ReferenceStatic.staticMethod");
    }

    public static void staticMethodCallVariable() {
        // static 메서드는 인스턴스 변수를 사용할 수 없음
        //       클래스 변수만 사용 가능
        // System.out.println(name);
    }
}
