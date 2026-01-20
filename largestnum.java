import java.util.Scanner;

public class largestnum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);





        int one = sc.nextInt();
        System.out.println("Enter First Number: "+ one);
        int two = sc.nextInt();
        System.out.println("Enter Second Number: "+ two);
        int three = sc.nextInt();
        System.out.println("Enter Third Number: " + three);


        if(one>two && one>three){
            System.out.println("The largest number is "+ one);
        }else if(two>one&& two>three){
            System.out.println("The largest number is "+ two);
        }else {
            System.out.println("The largest number is "+ three);
        }




    }
}
