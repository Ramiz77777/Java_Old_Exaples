package aaa.Thread;

public class Volatile extends Thread{
    volatile boolean b = true;
    public void run(){
        long counter = 0;
        while (b){
            counter++;

        }
        System.out.println("counter посчитал " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Volatile thread1 = new Volatile();
        thread1.start();
        Thread.sleep(3000);
        System.out.println("Main strart");
        thread1.b = false;
        thread1.join();
        System.out.println("Main end");
    }
}
