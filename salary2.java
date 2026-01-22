import java.util.Scanner;

public class salary2 {
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

        double ta = 0.0;
        double ma = 0.0;
        double pf = 0.0;
        double it = 0.0;

        if(salary<=30000){
            ta = salary*5/100;
            ma = salary*2.5/100;
            pf = salary*5.5/100;
            it = salary*7/100;
        }else if(salary>30000 && salary<=50000){
            ta = salary*5.5/100;
            ma = salary*3.5/100;
            pf = salary*6.5/100;
            it = salary*9/100;
        }else if(salary>50000 && salary<=80000){
            ta = salary*6/100;
            ma = salary*5/100;
            pf = salary*7/100;
            it = salary*12/100;
        } else{
            ta = salary*7/100;
            ma = salary*5/100;
            pf = salary*8/100;
            it = salary*14/100;
        }


        double grossalary = salary+ta+ma;
        double totalsalary = grossalary-pf-it;

        System.out.println("-----Employees Details-----");
        System.out.println("Company Name: "+comname);
        System.out.println("Employee Name: "+ename);
        System.out.println("Department Name: "+depname);
        System.out.println("Joining Date: "+joiningdate);
        System.out.println("Salary: "+salary);
        System.out.println("-----Calculation-----");
        System.out.println("You PF: "+pf);
        System.out.println("MA : "+ma);
        System.out.println("TA :"+ta);
        System.out.println("IT : "+it);
        System.out.println("Gross Salary: "+grossalary);
        System.out.println("-----Final Salary-----");
        System.out.println("Total Salary: "+totalsalary);


    }
}
