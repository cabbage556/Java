package chapter04.abstractMethod02;

public class Driver {
    public static void main(String[] args) {
        Animal[] animals = {
                new Mouse(),
                new Cat(),
                new Chick()
        };
        for (Animal animal : animals) {
            animal.cry();
        }

        // 추상 클래스의 인스턴스를 생성할 수 없음
        // Animal anAnimal = new Animal();
    }
}
