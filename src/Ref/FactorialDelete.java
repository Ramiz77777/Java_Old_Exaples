package Ref;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FactorialDelete {
    static int factorial ;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialDelete2 factorialDelete2 = new FactorialDelete2(6);
        executorService.execute(factorialDelete2);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println(factorial);
    }
}
class FactorialDelete2 implements Runnable {
int f ;

    public FactorialDelete2(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if(f <= 0){
            System.out.println("VVedite cislo bolshe nula ");
            return;
        }
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res = res*i;
        }
        FactorialDelete.factorial= res;
    }


}
