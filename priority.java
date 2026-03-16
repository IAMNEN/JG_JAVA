class PriorityThread extends Thread {
    String name;
    public  PriorityThread (String name2) {
     name = name2;
    }
    public void run(){
        for (int i = 0 ; i <= 3 ; i++){
            System.out.println(name + "Priority :" + Thread.currentThread().getPriority() + "Count -" +i);
        }
    }
}

public class priority {
    public static void main(String[] args) {
        PriorityThread p1 = new PriorityThread("Low Priority");
        PriorityThread p2 = new PriorityThread("Normal Priority");
        PriorityThread p3 = new PriorityThread("High Priority");

        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.NORM_PRIORITY);
        p3.setPriority(Thread.MAX_PRIORITY);

        p1.start();
        p2.start();
        p3.start();
    }
}
