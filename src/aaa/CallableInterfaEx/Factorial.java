package aaa.CallableInterfaEx;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Factorial {
    public static int factorial;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new Fact(-5));

        try {
            factorial = future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            executorService.shutdown();
        }
        System.out.println(factorial);
    }
}
