package Volume1.chapter08;

public class ReferenceReturn {
    public static void main(String[] args) {
        ReferenceReturn reference = new ReferenceReturn();
        System.out.println(reference.intReturn());
        System.out.println(reference.intArrayReturn());
        System.out.println(reference.stringReturn());
    }

    public int intReturn() {
        int returnInt = 0;
        return returnInt;
    }

    public int[] intArrayReturn() {
        int[] returnIntArray = new int[1];
        return returnIntArray;
    }

    public String stringReturn() {
        String returnString = "return value";
        return returnString;
    }

    public int calculateAfterIntReturn() {
        int returnInt = 0;
        return returnInt;
        // returnInt++;  // return 문장 이후 어떤 문장도 있으면 안 됨 -> 컴파일 에러 발생
    }

    public int ifConditionIntReturn() {
        int returnInt = 0;

        // if문 안에 return 문장이 있으면 그 이외의 경우가 있으므로 return 문장이 하나의 메서드에 두 개 이상 있어야 함
        if (returnInt == 0) {
            return ++returnInt;
        }
        return --returnInt;
    }

    public void wantToStopInTheMiddle(boolean flag) {
        // ...

        // 리턴 타입이 void인 메서드를 바로 종료하려면 return;을 사용함
        if (flag) return;

        // ...
    }
}
