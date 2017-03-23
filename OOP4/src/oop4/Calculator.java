/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author sandr
 */
public class Calculator extends JFrame {
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnAdd;
    private JButton btnDiv;
    private JButton btnMult;
    private JButton btnSub;
    private JButton btnClear;
    private JButton btnSign;
    private JButton btnResult;
    private JButton btnStoreM;
    private JButton btnRecallM;
    private JButton btnClearM;
    private JButton btnPoint;
    private JPanel panel;
    private JPanel panel1;
    private JLabel lblStatus;
    private JLabel label;
    private JTextField txtText;
    private final SyntaxTree tree;
    private String store;

    public Calculator(){
        super("Rechner");
        tree = new SyntaxTree();
        store = "";
        
        initComponents();
    }
    
    // <editor-fold desc="Initialise components" defaultstate="collapsed">   >   
    public final void initComponents(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(250, 280);
        setLayout(new BorderLayout());
        setResizable(false);
        
        GridLayout g = new GridLayout(0, 4);
        g.setHgap(5);
        g.setVgap(5);
        
        panel = new JPanel(g);
        panel1 = new JPanel(new GridLayout(3, 0));
        panel1.setPreferredSize(new Dimension(0, 70));
        
        txtText = new JTextField();
        txtText.setEditable(false);
        txtText.setBackground(Color.WHITE);
        txtText.setPreferredSize(new Dimension(0, 30));
        
        lblStatus = new JLabel();
        label = new JLabel();

        btn0 = new JButton();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();
        btnAdd = new JButton();
        btnSub = new JButton();
        btnMult = new JButton();
        btnDiv = new JButton();
        btnClear = new JButton();
        btnSign = new JButton();
        btnResult = new JButton();
        btnStoreM = new JButton();
        btnRecallM = new JButton();
        btnClearM = new JButton();
        btnPoint = new JButton();
        
        btn0.setText("0");
        btn0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnNumberMouseClicked(evt);
            }
        });
        
        btn1.setText("1");
        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnNumberMouseClicked(evt);
            }
        });
        
        btn2.setText("2");
        btn2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnNumberMouseClicked(evt);
            }
        });
        
        btn3.setText("3");
        btn3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnNumberMouseClicked(evt);
            }
        });
        
        btn4.setText("4");
        btn4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnNumberMouseClicked(evt);
            }
        });
        
        btn5.setText("5");
        btn5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnNumberMouseClicked(evt);
            }
        });
                
        btn6.setText("6");
        btn6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnNumberMouseClicked(evt);
            }
        });
        
        btn7.setText("7");
        btn7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnNumberMouseClicked(evt);
            }
        });
        
        btn8.setText("8");
        btn8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnNumberMouseClicked(evt);
            }
        });
                
        btn9.setText("9");
        btn9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnNumberMouseClicked(evt);
            }
        });
        
        btnAdd.setText("+");
        btnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnOperatorMouseClicked(evt);
            }
        });
                
        btnSub.setText("-");
        btnSub.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnOperatorMouseClicked(evt);
            }
        });
        
        btnMult.setText("*");
        btnMult.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnOperatorMouseClicked(evt);
            }
        });
                
        btnDiv.setText("/");
        btnDiv.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnOperatorMouseClicked(evt);
            }
        });
        
        btnResult.setText("=");
        btnResult.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnResultMouseClicked(evt);
            }
        });
                
        btnClear.setText("C");
        btnClear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        
        btnSign.setText("S");
        btnSign.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnSignMouseClicked(evt);
            }
        });
        
        btnStoreM.setText("sM");
        btnStoreM.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnStoreMMouseClicked(evt);
            }
        });
        
        btnRecallM.setText("rM");
        btnRecallM.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnRecallMMouseClicked(evt);
            }
        });
        
        btnClearM.setText("cM");
        btnClearM.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnClearMMouseClicked(evt);
            }
        });
        
        btnPoint.setText(".");
        btnPoint.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btnNumberMouseClicked(evt);
            }
        });
        
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btnDiv);
        
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btnMult);
        
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btnSub);
        
        panel.add(btn0);
        panel.add(btnPoint);
        panel.add(btnSign);     
        panel.add(btnAdd);
        
        panel.add(btnClear);
        panel.add(btnResult);
        panel.add(btnStoreM);
        panel.add(btnRecallM);
        panel.add(btnClearM);
        
        panel1.add(label, BorderLayout.NORTH);
        panel1.add(txtText, BorderLayout.CENTER);
        panel1.add(lblStatus, BorderLayout.SOUTH);

        add(panel1, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        pack();
        
        setVisible(true);
    }
    // </editor-fold>
    
    private void btnNumberMouseClicked(MouseEvent evt) {                                      
        // TODO add your handling code here:
        txtText.setText(txtText.getText() + ((JButton)evt.getComponent()).getText());
    }
    
    private void btnOperatorMouseClicked(MouseEvent evt) {                                     
        // TODO add your handling code here:
        label.setText(label.getText() + txtText.getText() + " " + ((JButton)evt.getComponent()).getText() + " ");
        tree.insert(txtText.getText());
        tree.insert(((JButton)evt.getComponent()).getText());
        txtText.setText("");
    }
    
    private void btnResultMouseClicked(MouseEvent evt) {                                     
        // TODO add your handling code here:
        tree.insert(txtText.getText());
        txtText.setText(String.valueOf(tree.calculateTree()));
        tree.clear();
        label.setText("");
    }
    
    private void btnClearMouseClicked(MouseEvent evt) {                                     
        // TODO add your handling code here:
        txtText.setText("");
        tree.clear();
    }
    
    private void btnStoreMMouseClicked(MouseEvent evt) {                                     
        // TODO add your handling code here:
        lblStatus.setText("M");
        store = txtText.getText();
    }
    
    private void btnRecallMMouseClicked(MouseEvent evt) {                                     
        // TODO add your handling code here:
        txtText.setText(store);
        lblStatus.setText("");
        store = "";
    }
    
    private void btnClearMMouseClicked(MouseEvent evt) {                                     
        // TODO add your handling code here:
        store = "";
        lblStatus.setText("");
    }
    
    private void btnSignMouseClicked(MouseEvent evt) {                                     
        // TODO add your handling code here:  
        if(txtText.getText().startsWith("-"))
            txtText.setText(txtText.getText().substring(1));
        else
            txtText.setText("-" + txtText.getText());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(() -> new Calculator());
    }
    
}
