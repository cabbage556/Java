package chapter06.singletonPattern;

/*
    싱글턴 패턴
        "클래스의 인스턴스를 하나만 만들어 사용하는 패턴"
        싱글턴 패턴은 오직 하나의 인스턴스만 만들어 재사용함

    싱글턴 패턴의 특징
        private 생성자 : 클래스 외부에서 인스턴스 생성을 방지함
        정적 속성 : 단일 객체 참조 변수
        정적 메서드 : 단일 객체 참조값 반환 메서드
        단일 객체 : 단일 객체는 공유 객체로 사용하므로 쓰기 가능한 속성을 갖지 않는 것이 정석임(읽기 전용 속성은 가능함)
            하나의 참조 변수가 수정한 속성이 다른 참조 변수에 영향을 미칠 수 있기 때문
 */

public class Singleton {
    // 유일한 단일 객체를 참조하는 정적 참조 변수
    static Singleton singletonObject;

    // new를 실행해 객체를 생성할 수 없도록 생성자에 private을 붙임
    private Singleton() {}

    // 유일한 단일 객체의 참조값을 반환하는 정적 메서드
    public static Singleton getInstance() {
        // 정적 참조 변수에 객체가 할당되어 있지 않은 경우에만 객체를 생성해 정적 참조 변수에 할당함
        if (singletonObject == null) {
            singletonObject = new Singleton();
        }

        // 정적 참조 변수에 할당된 유일한 단일 객체의 참조값 리턴
        return singletonObject;
    }
}
