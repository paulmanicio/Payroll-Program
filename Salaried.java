public class Salaried extends Employee {
    double weeklySalary;

    @Override
    public void load (java.util.Scanner sc) {
        super.load(sc);
        
        System.out.print("Weekly Salary: ");
        weeklySalary = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double getEarnings() {
        return weeklySalary;
    }
}
