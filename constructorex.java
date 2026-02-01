public class constructorex {
    int rollno;
    String name;

    constructorex(int r , String n){
        rollno = r;
        name = n;
    }
    public static void main(String[] args) {
        constructorex O1 = new constructorex(241366 , "Nen");
        System.out.println("Roll No -> "+O1.rollno);
        System.out.println("Name -> "+O1.name);
    }
}
