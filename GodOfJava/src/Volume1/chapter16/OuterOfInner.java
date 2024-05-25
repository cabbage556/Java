package Volume1.chapter16;

/*
    내부 클래스 사용 이유 : 캡슐화
        - 하나의 클래스에서 공통 작업을 수행하는 클래스가 필요한데, 다른 클래스에서는 그 클래스가 전혀 필요하지 않은 경우 내부 클래스로 만들어 사용함
        - 주로 GUI 관련 프로그램을 개발할 때 리스너를 처리하기 위해 내부 클래스를 가장 많이 사용함
            - 이벤트에 해당하는 작업을 정의하기 위해 내부 클래스 사용
            - 이벤트를 처리하기 위해 수행하는 작업은 대부분 상이하므로 별도 클래스를 선언하는 것보다 내부 클래스로 선언하는 것이 편함
            - 내부 클래스보다 간단한 방법은 익명 클래스를 사용하는 것
 */

public class OuterOfInner {

    // 내부 클래스
    class Inner {
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
