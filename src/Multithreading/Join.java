package Multithreading;

public class Join {
    static void main(String[] args) throws InterruptedException {
        Payments p1=new Payments();
        Thread t1=new Thread(p1);
        t1.start();

        t1.join();
        System.out.println("Notification sent . . .");
    }
}
class Payments implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Payment done");
    }
}

