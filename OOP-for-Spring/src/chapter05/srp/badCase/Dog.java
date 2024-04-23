package chapter05.srp.badCase;

public class Dog {
    final static Boolean isMale = true;
    final static Boolean isFemale = true;
    Boolean gender;

    // 메서드가 단일 책임 원칙을 지키지 못하는 경우
    //      이 메서드가 수컷, 암컷 강아지의 행위를 모두 구현하고 있어 단일 책임 원칙을 위배하고 있음
    void pee() {

        // 메서드가 단일 책임 원칙을 지키지 못하면 분기 처리를 위한 if 문이 많이 등장함
        if (gender == isMale) {
            // 수컷이 소변 보기
        } else {
            // 암컷이 소변 보기
        }
    }
}
