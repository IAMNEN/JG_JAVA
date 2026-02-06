class person1 {
    String name;
    int age;
    person1(String n,int a){
        name = n;
        age = a ;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
class emp extends person1{
    int salary;
    emp(String n,int a , int s){
        super(n,a);
        salary = s;
    }
    void display2(){
        display();
        System.out.println(salary);
    }
}
public class practice {
    public static void main(String[] args) {
        emp e1 = new emp("Nen",20,50000);
        e1.display2();
    }
}
