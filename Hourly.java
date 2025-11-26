public class Hourly extends Employee {
    double hourlyPay;
    double hoursWorked;

    @Override
    public void load(java.util.Scanner input) {
        super.load(input);

        System.out.print("Hourly Pay: ");
        hourlyPay = Double.parseDouble(input.nextLine());

        System.out.print("Hours worked during the past week: ");
        hoursWorked = Double.parseDouble(input.nextLine());
        System.out.println();
    }

    @Override
    public double getEarnings() {
        if (hoursWorked < 40) {
            return hourlyPay * hoursWorked;
        } else {
            double overtime = hoursWorked - 40;
            return (hourlyPay * 40) + (hourlyPay * 1.5 * overtime);
        }
    }
}
