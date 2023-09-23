package aaa.Thread;

public class SynchronizedForCall {
    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("Mobile is call start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call end ");
        }
    }


    void watsAppCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("WatsApp is call start");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WatsApp call end ");
        }
    }
    void skypeCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("SkypeCall is  start");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("SkypeCall  end ");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new WatsAppCall());
        Thread thread2 = new Thread(new SkypeCall());
        Thread thread3 = new Thread(new MobileCall());
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
class WatsAppCall implements Runnable{

    @Override
    public void run() {
        new SynchronizedForCall().watsAppCall();
    }
}
class SkypeCall implements Runnable{

    @Override
    public void run() {
        new SynchronizedForCall().skypeCall();
    }
}
class MobileCall implements Runnable{

    @Override
    public void run() {
        new SynchronizedForCall().mobileCall();
    }
}




