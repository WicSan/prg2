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

public class TestWaitPool {
    public static void main(String[] args) {
        Object lock = new Object();
        MyWaiter waiter = new MyWaiter(lock);
        new Thread(waiter).start();
        try {
            Thread.sleep(1000);
            synchronized (lock) {
                lock.notify();
            }
        } catch (InterruptedException ex) {
            /* handling...*/
        }
    }
}
