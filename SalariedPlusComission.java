public class SalariedPlusComission extends Employee {
    double baseSalary;
    double salesPastWeek;
    double commissionRate;

    @Override
    public void load (java.util.Scanner sc) {
        super.load(sc);
        
        System.out.print("Base Salary: ");
        baseSalary = Double.parseDouble(sc.nextLine());

        System.out.print("Sales during the past week: ");
        baseSalary = Double.parseDouble(sc.nextLine());

        System.out.print("Commission Rate (e.g., 0.50 for 50%): ");
        baseSalary = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double getEarnings() {
        return baseSalary + (salesPastWeek * commissionRate);
    }
}