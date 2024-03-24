package Volume1.chapter05;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();

        double monthlySalary = salaryManager.getMonthlySalary(20_000_000);
        System.out.println("월급: " + monthlySalary + "원");
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary = yearlySalary / 12.0;

        double tax = calculateTax(monthlySalary);
        double nationalPension = calculateNationalPension(monthlySalary);
        double healthInsurance = calculateHealthInsurance(monthlySalary);
        System.out.println("근로 소득세: " + tax + "원");
        System.out.println("연금: " + nationalPension + "원");
        System.out.println("건강 보험료: " + healthInsurance + "원");

        double totalTax = tax + nationalPension + healthInsurance;
        monthlySalary -= totalTax;

        return monthlySalary;
    }

    public double calculateTax(double monthlySalary) {
        return monthlySalary * 0.125;  // 근로 소득세율: 12.5%
    }

    public double calculateNationalPension(double monthlySalary) {
        return monthlySalary * 0.081;  // 연금 세율: 8.1%
    }

    public double calculateHealthInsurance(double monthlySalary) {
        return monthlySalary * 0.135;  // 건강 보험료 세율: 13.5%
    }
}
