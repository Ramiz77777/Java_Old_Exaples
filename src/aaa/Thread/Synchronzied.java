package aaa.Thread;

import java.util.concurrent.TimeUnit;

public class Synchronzied {
     long counter = 0;
    public  synchronized void increment(){
        counter++;
        System.out.println(counter);
    }


    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new classForImplemetnsRunnable());
        Thread thread2 = new Thread(new classForImplemetnsRunnable());
//        Thread thread3 = new Thread(new classForImplemetnsRunnable());
        Synchronzied s1 = new Synchronzied();
        thread1.start();
        thread2.start();
//        thread3.start();
        thread1.join();
        thread2.join();
//        thread3.join();
        System.out.println(s1.counter);

        System.out.println("end");
    }

}
class classForImplemetnsRunnable implements Runnable{

    @Override
    public void run() {
        Synchronzied s = new Synchronzied();
        for (int i = 0; i < 100; i++) {
            s.increment();
        }

    }
}
