import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        System.out.print("Enter your RollNumber: ");
        int rollnumber = sc.nextInt();
        System.out.println("..........Student Details..........");
        System.out.println("Age -> " + age);
        System.out.println("RollNumber -> " + rollnumber);

    }
}
