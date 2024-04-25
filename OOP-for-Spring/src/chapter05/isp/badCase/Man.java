package chapter05.isp.badCase;

// 하나의 클래스에 너무 많은 역할과 책임이 있음
public class Man {
    // 남자친구 역할
    void dateWithGirlfriend() {
        System.out.println("여자친구와 데이트하기");
    }

    // 아들 역할
    void massageMother() {
        System.out.println("어머니 안마하기");
    }

    // 사원 역할
    void goToWork() {
        System.out.println("출근하기");
    }

    // 군인 역할
    void shoot() {
        System.out.println("사격하기");
    }
}
