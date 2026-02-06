class person{
    String name;
    int age;
    person(String n, int a){
        name = n;
        age = a;
    }
    void displayperson(){
        System.out.println("Name -> "+ name);
        System.out.println("Age -> "+ age);
    }
}
class student extends person{
    int rollno;
    student(String n,int a,int r){
        super(n,a);
        rollno = r;
    }
    void displaystudent(){
        displayperson();
        System.out.println("Rollno -> "+ rollno);
    }
}

public class singleinheritancedemo {
    public static void main(String[] args) {
        student s1 = new student("Nen",20,241366);
        s1.displaystudent();
    }
}
