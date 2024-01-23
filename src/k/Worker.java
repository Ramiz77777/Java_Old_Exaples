package k;

public class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("Work Start");
//        try {
//            Thread.sleep(2500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("Work Ends");
    }
}
