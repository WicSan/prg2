package exercise1;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sandr
 */
public class FrameB extends JFrame {
    private PaintPanel p;

    public FrameB() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 700);
        
        p = new PaintPanel();
        p.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                p.createBall(new Vector(evt.getX(), evt.getY()));
            }
        });
        
        Thread t = new Thread(() -> { 
            p.repaint(); 
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(FrameB.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        t.start();
        
        add(p);
        setVisible(true);
    }

    public static void main(final String[] args) {
        EventQueue.invokeLater(() -> new FrameB());
    }
}
