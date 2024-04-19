package chapter03.reference;

public class CallByReference2 {
    public static void main(String[] args) {
        // 두 객체참조변수는 동일한 객체를 참조함
        Animal refA = new Animal();
        Animal refB = refA;

        System.out.println(refA);
        System.out.println(refB);  // refA 출력 결과와 같음(toString())
    }
}