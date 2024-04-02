package Volume1.chapter16;

public class MyPage {

    public static InputBox input;

    public static void main(String[] args) {
        MyPage page = new MyPage();
        page.setUI();
        page.pressKey();
    }

    public void setUI() {
        input = new InputBox();

        // KeyEventListener 인터페이스를 구현한 익명 클래스
        KeyEventListener listener = new KeyEventListener() {
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            public void onKeyUp() {
                System.out.println("Key Up");
            }
        };
        input.setKeyListener(listener);
    }

    public void pressKey() {
        input.listenerCalled(2);
        input.listenerCalled(4);
    }
}
