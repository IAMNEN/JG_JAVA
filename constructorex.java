public class constructorex {
    int roll;
    String name;

    constructorex(int r ,String n){
        roll = r;
        name = n;
    }

    public static void main(String[] args) {
        constructorex s1 = new constructorex(1,"I.Am_Nen");
        System.out.println(s1.roll);
        System.out.println(s1.name);
    }
}
