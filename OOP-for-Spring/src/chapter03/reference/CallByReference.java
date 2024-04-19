package chapter03.reference;

public class CallByReference {
    public static void main(String[] args) {
        Animal refA = new Animal();

        // Call By Reference
        //      Call By Value와 마찬가지로 변수의 값이 복사되어 할당됨
        //      기본 자료형은 값을 값 자체로 해석하지만, 참조 자료형은 값을 주소값으로 해석한다는 점이 다름
        Animal refB = refA;

        refA.age = 10;
        refB.age = 20;

        System.out.println("refA.age = " + refA.age);  // 20
        System.out.println("refB.age = " + refB.age);  // 20
    }
}

class Animal {
    int age;
}
