package Scheduledexecutorservice;

public class ThreadForScheduledExecutorService implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " End");
    }
}
