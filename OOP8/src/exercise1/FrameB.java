package exercise1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.Timer;

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
    private final Timer timer;

    public FrameB() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 700);
         
        p = new PaintPanel();
        p.setDoubleBuffered(true);
        p.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                p.createBall(new Vector(e.getX(), e.getY()));
            }
        });
        
        p.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                p.createBall(new Vector(e.getX(), e.getY()));
            }
        });
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                timer.stop();
                super.windowClosing(e);
            }
        });
        
        add(p);
        
        timer = new Timer(15, (ActionEvent e) -> {
            p.repaint();
        });
        timer.start();
        
        setVisible(true);
    }

    public static void main(final String[] args) {
        EventQueue.invokeLater(() -> new FrameB());
    }
}
