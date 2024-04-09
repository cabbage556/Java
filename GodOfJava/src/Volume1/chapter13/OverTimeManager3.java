package Volume1.chapter13;

public class OverTimeManager3 {

    public static void main(String[] args) {
        // values() 메서드
        //      Enum 클래스가 제공하는 특수한 static 메서드
        //      API 문서에 존재하지 않음
        //      enum 클래스에 선언한 상수들의 순서대로 배열에 담아 리턴함
        //      컴파일 시 자동으로 추가되는 메서드
        OverTimeValues2[] values = OverTimeValues2.values();
        for (OverTimeValues2 value : values) {
            System.out.println(value);  // 선언된 순서대로 출력됨
        }
    }
}
