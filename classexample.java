class details{
    int id ;
    String name;

    void display() {
        System.out.println("id : " + id);
        System.out.println("name : " + name);
    }
}

public class classexample {

    public static void main(String[] args) {
        details obj = new details();
        obj.id =241366;
        obj.name ="Nen";
        obj.display();
    }
}
