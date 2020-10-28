package multithreading;


public class ThreadWaitDemo implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Inside Thread "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread( new ThreadWaitDemo());
        Thread t2 = new Thread(new ThreadWaitDemo());
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Ended");


    }


}
