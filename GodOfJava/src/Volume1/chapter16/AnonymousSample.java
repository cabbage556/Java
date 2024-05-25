package Volume1.chapter16;

/*
    익명 클래스의 장점
        - 클래스를 만들고, 클래스를 참조하면 클래스 정보가 메모리에 적재됨
        - 클래스를 많이 만들고 참조할수록 메모리에 많은 클래스 정보가 적재되어야 하므로, 애플리케이션 시작 시 더 많은 시간이 소요됨
        - 자바에서는 익명 클래스처럼 간단한 방법으로 객체를 생성할 수 있게 해놓았음
 */

public class AnonymousSample {

    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        // sample.setButtonListener();
        sample.setButtonListenerAnonymous();
        sample.setButtonListenerAnonymousObject();
    }

    // 내부 클래스가 EventListener 인터페이스를 구현함
    //      onClick() 메서드를 구현함
    class MagicButtonListener implements EventListener {
        public void onClick() {
            System.out.println("Magin Button Clicked!! - inner class");
        }
    }

    public void setButtonListener() {
        MagicButton button = new MagicButton();

        // 내부 클래스의 객체 생성 후 setListener() 메서드에 전달
        MagicButtonListener listener = new MagicButtonListener();
        button.setListener(listener);

        // 내부 클래스 객체의 onClick() 메서드가 호출됨
        button.onClickProcess();
    }

    public void setButtonListenerAnonymous() {
        MagicButton button = new MagicButton();

        // 익명 클래스의 객체를 생성해 setListener() 메서드에 바로 전달
        button.setListener(new EventListener() {
            @Override
            public void onClick() {
                System.out.println("Magic Button Clicked!! - anonymous class");
            }
        });

        // 익명 클래스 객체의 onClick() 메서드가 호출됨
        button.onClickProcess();
    }

    public void setButtonListenerAnonymousObject() {
        MagicButton button = new MagicButton();

        // 익명 클래스의 객체 생성 후 변수에 저장하면 익명 클래스의 객체를 재사용할 수 있음
        EventListener listener = new EventListener() {
            @Override
            public void onClick() {
                System.out.println("Magin Button Clicked!! - anonymous class");
            }
        };

        // 익명 클래스의 객체 생성 후 setListener() 메서드에 전달
        button.setListener(listener);

        // 익명 클래스 객체의 onClick() 메서드가 호출됨
        button.onClickProcess();
    }
}
