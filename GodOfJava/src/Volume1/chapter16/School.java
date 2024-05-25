package Volume1.chapter16;

/*
    Static nested 클래스 사용 이유
        - 한 곳에서만 사용하는 클래스를 논리적으로 묶어서 처리할 필요가 있을 때
 */

public class School {

    // School 클래스와 관련된 static nested Student 클래스
    //      University 클래스의 Student 클래스와 구분되어 용도가 명확해짐
    //      University 클래스의 Student 클래스와 겉으론 유사하지만 내부적으로 구현이 달라질 수 있음
    static class Student{}
}
