package chapter03.inheritance03;

public class Driver {
    public static void main(String[] args) {
        // Penguin 인스턴스 생성
        //      상위 클래스인 Animal, Object 클래스의 인스턴스도 함께 생성되어 힙 영역에 배치됨
        Penguin pororo = new Penguin();

        pororo.name = "뽀로로";
        pororo.habitat = "남극";

        pororo.showName();
        pororo.showHabitat();

        // pingu 객체참조변수는 Penguin 인스턴스가 아니라 Animal 인스턴스를 참조하고 있음
        //      사실 Penguin 인스턴스이지만 자신이 Animal이라고 인식하고 있는 것
        Animal pingu = new Penguin();

        pingu.name = "핑구";
        // pingu.habitat = "EBS";  // Penguin 인스턴스 변수이므로 사용할 수 없음

        pingu.showName();
        // pingu.showHabitat();    // Penguin 인스턴스 메서드이므로 사용할 수 없음

        /*
        Animal 클래스는 Penguin 클래스의 상위 클래스임
        Animal 인스턴스를 생성하면 Penguin 인스턴스는 생성되지 않음
            하위 클래스의 인스턴스도 생성되지 않기 때문
        따라서 Penguin 타입의 객체참조변수는 Animal 인스턴스를 참조할 수 없음
         */
        // Penguin happyfeet = new Animal();
    }
}
