package Volume1.chapter16;

// nested 클래스를 사용하는 이유
//      한 곳에서만 사용하는 클래스를 논리적으로 묶어서 처리할 필요가 있을 때: static nested 클래스를 사용하는 이유
//      캡슐화가 필요할 때: 내부 클래스를 사용하는 이유
//          클래스 B를 외부에 노출시키고 싶지 않은 경우(내부 구현을 감추고 싶을 때)
//          클래스 A에 private 변수가 있고, 이 변수에 접근하고 싶은 클래스 B를 선언함
//      코드 가독성과 유지보수성을 높이고 싶을 때
//          오히려 코드 가독성이 떨어질 수도 있으므로 꼭 필요한 경우에만 사용하는 것이 좋음
public class OuterOfStatic {

    // static nested 클래스 선언
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
