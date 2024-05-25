package Volume1.chapter16;

public class InnerSample {

    public static void main(String[] args) {
        InnerSample sample = new InnerSample();
        sample.makeInnerObject();
    }

    public void makeInnerObject() {
        // 내부 클래스의 객체 생성 방법
        //      감싸는 클래스의 객체를 먼저 생성함
        //      감싸는 클래스의 객체를 통해 내부 클래스의 객체를 생성함
        OuterOfInner outer = new OuterOfInner();
        OuterOfInner.Inner inner = outer.new Inner();

        // 객체 사용 방법은 일반 객체 사용 방법과 동일함
        inner.setValue(3);
        System.out.println(inner.getValue());
    }
}
