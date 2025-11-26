public abstract class Employee {
    public static final double PAYCHECK_MAX = 1000.0;
    public static final double BIRTHDAY_BONUS = 100.0;

    String name;
    String socialSecurityNumber;
    int birthMonth;
    int birthWeek;

    public abstract double getEarnings();

    public void load (java.util.Scanner sc) {
        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Social Security Number: ");
        socialSecurityNumber = sc.nextLine();

        System.out.print("Birthday Month (1-12): ");
        birthMonth = Integer.parseInt(sc.nextLine());

        System.out.print("Birthday Week (1-4): ");
        birthWeek = Integer.parseInt(sc.nextLine());
    }

    double addBirthdayBonus(double amount) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        int currentMonth = cal.get(java.util.Calendar.MONTH) + 1;
        int currentWeek = cal.get(java.util.Calendar.WEEK_OF_MONTH);

        if(birthMonth == currentMonth && birthWeek == currentWeek) {
            amount += BIRTHDAY_BONUS;
        }
        return amount;
    }
    public String toStringWithPayCheck() {
        double pay = addBirthdayBonus(getEarnings());
        if(pay > PAYCHECK_MAX) 
            pay = PAYCHECK_MAX;

        return String.format("Employee: %s%n" + "Social Security Number: %s%n" +  "Paycheck: $%.2f", name, socialSecurityNumber, pay);    
    }
}
