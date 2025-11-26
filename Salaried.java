public class Salaried extends Employee {
    double weeklySalary;

    @Override
    public void load(java.util.Scanner input) {
        super.load(input);

        System.out.print("Weekly Salary: ");
        weeklySalary = Double.parseDouble(input.nextLine());
        System.out.println();
    }

    @Override
    public double getEarnings() {
        return weeklySalary;
    }
}
