/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import javax.swing.*; // Package für Swing
import java.awt.*; // Teile von AWT
import java.awt.event.*; // Ereignisverarbeitung

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
        
        // ...und mit Layout hinzufügen
        setLayout(new GridLayout(0, 1));
        add(button);
        add(label);

        // Platzbedarf ermitteln und anzeigen
        pack();
        setVisible(true);
    }
}
