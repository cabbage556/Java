package chapter06.factoryMethodPattern;

// 팩터리 메서드가 생성하는 객체
public class CatToy extends AnimalToy {
    @Override
    void identify() {
        System.out.println("고양이 장난감 캣타워");
    }
}
