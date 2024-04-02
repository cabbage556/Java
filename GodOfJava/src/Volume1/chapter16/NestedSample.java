package Volume1.chapter16;

public class NestedSample {

    public static void main(String[] args) {
        NestedSample sample = new NestedSample();
        sample.makeStaticNestedObject();
    }

    public void makeStaticNestedObject() {
        // static nested 클래스의 객체 생성 방법
        OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
        staticNested.setValue(3);
        System.out.println(staticNested.getValue());
    }
}
