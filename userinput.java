import java.util.*;

class userinput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UserName ->");
        System.out.println("Enter Password ->");
        String username = "nen";
        String password = "nen123";
        String newusername = sc.nextLine();
        String newpassword = sc.nextLine();

        if (newpassword.equals(password) && newusername.equals(username)) {
            System.out.println("Login Successful");
            System.out.println("Welcome "+username);
        }
        else {
            System.out.println("Login Failed");
        }

    }
}