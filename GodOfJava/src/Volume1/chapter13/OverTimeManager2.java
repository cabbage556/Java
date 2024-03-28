package Volume1.chapter13;

public class OverTimeManager2 {

    public static void main(String[] args) {
        OverTimeValues2 value2 = OverTimeValues2.FIVE_HOUR;
        int amount = value2.getAmount();
        System.out.println("value2 = " + value2);
        System.out.println("amount = " + amount);

        OverTimeValues2 value3 = OverTimeValues2.THREE_HOUR;
        System.out.println(value2.compareTo(value3));
    }
}
