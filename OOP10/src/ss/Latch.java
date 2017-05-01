package ss;

public class Latch implements Synch {

    private boolean latched = false;

    @Override
    public synchronized void acquire() throws InterruptedException {
        //...Latch anfordern
        while(!latched){
            try{
                this.wait();
            } catch(InterruptedException ie) {/* handling... */}
        }
    }

    @Override
    public synchronized void release() {
        //...Latch freigeben
        latched = true;
        this.notifyAll();
    }
}
