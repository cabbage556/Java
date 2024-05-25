package Volume1.chapter16;

/*
    감싸고 있는 클래스에서 참조 가능한, static nested 클래스와 내부 클래스의 변수
        - 감싸고 있는 클래스에서 static nested 클래스와 내부 클래스의 모든 변수를 참조할 수 있음
        - 클래스 변수 : 바로 참조 가능
        - 인스턴스 변수 : static nested 클래스와 내부 클래스의 객체 생성 후 참조 가능
 */

public class ReferenceAtNested {

    // static nested 클래스
    static class StaticNested {
        private int staticNestedInt = 99;
        static int staticNestedStaticInt = 100;
    }

    // inner 클래스
    class Inner {
        private int innerValue = 100;
        static int innerStaticValue = 101;
    }

    public void setValue(int value) {
        // 감싸고 있는 클래스에서 static nested 클래스의 변수에 접근 가능
        int staticNestedStaticInt = StaticNested.staticNestedStaticInt;
        StaticNested nested = new StaticNested();
        nested.staticNestedInt = value;

        // 감싸고 있는 클래스에서 inner 클래스의 변수에 접근 가능
        int innerStaticValue = Inner.innerStaticValue;
        Inner inner = new Inner();
        inner.innerValue = value;
    }
}
