package Volume1.chapter16;

public class NestedSample {

    public static void main(String[] args) {
        NestedSample sample = new NestedSample();
        sample.makeStaticNestedObject();
    }

    public void makeStaticNestedObject() {
        // static nested 클래스의 객체 생성 방법 : 감싸고 있는 클래스 뒤에 .을 찍어 객체 생성 가능
        OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();

        // 객체 사용 방법은 일반 객체 사용 방법과 동일함
        staticNested.setValue(3);
        System.out.println(staticNested.getValue());
    }
}
