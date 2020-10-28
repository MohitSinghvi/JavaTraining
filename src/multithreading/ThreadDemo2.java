package multithreading;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable myThread2 = new MyThread2();

        Thread thread = new Thread(myThread2);
        thread.start();
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i%5==0){
                thread.interrupt();
            }

        }
    }
}
