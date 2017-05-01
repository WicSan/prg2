package ss;

public interface Synch {

    public void acquire() throws InterruptedException;

    public void release();
}
