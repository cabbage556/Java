package chapter06.templateCallbackPattern.refac;

// 기존 컨텍스트 리팩터링
//      익명 전략 객체 생성 메서드가 추가됨
public class Soldier {
    void runContext(String weaponSound) {
        System.out.println("전투 시작");

        // 익명 전략 객체 생성 후 전략 메서드 호출
        executeWeapon(weaponSound).runStrategy();

        System.out.println("전투 종료");
    }

    // 익명 전략 객체 생성 메서드
    private Strategy executeWeapon(final String weaponSound) {
        // 익명 전략 객체 생성
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };
    }
}
