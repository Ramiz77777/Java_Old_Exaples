package Scheduledexecutorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerExecutorServiceEx1 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.schedule(new ThreadForScheduledExecutorService(),3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
//        scheduledExecutorService.scheduleAtFixedRate()
    }
}
