class super_class{
    int i = 0;
    void doOverride(int k){
        i = k;
    }
}
class sub_class extends super_class{
    void doOverride(int k){
        i = 2 * k;
        System.out.println("Sub class -> "+i);
    }
}

public class overriding {
    public static void main(String[] args) {
        super_class obj = new sub_class();
        obj.doOverride(10);
    }
}
