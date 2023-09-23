package aaa.Marker;

public class Producer implements Runnable{
    Market methodForMArket = new Market();

    public Producer(Market methodForMArket) {
        this.methodForMArket = methodForMArket;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            methodForMArket.Breadsell();
        }

    }
}
