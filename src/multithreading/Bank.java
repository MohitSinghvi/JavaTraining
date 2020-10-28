package multithreading;

public class Bank {
    public static final int MAX_ACCOUNT = 10;

    public static final int INITIAL_BALANCE = 100;

    public static final int MAX_AMOUNT = 10;

    private Account[] accounts = new Account[MAX_ACCOUNT];

    public Bank() {

        for(int i=0; i<accounts.length; i++) {
            accounts[i] = new Account(INITIAL_BALANCE);		//account[0]   account[1]  account[2]....
        }
    }

    //						  1        5        3
    public synchronized void transfer(int from, int to, int amount) {

        if(amount <= accounts[from].getBalance()) {

            accounts[from].withdraw(amount);
            accounts[to].deposit(amount);

            String message = "%s transferred %d from %s to %s. Total Balance: %d\n";
            String threadName = Thread.currentThread().getName();

            System.out.printf(message, threadName, amount, from, to, getTotalBalance());

        }
    }

    public int getTotalBalance() {
        int sum = 0;
        for(int i=0; i<accounts.length; i++) {
            sum += accounts[i].getBalance();
        }
        return sum;
    }
}
