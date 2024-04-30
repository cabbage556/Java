package chapter06.factoryMethodPattern;

// Cat 클래스에서 오버라이딩한 팩터리 메서드가 생성하는 객체
public class CatToy extends AnimalToy {
    @Override
    void identify() {
        System.out.println("고양이 장난감 캣타워");
    }
}
