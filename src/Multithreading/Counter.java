package Multithreading;

class A {
    int count=0;
    synchronized void iterative(){
        count++;
    }
}

class test extends Thread{
 A counter;
    test(A toy){
        this.counter=toy;
    }
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            counter.iterative();
        }
    }
}
 public class Counter {
     static void main(String[] args) throws InterruptedException {
         A counter = new A();

         test t1 = new test(counter);
         test t2 = new test(counter);

         t1.start();
         t2.start();

         t1.join();
         t2.join();
         System.out.println(counter.count);
     }
 }