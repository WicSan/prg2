/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author sandr
 */
public class MyApplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        Timer timer = new Timer(1000, (ActionEvent e) -> {
            repaint();
        });
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font f = new Font("Arial", Font.BOLD, 30);
        g.setFont(f);
        g.drawString(new Date().toString(), 50, 25);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
