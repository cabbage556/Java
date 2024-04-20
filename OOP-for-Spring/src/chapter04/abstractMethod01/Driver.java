package chapter04.abstractMethod01;

public class Driver {
    public static void main(String[] args) {
        /*
        추상 메서드를 사용하는 이유
            Animal 상위 클래스 타입의 참조 변수로 하위 클래스의 인스턴스가 가진 cry() 메서드를 호출하고 있기 때문에
            Animal 클래스에는 cry() 메서드가 반드시 존재해야 함
            Animal 클래스의 인스턴스를 생성해 cry() 메서드를 호출하는 것은 약간 어색하고 이상함
            이런 경우 추상 메서드를 사용하면 됨
                메서드 선언부는 있지만 구현부는 없는 형태로 메서드를 구현하는 것
         */
        Animal[] animals = {
                new Mouse(),
                new Cat(),
                new Chick()
        };
        for (Animal animal : animals) {
            animal.cry();
        }
    }
}
