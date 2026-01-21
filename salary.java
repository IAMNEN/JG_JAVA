import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Company Name ->");
        String comname = sc.nextLine();
        System.out.print(" Enter Employee Name ->");
        String ename = sc.nextLine();
        System.out.print(" Enter Department Name ->");
        String depname = sc.nextLine();
        System.out.print(" Enter Salary ->");
        double salary = sc.nextDouble();

        sc.nextLine();
        System.out.print(" Enter Joining Date ->");
        String joiningdate = sc.nextLine();

        double ta = salary*5/100;
        double ma = salary*2.5/100;

        double grossalary = salary+ta+ma;

        double pf = grossalary*12/100;

        double totalsalary = grossalary-pf;

        System.out.println("Company Name: "+comname);
        System.out.println("Employee Name: "+ename);
        System.out.println("Department Name: "+depname);
        System.out.println("Joining Date: "+joiningdate);
        System.out.println("Salary: "+salary);
        System.out.println("You PF: "+pf);
        System.out.println("Gross Salary: "+grossalary);



    }
}
