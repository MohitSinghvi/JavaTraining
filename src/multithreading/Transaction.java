package multithreading;

public class Transaction implements Runnable{
    private Bank bank;
    private int fromAccount;


    public  Transaction(Bank bank, int fromAccount) {
        // TODO Auto-generated constructor stub
        this.bank = bank;
        this.fromAccount = fromAccount;
    }

    @Override
    public void run() {

        while(true) {

            int toAccount = (int) (Math.random() * Bank.MAX_ACCOUNT);

            if(toAccount == fromAccount)
                continue;

            int amount = (int) (Math.random() * Bank.MAX_AMOUNT);

            if(amount == 0)
                continue;

            bank.transfer(fromAccount, toAccount, amount);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}
