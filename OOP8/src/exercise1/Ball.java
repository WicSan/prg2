/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author sandr
 */
public class Ball implements Runnable{

    private int radius;
    private Color c;
    private Vector speed;
    private Vector position;

    public Ball(Vector v) {
        Random r = new Random();
        setRadius(20 + r.nextInt(30));
        setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
        setSpeed(new Vector(1 + r.nextInt(5), 0));
        setPosition(v);
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
        position.add(speed);
        try {
            Thread.sleep(5);
        } catch (InterruptedException ex) {
        }
    }
}
