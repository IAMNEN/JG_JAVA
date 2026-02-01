class details{
    int id;
    String name;

    void display(){
        System.out.println("Your ID Is -> "+id);
        System.out.println("Your Name Is -> "+name);
    }
}

public class classexample {

    public static void main(String[] args) {
        details O1 = new details();
        O1.id = 101;
        O1.name = "Nen";
        O1.display();
    }
}
