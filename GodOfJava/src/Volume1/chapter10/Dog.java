package Volume1.chapter10;

public class Dog extends Animal {

    public Dog(String name, String breed, int legCount) {
        super(name, breed, legCount);
        System.out.println("Dog.Dog");
    }

    @Override
    void move() {
        System.out.println("Dog.move");
    }

    @Override
    void eat() {
        System.out.println("Dog.eat");
    }

    @Override
    void sleep() {
        System.out.println("Dog.sleep");
    }
}
