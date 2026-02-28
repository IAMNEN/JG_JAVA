public class arrayindexoutofbounds {
    public static void main(String[] args) {
        int[] number = {10,20,30,40,50,60};

        try{
            System.out.println("Element At Index 2 -> "+number[2]);
            System.out.println("Element At Index 6 -> "+number[6]);
            System.out.println("Try Block");
        }catch(ArithmeticException e){
            System.out.println("Exception Trigger" + e);
        }
//        finally {
//            System.out.println("Finally Block");
//        }
    }
}
