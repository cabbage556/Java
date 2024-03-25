package Volume1.chapter08;

public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck check = new StaticBlockCheck();
        // check.makeStaticBlockObject();
        check.makeStaticBlockObjectWithData();
    }

    public void makeStaticBlockObject() {
        // 첫 번째 StaticBlock 객체 생성 시 static 블록들이 선언한 차례대로 호출됨
        System.out.println("Creating block1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("Created block1");

        System.out.println("-------------------");

        // 두 번째 StaticBlock 객체 생성 시 static 블록들이 호출되지 않음
        System.out.println("Creating block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("Created block2");
    }

    public void makeStaticBlockObjectWithData() {
        // StaticBlock 클래스를 참조하자마자 static 블록들이 선언한 차례대로 먼저 호출됨
        //      static 블록들이 호출되고, StaticBlock 클래스 메서드를 호출함
        System.out.println("StaticBlock.data = " + StaticBlock.getData());

        StaticBlock block1 = new StaticBlock();
        block1.data = 1;  // data 클래스 변수 수정

        System.out.println("-------------------");

        StaticBlock block2 = new StaticBlock();
        block2.data = 2;  // data 클래스 변수 수정

        System.out.println("StaticBlock.data = " + StaticBlock.getData());
    }
}
