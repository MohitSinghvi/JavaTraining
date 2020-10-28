package multithreading;

class Racer implements Runnable{

    private static String Winner;
    public Thread t;
    public String racername;

    public Racer(String rn) {
        racername = rn;
        t = new Thread(this, racername);
        t.start();
    }

    @Override
    public void run() {
        startrace();
    }

    public void startrace() {
        for(int distance = 1; distance<=100; distance++) {
            System.out.println(racername + " covered : " +distance + " meters");
            boolean isRaceWon = isWon(distance);
            if(isRaceWon) {
                break;
            }
        }
    }
    public boolean isWon(int distance) {
        boolean result;
        if(Racer.Winner==null && distance==100) {
        //declare winner
                Racer.Winner = racername;
                System.out.println("\n\n\t Race Winner is " + Racer.Winner);
                result = true;
        }
        else if(Racer.Winner==null) {
            result = false;
        }
        else if(Racer.Winner!=null) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}


public class HareAndTortoise {

    public static void main(String[] args) {
        Racer tortoise = new Racer("Tortoise");
        Racer hare = new Racer("Hare");
    }
}
