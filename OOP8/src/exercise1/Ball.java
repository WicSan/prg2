/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.awt.Color;
import java.awt.Transparency;
import java.util.Random;

/**
 *
 * @author sandr
 */
public class Ball extends Thread{

    private int radius;
    private final PaintPanel panel;
    private Color c;
    private Vector speed;
    private Vector position;

    public Ball(Vector v, PaintPanel p) {
        Random r = new Random();
        setRadius(20 + r.nextInt(30));
        setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
        setSpeed(new Vector(0, 1 + r.nextInt(2)));
        setPosition(v);
        panel = p;
    }

    public final int getRadius() {
        return radius;
    }

    public final Color getColor() {
        return c;
    }

    public final Vector getSpeed() {
        return speed;
    }

    public final Vector getPosition() {
        return position;
    }

    public final void setRadius(int radius) {
        this.radius = radius;
    }

    public final void setColor(Color c) {
        this.c = c;
    }

    public final void setSpeed(Vector speed) {
        this.speed = speed;
    }

    public final void setPosition(Vector position) {
        this.position = position;
    }

    @Override
    public void run() {
        while((panel.getHeight()) > (position.getY() + getRadius() * 2)){
            position.add(speed);
            
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                
            }
        }
        
        while(c.getTransparency() != Transparency.BITMASK){
            c = new Color(c.getRed(), c.getGreen(), c.getBlue(), c.getAlpha() - 15);
            
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                
            }
        }
    }
}
