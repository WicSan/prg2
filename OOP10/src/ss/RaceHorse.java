package ss;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RaceHorse implements Runnable {

    private final Synch startSignal;
    private final int nr;

    public RaceHorse(int nr, Synch startSignal) {
        this.nr = nr;
        this.startSignal = startSignal;
    }

    @Override
    public void run() {
        System.out.println("Rennpferd " + nr + " geht in die Box.");
        try {
            startSignal.acquire();
            System.out.println("Rennpferd " + nr + " laeuft los...");
            Thread.sleep((long) (3000.0 * Math.random()));
        } catch (InterruptedException ex) {
            Logger.getLogger(RaceHorse.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Rennpferd " + nr + " ist im Ziel.");
    }
}
