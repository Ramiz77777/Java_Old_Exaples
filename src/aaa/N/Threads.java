package aaa.N;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        Thread thread1 = new Thread(new MobileCall());

        Thread thread2 = new Thread(new SkypeCall());
        Thread thread3 = new Thread(new WatsAppCall());
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Main ends");
        ExecutorService executorService = Executors.newFixedThreadPool(4);
    }


}
