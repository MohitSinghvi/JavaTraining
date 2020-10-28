package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {

        Runnable task = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(5);
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.shutdown();




    }
}
