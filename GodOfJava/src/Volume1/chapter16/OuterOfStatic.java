package Volume1.chapter16;

public class OuterOfStatic {

    // static nested 클래스
    //      사용 이유: 한 곳에서만 사용하는 클래스를 논리적으로 묶어서 처리할 필요가 있을 때
    static class StaticNested {
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
