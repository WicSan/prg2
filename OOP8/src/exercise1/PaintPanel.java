/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author sandr
 */
public class PaintPanel extends JPanel{
    private final LinkedList<Ball> balls;
    
    public PaintPanel(){
        balls = new LinkedList<>();
    }

   @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        
        for(Ball b : balls){
            Vector v = b.getPosition();
            g2D.setColor(b.getColor());
            g2D.fillOval(v.getX(), v.getY(), b.getRadius(), b.getRadius());
        }
    }
    
    public void createBall(Vector v){
        Ball b = new Ball(v);
        Thread t = new Thread(b);
        t.start();
        
        balls.add(new Ball(v));
        repaint();
    }
}
