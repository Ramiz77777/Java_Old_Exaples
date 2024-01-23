package k;

public class WorkerDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts ");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());
        System.out.println("Main Ends ");
    }
}
