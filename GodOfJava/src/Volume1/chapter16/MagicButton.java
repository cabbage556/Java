package Volume1.chapter16;

public class MagicButton {

    public MagicButton() {}

    private EventListener listener;

    // EventListener 인스턴스를 받아 listener 인스턴스 변수를 설정함
    public void setListener(EventListener listener) {
        this.listener = listener;
    }

    // 인스턴스 변수 listener의 onClick() 메서드를 호출함
    public void onClickProcess() {
        if (listener != null) {
            listener.onClick();
        }
    }
}
