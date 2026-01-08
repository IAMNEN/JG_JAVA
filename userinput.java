import java.util.*;

class userinput {
    public static void main(String[] args) {
        System.out.print("Hello Your Name -> ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Nice Name "+name);
    }
}
