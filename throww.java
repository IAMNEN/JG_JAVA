import java.sql.SQLOutput;

public class throww {
    public static void vote(int n) {
        if (n < 18) {
            throw new ArithmeticException("Exception Trigger");
        }else {
            System.out.println("Welcome to the vote program");
        }
    }
    public static void main(String[] args) {
            try {
                throww.vote(10);
            }catch(ArithmeticException e){
                System.out.println("Exception Trigger ");
            }
        }
    }