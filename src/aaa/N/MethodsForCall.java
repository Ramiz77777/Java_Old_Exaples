package aaa.N;

public class MethodsForCall {
    void MobileCall() {
        synchronized (Lock.lock1) {
            System.out.println("Mobile is call start");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call end ");
        }
    }
    void WatsAppCall() {
        synchronized (Lock.lock1) {
            System.out.println("WatsApp is call start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WatsApp call end ");
        }
    }
    void SkypeCall() {
        synchronized (Lock.lock1) {
            System.out.println("SkypeCall is  start");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("SkypeCall  end ");
        }
    }

}
