package exercise1;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
    private boolean isPressed;

    public FrameB() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 700);
        isPressed = false;
        
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
        
        add(p);
        setVisible(true);
    }

    public static void main(final String[] args) {
        EventQueue.invokeLater(() -> new FrameB());
    }
}
