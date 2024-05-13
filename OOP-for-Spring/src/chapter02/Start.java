package chapter02;

public class Start {
    /*
        main() 메서드 : 프로그램 실행 시작점이 되는 메서드

        Start.main() 메서드 실행 직전까지 처리되는 작업들
            - JRE(자바 실행 환경)는 Start 클래스에서 main() 메서드를 확인함
            - JRE는 프로그램 실행을 위한 사전 준비에 착수함
                - JVM 부팅
                - 부팅된 JVM은 자바 목적 파일(.class)을 실행하게 됨
            - JVM은 가장 먼저 전처리 과정에 착수함
                - T 메모리 구조 생성
                - java.lang 패키지를 스태틱 영역에 로딩함
                - import 패키지 및 클래스를 스태틱 영역에 로딩함
                - main() 메서드 스택 프레임을 스택 영역에 배치함
                - main() 메서드의 파라미터 args의 공간을 스택 프레임 내부에 확보함

        Start.main() 메서드 실행 종료 이후
            - 스택 영역에서 main() 메서드 스택 프레임이 소멸됨
            - JRE는 JVM을 종료함
            - JRE도 메모리에서 사라짐
            - T 메모리도 사라짐
     */
    public static void main(String[] args) {
        System.out.println("Hello OOP!!!");
    }
}
