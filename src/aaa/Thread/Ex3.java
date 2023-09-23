package aaa.Thread;

public class Ex3 extends Thread{
    @Override
    public void run(){
        for (int i = 10;i >0;i--){
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new My());
        thread1.setName("thread 100");
        Ex3 thread2 = new Ex3();
        thread2.setName("thread 200");
        System.out.println("main is start");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Main is end");

    }
}
class My implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
