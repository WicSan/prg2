/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss;

/**
 *
 * @author sandr
 */
public class MyWaiter implements Runnable {
    private final Object lock;
    public MyWaiter(Object lock) {
        this.lock = lock;
    }
    
    @Override
    public void run() {
        System.out.println("warten...");
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException ex) {
                /* handling...*/
            }
        }
        System.out.println("...aufgewacht");
    }
}
