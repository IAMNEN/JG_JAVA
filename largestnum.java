import java.util.Scanner;

public class largestnum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);


        System.out.print("Enter First Number: ");
        int one = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int two = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int three = sc.nextInt();

        if(one>two && one>three){
            System.out.println("The largest number is "+ one);
        }else if(two>one&& two>three){
            System.out.println("The largest number is "+ two);
        }else {
            System.out.println("The largest number is "+ three);
        }




    }
}
