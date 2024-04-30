package chapter06.templateMethodPattern;

public class Driver {
    public static void main(String[] args) {
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        // 템플릿 메서드 호출
        bolt.playWithOwner();
        System.out.println();
        kitty.playWithOwner();
    }
}
