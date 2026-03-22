class ageException extends Exception {
    public ageException(String msg) {
        super(msg);
    }
}

public class userdiffindex {

    static void checkage (int age) throws ageException {
        if(age < 18){
            System.out.println("Age " + age + " is less than 18");
        }
        System.out.println("Done");
    }

    public static void main(String[] args) {
        try{
            checkage(19);
        }catch(ageException e){
            System.out.println("Error :" + e.getMessage());
        }
    }

}
