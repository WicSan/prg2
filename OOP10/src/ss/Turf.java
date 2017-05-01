package ss;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Turf {

    public static void main(String[] args) {
        Synch starterBox = new Latch();

        for (int i = 1; i < 6; i++) {
            new Thread(new RaceHorse(i, starterBox)).start();
        }
        starterBox.release();
    }
}
