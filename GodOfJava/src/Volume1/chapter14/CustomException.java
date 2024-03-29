package Volume1.chapter14;

public class CustomException {

    public static void main(String[] args) {
        CustomException sample = new CustomException();
        try {
            sample.throwMyException(13);
        } catch (MyException myE) {
            myE.printStackTrace();
        }
    }

    public void throwMyException(int number) throws MyException {
        if (number > 12) {
            throw new MyException("Number is over than 12");
        }
    }
}
