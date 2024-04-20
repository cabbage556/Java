package chapter04.constructor03;

public class Animal {

    /*
    생성자 특징
        아무 생성자를 만들지 않으면 자바 컴파일러가 기본 생성자를 자동으로 만들어 줌
        파라미터가 있는 생성자를 하나라도 만들면 자바 컴파일러는 기본 생성자를 만들지 않음
     */

    // 필요하다면 파라미터를 갖는 생성자를 추가할 수 있음
    public Animal(String name) {
        System.out.println(name);
    }
}
