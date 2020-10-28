package multithreading;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i%5==0){
                Thread.currentThread().interrupt();
            }

        }

    }
}
