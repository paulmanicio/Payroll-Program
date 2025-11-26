public class SalariedPlusComission extends Employee {
    double baseSalary;
    double salesPastWeek;
    double commissionRate;

    @Override
    public void load(java.util.Scanner input) {
        super.load(input);

        System.out.print("Base Salary: ");
        baseSalary = Double.parseDouble(input.nextLine());

        System.out.print("Sales during the past week: ");
        salesPastWeek = Double.parseDouble(input.nextLine());

        System.out.print("Commission Rate (e.g., 0.50 for 50%): ");
        commissionRate = Double.parseDouble(input.nextLine());
        System.out.println();
    }

    @Override
    public double getEarnings() {
        return baseSalary + (salesPastWeek * commissionRate);
    }
}