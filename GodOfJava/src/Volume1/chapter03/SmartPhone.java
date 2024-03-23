package Volume1.chapter03;

public class SmartPhone {
    boolean isDisplayOn;
    boolean isMuteModeOn;

    public void turnDisplayOn() {
        isDisplayOn = true;
    }

    public void turnDisplayOff() {
        isDisplayOn = false;
    }

    public void setMuteOn() {
        isMuteModeOn = true;
    }

    public void setMuteOff() {
        isMuteModeOn = false;
    }
}
