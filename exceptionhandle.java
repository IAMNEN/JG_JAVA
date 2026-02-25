public class exceptionhandle {
    //Arithmetic Exception
    public static void main(String[] args) {
        try{
            System.out.println("Hello");
            int a = 15/0;
            System.out.println("Welcome");
        }
        catch(ArithmeticException e){
            System.out.println("Fahhhhhhhhhhhhhhhhh");
        }
        System.out.println("Bye");
    }
}
