class super1 {
    super1(String name){
        System.out.println("Super Class Method ->" + name);
    }
}

class sub1 extends super1{
    sub1(String name){
        super(name);
        System.out.println("Sub Class Method ->" + name);
    }
}

public class superconstructor {
    public static void main(String[] args) {
        sub1 sub = new sub1("Nen");
    }
}
