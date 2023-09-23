package aaa.Marker;

public class App {
    public static void main(String[] args) {
        Market market = new Market();
        Consumer consumer = new Consumer(market);
        Producer producer = new Producer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}
