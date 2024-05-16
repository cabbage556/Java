package Volume1.chapter06;

// 연습문제 : InterestManager 클래스 작성하기
public class InterestManager {
    public static void main(String[] args) {
        InterestManager manager = new InterestManager();
        for (int day = 1; day <= 365; day++) {
            double amount = manager.calculateAmount(day, 1000000);
            System.out.println("day: " + day + ", amount: " + amount);
        }
        // for (int day = 10; day <= 365; day += 10) {
        //     double amount = manager.calculateAmount(day, 1000000);
        //     System.out.println("day: " + day + ", amount: " + amount);
        // }
    }

    public double getInterestRate(int day) {
        if (day >= 365) {
            return 5.6;
        } else if (day >= 181) {
            return 2;
        } else if (day >= 91) {
            return 1;
        } else if (day >= 1) {
            return 0.5;
        }

        return 0;
    }

    public double calculateAmount(int day, long amount) {
        double rate = getInterestRate(day);
        double interest = amount * rate / 100;
        return amount + interest;  // 예치금 + 이자
    }
}
