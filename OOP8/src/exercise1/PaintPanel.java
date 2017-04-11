package exercise1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import javax.swing.JPanel;
import java.util.Timer;

/**
 *
 * @author sandr
 */
public class PaintPanel extends JPanel{
    private final LinkedBlockingQueue<Ball> balls;
    //private final ExecutorService executor = Executors.newCachedThreadPool();
    private final Timer timer = new Timer();
    
    public PaintPanel(){
        balls = new LinkedBlockingQueue<>();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        
        Iterator<Ball> iterator = balls.iterator();
        while(iterator.hasNext()){
            Ball b = iterator.next();
            
            if(b.isAlive()){
                Vector v = b.getPosition();
                g2D.setColor(b.getColor());
                g2D.fillOval(v.getX(), v.getY(), b.getRadius() * 2, b.getRadius() * 2);
            } else {
                balls.remove(b);
            }
        }
    }
    
    public void createBall(Vector v){
        Ball b = new Ball(v, this);
        b.setPosition(new Vector(v.getX() - b.getRadius(), v.getY() - b.getRadius()));
        try {
            balls.put(b);
            
            timer.schedule(b, 0, 20);
        } catch (InterruptedException ex) {
        }
    }
}
