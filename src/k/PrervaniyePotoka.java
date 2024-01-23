package k;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrervaniyePotoka {
    static final Lock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Exec exec = new Exec();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Exec());
        }




        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println(exec.counter);
    }


}
class Exec implements Runnable {
         int counter = 0;

    @Override
    public void run() {

             for (int i = 0; i < 100000000; i++) {
                 System.out.println(Thread.currentThread().getName());
                 try {
                     Thread.sleep(500);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
                 counter++;
                 System.out.println(counter);
             }





    }
}
