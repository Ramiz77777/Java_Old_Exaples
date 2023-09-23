package k;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex200Demo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i < 10; i++) {
            executorService.execute(new Ex200());
        }

        executorService.shutdown();
    }
}
