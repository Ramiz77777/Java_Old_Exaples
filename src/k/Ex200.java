package k;

public class Ex200 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(Thread.currentThread().getName() + " End");
    }
}
