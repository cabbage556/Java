package Volume1.chapter12;

public class ToString2 {
    public static void main(String[] args) {
        ToString2 thisObject = new ToString2();
        thisObject.toStringMethod();
    }

    public void toStringMethod() {
        // this : 객체 자기 자신을 참조하는 키워드
        //      이 메서드를 호출하는 객체를 this로 참조하므로 매개 변수로 객체를 넘겨줄 필요가 없음

        // 오버라이딩된 toString() 메서드가 호출됨
        System.out.println(this);               // ToString2 class
        System.out.println(this.toString());    // ToString2 class
        System.out.println("plus: " + this);    // plus: ToString2 class
    }

    // toString() 메서드 오버라이딩
    public String toString() {
        return "ToString2 class";
    }
}
