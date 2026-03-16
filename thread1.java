
class number extends Thread {
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
public class thread1 {
    public static void main(String[] args) {
        number a = new number();
        a.start();
        System.out.println("main thread end");
    }
}
