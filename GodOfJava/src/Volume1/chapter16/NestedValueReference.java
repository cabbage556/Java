package Volume1.chapter16;

public class NestedValueReference {
    // 인스턴스 변수
    public int publicInt = 0;
    protected int protectedInt = 1;
    int justInt = 2;
    private int privateInt = 3;

    // 클래스 변수
    static int staticInt = 4;

    // static nested 클래스
    static class StaticNested {
        public void setValue() {
            // static nested 클래스에서는 감싸고 있는 클래스의 클래스 변수만 참조 가능
            //      인스턴스 변수는 참조할 수 없음
            // publicInt = 10;
            // protectedInt = 11;
            // justInt = 12;
            // privateInt = 13;
            staticInt = 14;
        }
    }

    // inner 클래스
    class Inner {
        public void setValue() {
            // inner 클래스에서는 감싸고 있는 클래스의 어떤 변수라도 참조 가능
            publicInt = 20;
            protectedInt = 21;
            justInt = 22;
            privateInt = 23;

            staticInt = 24;
        }
    }

    public void setValue() {
        // 익명 클래스
        EventListener listener = new EventListener() {
            public void onClick() {
                // 익명 클래스에서는 감싸고 있는 클래스의 어떤 변수라도 참조 가능
                publicInt = 30;
                protectedInt = 31;
                justInt = 32;
                privateInt = 33;

                staticInt = 34;
            }
        };
    }
}
