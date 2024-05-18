package Volume1.chapter08;

public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck check = new StaticBlockCheck();
        // check.makeStaticBlockObject();
        check.makeStaticBlockObjectWithData();
    }

    public void makeStaticBlockObject() {
        // 클래스 첫 참조 시 static 블록들이 호출됨
        //      첫 번째 StaticBlock 객체 생성 전 static 블록들이 선언된 차례대로 호출됨
        System.out.println("Creating block1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("Created block1");

        System.out.println("-------------------");

        // static 블록은 한 번 호출되면 다시 호출되지 않음
        //      두 번째 StaticBlock 객체 생성 시 static 블록들이 호출되지 않음
        //      첫 번째 StaticBlock 객체를 생성할 때 한 번 호출되었기 때문
        System.out.println("Creating block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("Created block2");
    }

    public void makeStaticBlockObjectWithData() {
        // 클래스 첫 참조 시 static 블록들이 호출됨
        //      static 블록들이 선언된 차례대로 호출되고, StaticBlock.getDate() 클래스 메서드를 호출함
        System.out.println("StaticBlock.data = " + StaticBlock.getData());

        // static 블록들이 한 번 호출되면 다시 호출되지 않음
        StaticBlock block1 = new StaticBlock();
        StaticBlock.data = 1;  // data 클래스 변수 수정

        System.out.println("-------------------");

        // static 블록들이 한 번 호출되면 다시 호출되지 않음
        StaticBlock block2 = new StaticBlock();
        StaticBlock.data = 2;  // data 클래스 변수 수정

        // static 블록들이 한 번 호출되면 다시 호출되지 않음
        System.out.println("StaticBlock.data = " + StaticBlock.getData());
    }
}
