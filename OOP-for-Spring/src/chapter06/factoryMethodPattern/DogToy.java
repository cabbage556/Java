package chapter06.factoryMethodPattern;

// Dog 클래스에서 오버라이딩한 팩터리 메서드가 생성하는 객체
public class DogToy extends AnimalToy {
    @Override
    void identify() {
        System.out.println("강아지 장난감 테니스공");
    }
}
