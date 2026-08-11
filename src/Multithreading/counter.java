public class counter {
    int count=0;

    synchronized void iterative(){
        count++;
    }
}
class CounterTest extends Thread{
 counter counter;
    CounterTest(counter toy){
        this.counter=toy;
    }
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            counter.iterative();
        }
    }
}
 void main(String[] args) throws InterruptedException {
 counter counter=new counter();

 CounterTest t1=new CounterTest(counter);
 CounterTest t2=new CounterTest(counter);

 t1.start();
 t2.start();

    t1.join();
    t2.join();
     System.out.println(counter.count);
}