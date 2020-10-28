package multithreading;

public class MultiThreadingDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();

        for(int i=0; i<10; i++) {
            Thread t1 = new Thread(new Transaction(bank, i));
            t1.start();
        }
    }
}
