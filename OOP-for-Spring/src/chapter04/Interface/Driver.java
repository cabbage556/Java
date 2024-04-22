package chapter04.Interface;

public class Driver {
    public static void main(String[] args) {
        // 인터페이스에 선언된 변수가 정적 상수인 이유
        //      1. 인터페이스명을 통해 접근 가능
        System.out.println(Speakable.PI);
        System.out.println(Speakable.absoluteZeroPoint);

        //      2. 값을 변경할 수 없음
        // Speakable.PI = 3.14;

        Speaker reporter1 = new Speaker();
        reporter1.sayYes();
    }
}

// 자바 8 이전 인터페이스
// public 추상 메서드와 public 정적 상수만 가질 수 있음
//      메서드에 public, abstract를 생략할 수 있음
//      속성에 public, static, final을 생략할 수 있음
//      키워드 생략 시 자바가 알아서 붙여줌
interface Speakable {

    // public 정적 상수
    double PI = 3.14159;
    public static final double absoluteZeroPoint = -275.15;

    // public 추상 메서드
    //      메서드 구현부가 존재하지 않으므로 추상 메서드임
    void sayYes();
}

// 자바 8 이후 인터페이스
// 인터페이스를 기초로 하는 람다가 등장하면서, 인터페이스에 큰 변화가 생김
//      디폴트 메서드라는 객체 구상 메서드와 정적 추상 메서드를 지원하기 시작함

class Speaker implements Speakable {
    @Override
    public void sayYes() {
        System.out.println("I say NO!!");
    }
}