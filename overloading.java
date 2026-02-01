public class overloading {
    double a ;
    double b ;
    overloading(){
        a = 1.0;
        b = 1.0;
    }
    overloading(double length,double width){
        a = length;
        b = width;
    }
    void display(){
        System.out.println("Length ->"+a);
        System.out.println("Width ->"+b);
        System.out.println("Ans ->"+a*b);
    }
    public static void main(String[] args) {
        overloading s1 = new overloading();
        s1.display();
    }
}
