package Volume1.chapter16;

public class AnonymousSample {

    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        // sample.setButtonListener();
        sample.setButtonListenerAnonymousObject();
    }

    // EventListener 인터페이스를 구현한 내부 클래스
    class MagicButtonListener implements EventListener {
        public void onClick() {
            System.out.println("Magin Button Clicked!! - inner class");
        }
    }

    public void setButtonListener() {
        MaginButton button = new MaginButton();

        // 내부 클래스의 객체 생성 후 setListener(EventListener) 메서드에 전달
        MagicButtonListener listener = new MagicButtonListener();
        button.setListener(listener);
        button.onClickProcess();
    }

    public void setButtonListenerAnonymousObject() {
        MaginButton button = new MaginButton();

        // 익명 클래스의 객체 생성
        //      익명 클래스의 장점
        //          클래스를 만들고, 클래스를 참조하면 클래스 정보가 메모리에 올라감
        //          즉 클래스를 많이 만들수록 메모리는 많이 필요해지고, 애플리케이션 시작 시 더 많은 시간이 소요됨
        //          따라서 자바에서는 이와 같이 간단한 방법으로 객체를 생성할 수 있게 해놓았음
        EventListener listener = new EventListener() {
            public void onClick() {
                System.out.println("Magin Button Clicked!! - anonymous class");
            }
        };

        // 익명 클래스의 객체 생성 후 setListener(EventListener) 메서드에 전달
        button.setListener(listener);
        button.onClickProcess();
    }
}
