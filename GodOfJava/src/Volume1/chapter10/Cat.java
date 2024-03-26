package Volume1.chapter10;

public class Cat extends Animal {

    public Cat(String name, String breed, int legCount) {
        super(name, breed, legCount);
        System.out.println("Cat.Cat");
    }

    @Override
    void move() {
        System.out.println("Cat.move");
    }

    @Override
    void eat() {
        System.out.println("Cat.eat");
    }

    @Override
    void sleep() {
        System.out.println("Cat.sleep");
    }
}
