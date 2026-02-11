class super_class02 {
    void show(){
        System.out.println("Super Class Method");
    }
}

class sub_class02 extends super_class02{
    void show(){
    super.show();
        System.out.println("Sub Class Method");
    }
}

public class supermethod {
    public static void main(String[] args) {
        sub_class02 sc = new sub_class02();
        sc.show();

    }
}
