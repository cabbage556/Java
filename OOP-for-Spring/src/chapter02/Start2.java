package chapter02;

public class Start2 {
    /*
        Start2.main() 메서드 실행 직전의 T 메모리
            - JRE가 JVM을 부팅하고, JVM은 전처리 작업을 처리함
            - java.lang 패키지와 Start2 클래스가 스태틱 영역에 배치됨
            - main() 메서드 스택 프레임이 스택 영역에 배치됨
     */
    public static void main(String[] args) {
        // main() 메서드 내부에서 지역 변수 i 선언
        //      main() 메서드 스택 프레임 내부에 변수 공간이 마련됨
        //      변수 공간이 마련되었을 때는 쓰레기값이 할당되어 있음
        //      따라서 선언만하고 값을 할당하지 않은 상태에서 변수를 사용하면 컴파일 에러가 발생함
        int i;

        // 실행 시 변수 i 공간에 10이 할당됨
        i = 10;

        // main() 메서드 내부에서 지역 변수 d 선언과 동시에 값 할당
        //      main() 메서드 스택 프레임 내부에 변수 공간이 마련됨
        //      변수 공간에 값 20.0을 할당함
        double d = 20.0;
    }
}
