package chapter05.srp.refac;

// 단일 책임 원칙을 적용해 Dog 클래스 리팩터링
//      상위 Dog 추상 클래스를 상속하고, 클래스 역할에 맞게 메서드 오버라이딩
public class FemaleDog extends Dog {
    @Override
    void pee() {
        // 암컷이 소변 보기
    }
}
