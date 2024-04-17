package chapter03.abstraction01;

public class MouseDriver {

    /*
    main() 메서드 실행 직전의 T 메모리
        java.lang 패키지, Mouse 클래스, MouseDriver 클래스가 스태틱 영역에 배치됨

    main() 메서드 실행
        main() 메서드 스택 프레임이 스택 영역에 배치됨
        파라미터 args 공간이 main() 메서드 스택 프레임 내부에 배치됨
     */

    public static void main(String[] args) {
        // Mouse 클래스의 인스턴스 생성
        //      Mouse 타입의 객체참조변수 mickey가 main() 메서드 스택 프레임 안에 생성됨
        //      생성자를 호출해 객체를 생성함, 객체는 힙 영역에 배치됨
        //      mickey 객체참조변수에 힙 영역에 배치된 인스턴스의 주소값이 할당됨
        Mouse mickey = new Mouse();


        // 객체참조변수 mickey와 참조 연산자 .를 사용해 힙 영역에 있는 객체에 접근함
        //      객체의 name, age, countOfTail 속성에 값을 할당함
        mickey.name = "미키";
        mickey.age = 85;
        mickey.countOfTail = 1;

        // sing() 메서드를 호출해도 T 메모리에는 변화가 없음
        //      코드 실행 영역에서 실행됨
        mickey.sing();

        // 객체참조변수 mickey가 더 이상 힙 영역에 있는 Mouse 객체를 참조하지 않음
        //      힙 영역에 있는 Mouse 객체는 더 이상 참조되지 않으므로 가비지 컬렉터가 Mouse 객체를 쓰레기로 인지하고 수거함
        //      Mouse 객체가 힙 영역에서 소멸함
        mickey = null;

        Mouse jerry = new Mouse();
        jerry.name = "제리";
        jerry.age = 73;
        jerry.countOfTail = 1;
        jerry.sing();

        // main() 메서드 종료
        //      main() 메서드 스택 프레임이 스택 영역에서 제거되고 프로그램이 종료됨
    }
}
