package Volume1.chapter09.c.javapackage;

/*
    클래스 접근 제어자 선언 시 주의할 점
        - 클래스를 선언할 때는 자바 파일 이름에 해당하는 public 클래스가 반드시 존재해야 함
        - public 클래스가 존재한다면 public 클래스의 이름과 자바 파일 이름은 같아야 함
        - 자바 파일 이름이 public 클래스의 이름과 같지 않으면 컴파일 에러 발생
 */

// 자바 파일 이름(PublicClass.java)과 public 클래스인 PublicClass 이름이 같음
public class PublicClass {}

// PublicSecondClass 클래스를 public으로 선언할 수 없음
//      자바 파일 이름과 클래스 이름이 다르기 때문
class PublicSecondClass {}
