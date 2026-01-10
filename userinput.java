import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your RollNumber: ");
        int rollnumber = sc.nextInt();
        //int -> string then add below line String -> int not requied
        sc.nextLine();

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.println("..........Student Details..........");
        System.out.println("Name -> " + name);
        System.out.println("RollNumber -> " + rollnumber);

    }
}
