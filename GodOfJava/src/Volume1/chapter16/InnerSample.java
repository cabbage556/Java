package Volume1.chapter16;

public class InnerSample {

    public static void main(String[] args) {
        InnerSample sample = new InnerSample();
        sample.makeInnerObject();
    }

    public void makeInnerObject() {
        // 내부 클래스의 객체를 생성하기 전에 먼저 내부 클래스를 감싸는 클래스의 객체를 생성해야 함
        OuterOfInner outer = new OuterOfInner();

        // 내부 클래스의 객체 생성 방법
        OuterOfInner.Inner inner = outer.new Inner();
        inner.setValue(3);
        System.out.println(inner.getValue());
    }
}
