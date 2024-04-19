package chapter03.polymorphism01;

public class Penguin extends Animal {
    public String habitat;

    public void showHabitat() {
        System.out.printf("%s는 %s에 살아.\n", name, habitat);
    }

    // 오버라이딩
    //      상위 클래스의 메서드와 같은 이름, 같은 파라미터 리스트
    public void showName() {
        System.out.println("내 이름은 알아서 뭐하게요?");
    }

    // 오버로딩
    //      같은 메서드 이름, 다른 파라미터 리스트
    public void showName(String yourName) {
        System.out.printf("%s 안녕. 나는 %s라고 해.\n", yourName, name);
    }
}
