package chapter05.isp.refac;

// 역할과 책임에 해당하는 인터페이스를 선택해 구현하기
public class Man implements Boyfriend, Son, Employee, Soldier {
    @Override
    public void dateWithGirlfriend() {
        System.out.println("여자친구와 데이트하기");
    }

    @Override
    public void massageMother() {
        System.out.println("어머니 안마하기");
    }

    @Override
    public void goToWork() {
        System.out.println("출근하기");
    }

    @Override
    public void shoot() {
        System.out.println("사격하기");
    }

}
