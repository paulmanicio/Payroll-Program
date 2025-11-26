import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PayrollDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.print("Number of Employees: ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 1; i < n + 1; i++) {
            System.out.println("PROFILE FOR EMPLOYEE #" + i + ":");
            System.out.println();
            System.out.println("Type 1 (Hourly), 2 (Salaried) and 3 (Salaried plus Commission)");
            System.out.print("Enter 1, 2, or 3: ");

            int type = Integer.parseInt(input.nextLine());
            Employee employee;

            if (type == 1) {
                employee = new Hourly();
            } else if (type == 2) {
                employee = new Salaried();
            } else {
                employee = new SalariedPlusComission();
            }

            employee.load(input);
            employees.add(employee);
        }

        System.out.println("PAYCHECK REPORT:");
        System.out.println();

        for (Employee emp : employees) {
            double pay = emp.getEarnings();

            pay = emp.addBirthdayBonus(pay);

            if (pay > Employee.PAYCHECK_MAX)
                pay = Employee.PAYCHECK_MAX;

            System.out.println("Employee: " + emp.name);
            System.out.println("Social Security Number: " + emp.socialSecurityNumber);
            System.out.printf("Paycheck: $%.2f%n%n", pay);
        }

        input.close();
    }
}
