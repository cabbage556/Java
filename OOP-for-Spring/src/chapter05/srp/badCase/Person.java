package chapter05.srp.badCase;

public class Person {
    double height;
    int age;

    // 속성이 단일 책임 원칙을 지키지 못하는 경우
    //      남자는 군대에 가지만, 여자는 군대에 갈 수 없다고 가정
    //      사람 클래스에 군번 속성이 존재함
    String 군번;
}
