package com.company;
//class MyThread extends Thread{
//    @Override
//    public void run() {
//        for(int i=0;i<50;i++){
//            System.out.println("thread1");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

class myThread implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<50;i++){
            System.out.println("thread1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {


        myThread myThread = new myThread();

        Thread t = new Thread(myThread);
        t.start();

        for(int i=0;i<50;i++){

            System.out.println("Main thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
