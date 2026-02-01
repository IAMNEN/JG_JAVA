import java.sql.SQLOutput;

public class staticblock {
    static{
        System.out.println("Static block");
    }
    {
        System.out.println("instant block"); //every next object it will be run
    }
    staticblock(int y){
        System.out.println("Within Parameterized Constructor");
    }
    staticblock(){
        System.out.println("Within Default Constructor");
    }
    public static void main(String[] args) {
        System.out.println("in main");
        staticblock obj = new staticblock(100);
        System.out.println("---------------------------");
        staticblock obj2 = new staticblock();
    }
}
