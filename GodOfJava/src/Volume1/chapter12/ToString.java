package Volume1.chapter12;

public class ToString {
    public static void main(String[] args) {
        ToString thisObject = new ToString();
        // thisObject.toStringMethod(thisObject);
        thisObject.toStringMethod2();
    }

    public void toStringMethod(Object object) {
        // toString() 메서드가 자동으로 호출되는 경우
        // 1. System.out.println() 메서드에 객체를 전달하는 경우
        System.out.println(object);  // Volume1.chapter12.ToString@5e025e70
        System.out.println(object.toString());  // Volume1.chapter12.ToString@5e025e70

        // 2. String 값과 더하기 연산을 하는 경우
        System.out.println("plus: " + object); // plus: Volume1.chapter12.ToString@5e025e70
    }

    public void toStringMethod2() {
        // this: 객체 자기 자신을 참조할 때 사용함
        System.out.println(this);
        System.out.println(this.toString());
        System.out.println("plus: " + this);
    }

    public String toString() {
        return "ToString class";
    }
}
