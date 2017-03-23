/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author sandr
 */
public class Form extends JFrame{
    private JMenuBar menuBar;
    private JMenu menu1;
    private JMenu menu2;
    private JMenuItem item1;
    private JMenuItem item2;
    private JMenuItem item3;
    
    public Form(){
        initialise();
    }
    
    private void initialise(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(250, 250));
        getContentPane().setLayout(new BorderLayout());
        
        menuBar = new JMenuBar();
        menu1 = new JMenu("File");
        menu2 = new JMenu("Help");
        menu2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                menu2MouseClicked(evt);
            }
        });
        
        item1 = new JMenuItem("New");
        item2 = new JMenuItem("Open");
        item3 = new JMenuItem("Exit");
        item3.addActionListener(e -> System.exit(0));
        
        menuBar.add(menu1);
        menuBar.add(menu2);
        
        menu1.add(item1);
        menu1.add(item2);
        menu1.addSeparator();
        menu1.add(item3);
        
        setJMenuBar(menuBar);
        
        pack();
        
        setVisible(true);
    }
    
    private void menu2MouseClicked(MouseEvent e){
        JOptionPane.showMessageDialog(this, "Copyright 2017 Hochschule Luzern, Technick & Architektur");
    }
    
    public static void main(String[] args){
        EventQueue.invokeLater(() -> new Form());
    }
}
