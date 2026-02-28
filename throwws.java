
public class throwws {
    static void display(int a) throws IllegalArgumentException {
        if(a < 18){
            throw new IllegalArgumentException("Age must be greater than 18");
        }else{
            System.out.println("Age " + a);
        }
    }
    public static void main(String[] args) {
        try{
            throwws.display(10);
        }catch(IllegalArgumentException e){
            System.out.println("Exception Handle -> " + e);
        }
        finally {
            System.out.println("All Done");
        }
    }
}
