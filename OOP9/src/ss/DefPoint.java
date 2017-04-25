/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss;

import java.awt.Point;

/**
 *
 * @author sandr
 */
public class DefPoint implements Runnable {
    private final Point p;
    public DefPoint(Point p) {
        this.p = p;
    }
    
    @Override
    public void run() {
        int x = (int) (Math.random() * 1000), y = x;
        while (true) {
            int xc = 0;
            int yc = 0;
            synchronized(p){
                p.x = x;
                p.y = y;
                xc = p.x;
                yc = p.y;
            }

            if (xc != yc) {
                System.out.println("Aha: x=" + xc + ", y=" + yc);
            }
        }
    }
    
    public static void main(String[] args) {
        Point p = new Point();
        new Thread(new DefPoint(p)).start();
        new Thread(new DefPoint(p)).start();
    }
}
