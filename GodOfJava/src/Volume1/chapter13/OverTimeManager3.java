package Volume1.chapter13;

public class OverTimeManager3 {

    public static void main(String[] args) {
        // values() 메서드
        //      static 메서드
        //      enum 클래스 내부에 선언한 상수들의 순서대로 배열에 담아 리턴함
        //      컴파일 시 자동으로 추가되는 메서드
        OverTimeValues2[] values = OverTimeValues2.values();
        for (OverTimeValues2 value : values) {
            System.out.println(value);
        }
    }
}
