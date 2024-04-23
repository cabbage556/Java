package chapter05.srp.badCase;

public class PersonDriver {
    public static void main(String[] args) {
        Person aMan = new Person();

        // 군번 속성이 Person 클래스 객체에 존재해 단일 책임 원칙을 지키지 못함
        //      여자 객체의 군번 속성에 값을 할당하거나 읽어 오는 코드를 작성할 수 있음
        Person aWoman = new Person();
        aWoman.군번 = "1234";
        System.out.println(aWoman.군번);
    }
}
