class super_class0 {
    int b = 10;
}
class sub_class0 extends super_class0 {
    int b = 20;
    void show(){
        System.out.println("Sub_class Variable -> "+b);
        System.out.println("Super_class Variable -> "+super.b);
    }
}

public class supervariable {
    public static void main(String[] args) {
        sub_class0 sub1 = new sub_class0();
        sub1.show();
    }
}
