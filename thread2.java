class MyThread extends Thread {
    String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ":" + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(threadName + "interrupted");
            }
        }
        System.out.println(threadName + "Finished execution");
    }

    public class thread2 {
        public static void main(String[] args) {
            MyThread t1 = new MyThread("Thread-1");
            MyThread t2 = new MyThread("Thread-2");

            t1.start();
            t2.start();
        }
    }
}