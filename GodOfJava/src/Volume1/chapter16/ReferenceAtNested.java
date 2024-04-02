package Volume1.chapter16;

public class ReferenceAtNested {

    // static nested 클래스
    static class StaticNested {
        private int staticNestedInt = 99;
        private static int staticNestedStaticInt = 100;
    }

    // inner 클래스
    class Inner {
        private int innerValue = 100;
        private static int innerStaticValue = 101;
    }

    public void setValue(int value) {
        // 감싸고 있는 클래스에서 static nested 클래스의 변수에 접근 가능(private 변수도 가능)
        int staticNestedStaticInt = StaticNested.staticNestedStaticInt;
        StaticNested nested = new StaticNested();
        nested.staticNestedInt = value;

        // 감싸고 있는 클래스에서 inner 클래스의 인스턴스 변수에 접근 가능(private 변수도 가능)
        int innerStaticValue = Inner.innerStaticValue;
        Inner inner = new Inner();
        inner.innerValue = value;
    }
}
