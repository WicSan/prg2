package exercise1;

import java.awt.Color;
import java.awt.Transparency;
import java.util.Random;
import java.util.TimerTask;

/**
 *
 * @author sandr
 */
public class Ball extends TimerTask{
    private final int bottom;
    private int radius;
    private Color c;
    private Vector speed, position;
    private boolean alive;

    public Ball(Vector v, int b) {
        Random r = new Random();
        setRadius(20 + r.nextInt(30));
        setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
        setSpeed(new Vector(0, 1 + r.nextInt(10)));
        setPosition(v);
        bottom = b - 2 * getRadius();
        
        alive = true;
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
    
    public boolean move(){
        if((bottom) > (position.getY() + speed.getY())){
            position.add(speed);
            return true;
        }
        else if((bottom) != (position.getY())){
            position.add(new Vector(0, bottom - position.getY()));
            return true;
        }
        
        return false;
    }
    
    public boolean disapear(){
        if(c.getTransparency() != Transparency.BITMASK){
            c = new Color(c.getRed(), c.getGreen(), c.getBlue(), c.getAlpha() - 1);
            return true;
        }
        
        return false;
    }
    
    public boolean isAlive(){
        return alive;
    }
    
    @Override
    public void run() {
        if(!move()){
            //make shure that all balls disapear
            if(!disapear()){
                alive = false;

                this.cancel();
            }
        }  
    }
}
