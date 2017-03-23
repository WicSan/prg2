/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2b;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author sandr
 */

public class SwingApplication extends JFrame {
    private int numClicks = 0;
    private JLabel label;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new SwingApplication());
    }
    
    public SwingApplication() {
        super("Swing[ing] Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(250, 200));
        
        // Lightweight Components erstellen...
        JButton button = new JButton("Count button clicks");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                numClicks++;
                label.setText("Number Clicks: " + numClicks);
            }
        });
        
        label = new JLabel("Number Clicks: 0");
        label.setBorder(BorderFactory.createEtchedBorder());
        label.setPreferredSize(button.getPreferredSize());
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        // ...und mit Layout hinzufügen
        setLayout(new FlowLayout(FlowLayout.CENTER, 40, 10));
        add(button);
        add(label);

        // Platzbedarf ermitteln und anzeigen
        pack();
        
        setVisible(true);
    }
}
