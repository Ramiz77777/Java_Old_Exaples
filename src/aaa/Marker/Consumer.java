package aaa.Marker;

public class Consumer implements Runnable{

    Market market = new Market();

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            market.breadBuy();
        }

    }
}
