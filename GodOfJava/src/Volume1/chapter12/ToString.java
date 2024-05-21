package Volume1.chapter12;

public class ToString {
    public static void main(String[] args) {
        ToString thisObject = new ToString();
        thisObject.toStringMethod(thisObject);
        thisObject.toStringMethod2();
    }

    /*
        toString() 메서드
            - Object 클래스가 제공하는 객체 처리 메서드 중에서 가장 많이 사용되는 메서드
            - 객체에 대해 toString() 메서드를 호출하면 그 객체가 어떤 객체인지 쉽게 확인할 수 있음

        toString() 메서드가 자동으로 호출되는 경우
            1. System.out.println() 메서드의 매개 변수에 객체를 전달하는 경우
            2. 객체에 대해 더하기 연산을 하는 경우
                - 참조 자료형 중에서 String 클래스에만 더하기 연산을 사용 가능함
                - String을 제외한 참조 자료형에 더하기 연산을 사용하면 자동으로 객체에 대해 toString() 메서드가 호출되어 그 리턴값이 놓이게 됨
     */

    public void toStringMethod(Object object) {
        // toString() 메서드가 자동으로 호출됨
        System.out.println(object);             // Volume1.chapter12.ToString@5e025e70
        System.out.println("plus : " + object); // plus: Volume1.chapter12.ToString@5e025e70
        System.out.println(object.toString());  // Volume1.chapter12.ToString@5e025e70
    }

    public void toStringMethod2() {
        // this : 객체 자기 자신을 참조하는 키워드
        //      이 메서드를 호출하는 객체를 this로 참조하므로 매개 변수로 객체를 넘겨줄 필요가 없음
        System.out.println(this);
        System.out.println(this.toString());
        System.out.println("plus : " + this);
    }
}
