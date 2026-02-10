
class student0 {
    String name;
    int age;

    student0(String n , int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println("Name -> "+name);
        System.out.println("Age -> "+age);
    }
}

class student01 extends student0 {
    int rollno;
    student01(String n , int a , int r){
        super(n , a );
        rollno = r;
    }

    void display0(){
        display();
        System.out.println("Rollno -> "+rollno);
    }
}

class manager extends student01 {
    int mamber;
    manager(String n , int a, int r , int m){
        super(n , a , r);
        mamber = m;
    }
    void display01(){
        display0();
        System.out.println("Mamber -> "+mamber);
    }
}

public class multilevelinheritance {
    public static void main(String[] args) {
        manager m1 = new manager("Nen" , 20 , 241366 , 4);
        m1.display01();
    }
}
