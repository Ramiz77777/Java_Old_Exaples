package fordelete.mnogopotocnost;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> mylist = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            mylist.add(i);
        }
        List<Integer> synchronList = Collections.synchronizedList(mylist);
        Runnable runnable = () -> {
            synchronized (synchronList) {
                Iterator<Integer> iterator = synchronList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };
        Runnable runnable1 = () -> {
                synchronList.remove(10);
                };


        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable1);
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println(synchronList);
    }
}

