package aaa.Marker;

public class Market {
     int breadcount = 0;

    synchronized void  Breadsell() {

        while (breadcount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadcount++;

        System.out.println("proizvoditel dobavil 1  xleb" );
        System.out.println("xleba v magazine = " + breadcount);
        notify();
    }


    synchronized void breadBuy() {

        while (breadcount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        breadcount--;
        System.out.println("Bread buy in Market");
        System.out.println("ostalos xleba =" + breadcount);
        notify();
    }
}
