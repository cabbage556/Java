package Volume1.chapter02;

/*
    자바 컴파일 및 실행 절차
        - 소스 코드 -> [컴파일러] -> 바이트 코드 -> [디스크] -> 바이트 코드 -> [JVM] -> 기계어 -> [운영체제]
    자바 소스 코드는 컴파일 단계를 거쳐야 실행 가능함
        - 컴파일 : 소스 코드를 컴퓨터가 이해할 수 있도록 번역하는 작업
        - 컴파일러 : 컴파일을 수행하는 프로그램
            - 자바에서는 javac라는 프로그램이 이 역할을 수행함
            - 자바 소스 코드 작성 규칙을 따르지 않으면 컴파일 에러가 발생함

    javac 명령어로 컴파일하기(터미널)
        - 컴파일 방법 : javac 소스파일이름.java
        - 컴파일 결과 : 소스파일이름.class 파일을 생성함

    java 명령어로 실행하기(터미널)
        - 실행 방법 : java 소스파일이름  (.class 확장자 제외)
        - 실행 결과 : javac 컴파일 결과인 소스파일이름.class 파일을 찾아 실행함
 */
public class HelloGodOfJava {

    /*
        main() 메서드
            - 실행 목적을 갖는 모든 자바 클래스는 main() 메서드를 반드시 가져야 함
            - java 명령어로 실행하는 자바 프로그램의 진입점 역할을 하는 메서드
            - 자바 프로그램에 있는 수많은 클래스 중 main() 메서드를 갖는 클래스가 적어도 하나 있고, 그 main() 메서드가 실행됨
            - main() 메서드는 반드시 아래 코드처럼 선언되어야 함 (중괄호 내부 제외)
     */
    public static void main(String args[]) {
        System.out.println("Hello God of Java!!");
        System.out.println("I love this book.");
    }
}
