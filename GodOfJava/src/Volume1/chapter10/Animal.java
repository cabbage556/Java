package Volume1.chapter10;

public class Animal {
    String name;
    String breed;
    int legCount;

    public Animal(String name, String breed, int legCount) {
        this.name = name;
        this.breed = breed;
        this.legCount = legCount;
    }

    void move() {
        System.out.println("Animal.move");
    }

    void eat() {
        System.out.println("Animal.eat");
    }

    void sleep() {
        System.out.println("Animal.sleep");
    }
}
