import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number: ");
        int a = sc.nextInt();
        System.out.print("Enter B number: ");
        int b = sc.nextInt();

        System.out.println(" Add Values: " + (a+b));
        System.out.println(" Subtract Values: " + (a-b));

        System.out.print("Enter C number: ");
        double c = sc.nextDouble();

        System.out.print("Enter D number: ");
        double d = sc.nextDouble();

        System.out.println("Multiplication Values: " + (c*d));
        System.out.println("Division Values: " + (c/d));

        System.out.print("Enter E number: ");
        float e = sc.nextFloat();
        System.out.print("Enter F number: ");
        float f = sc.nextFloat();

        System.out.println("Modulus Values A and B: " + (e%f));

    }
}
