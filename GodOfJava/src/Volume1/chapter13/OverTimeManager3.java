package Volume1.chapter13;

public class OverTimeManager3 {

    public static void main(String[] args) {

        /*
            values() 메서드
                - enum 클래스가 제공하는 특수한 static 메서드
                - enum 클래스에 상수들이 선언된 순서대로 배열에 담아 리턴함
                - 컴파일 시 자동으로 추가되는 메서드
         */
        OverTimeValues2[] values = OverTimeValues2.values();
        for (OverTimeValues2 value : values) {
            System.out.println(value);              // 상수가 선언된 순서대로 상수 이름이 출력됨 : toString() 메서드의 리턴값
            System.out.println(value.name());       // 상수가 선언된 순서대로 상수 이름이 출력됨
            System.out.println(value.ordinal());    // 상수가 선언된 순서대로 상수 순서가 출력됨
        }
    }
}
