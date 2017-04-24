package exercise1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author sandr
 */
public class FrameB extends JFrame {
    private PaintPanel p;
    private final Timer timer;

    public FrameB() {
        super("Ball");
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
        
        //MouseListener auf dem Panel hinzufügen, da sonst nicht alle Klicks 
        //richtig gefangen werden.
        p.addMouseListener(new MouseAdapter(){
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
        
        timer = new Timer(12, (ActionEvent e) -> {
            p.repaint();
        });
        timer.start();
        
        setVisible(true);
    }

    public static void main(final String[] args) {
        EventQueue.invokeLater(() -> new FrameB());
    }
}
