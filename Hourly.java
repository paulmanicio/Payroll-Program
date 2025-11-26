public class Hourly extends Employee {
    double hourlyPay;
    double hoursWorked;

@Override
    public void load (java.util.Scanner sc) {
        super.load(sc);
        
        System.out.print("Hourly Pay: ");
        hourlyPay = Double.parseDouble(sc.nextLine());

        System.out.print("Hours worked during the past week: ");
        hoursWorked = Double.parseDouble(sc.nextLine());
    }

@Override
    public double getEarnings() {
        if (hoursWorked < 40) {
            return hourlyPay * hoursWorked;
        }else {
            double overtime = hoursWorked - 40;
            return (hourlyPay * 40) + (hourlyPay * 1.5 * overtime);
        }
    }
}
