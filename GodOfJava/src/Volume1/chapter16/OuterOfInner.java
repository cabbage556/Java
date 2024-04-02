package Volume1.chapter16;

public class OuterOfInner {

    // 내부 클래스 선언
    //      사용 이유: 캡슐화가 필요할 때
    //      어떤 클래스에서 공통 작업을 수행하는 클래스가 필요한데, 다른 클래스에서는 그 클래스가 전혀 필요하지 않은 경우
    //      주로 GUI 관련 프로그램을 개발할 때 리스너를 처리하기 위해 가장 많이 사용함
    //          어떤 버튼이 눌렸을 때 해야 하는 작업을 정의하기 위해 내부 클래스 사용
    //          어떤 버튼이 눌렸을 때 해야 하는 작업은 대부분 상이하기 때문에 내부 클래스를 만드는 것이 훨씬 편함
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
