package oop4;

import java.util.Objects;

/**
 * ETH Zürich; Leitprogramm; Binüre Suchbäume ----- Das ist die Klasse eines
 * einzelnen Knotens des Binären Suchbaums.
 *
 * @author Sandro Wicki
 * @version 2.0
 */
public class SyntaxTreeNode {
    private int priority;
    private String tag;
    private SyntaxTreeNode left, right;

    /**
     * Konstruktor für Knoten
     *
     * @param tag
     */
    public SyntaxTreeNode(String tag) {
        this.tag = tag;
        left = null;
        right = null;
        this.priority = SyntaxTree.priority(tag);
    }

    /**
     * Konstruktor für Knoten
     *
     * @param tag
     * @param left
     * @param right
     */
    public SyntaxTreeNode(String tag, SyntaxTreeNode left, SyntaxTreeNode right) {
        this(tag);
        this.tag = tag;
        this.left = left;
        this.right = right;
    }
    
    public int getPriority(){
        return priority;
    }

    /**
     * getter Methode für den Schlüssel
     *
     * @return den Schlüsselwert
     */
    public String getTag() {
        return tag;
    }

    /**
     * setter Methode für den Schl�ssel
     *
     * @param value der neue Schlüsselwert
     */
    public void setTag(String value) {
        tag = value;
        this.priority = SyntaxTree.priority(tag);
    }

    /**
     * getter Methode für das rechte Kind
     *
     * @return rechtes Kind
     */
    public SyntaxTreeNode getRight() {
        return right;
    }

    /**
     * setter Methode für das rechte Kind
     *
     * @param newRight Referenz auf neues rechtes Kind
     */
    public void setRight(SyntaxTreeNode newRight) {
        right = newRight;
    }

    /**
     * getter Methode für das linke Kind
     *
     * @return linkes Kind
     */
    public SyntaxTreeNode getLeft() {
        return left;
    }

    /**
     * setter Methode für das linke Kind
     *
     * @param newLeft Referenz auf neues linkes Kind
     */
    public void setLeft(SyntaxTreeNode newLeft) {
        left = newLeft;
    }

    /**
     * rightrotation; diese Methode ist von Ihnen zu implementieren
     *
     * @param node Wurzelknoten des AVL Baumes, der rotiert werden soll
     * @return neue Wurzel
     */
    public SyntaxTreeNode rightrotation(SyntaxTreeNode node) {
        SyntaxTreeNode v = node.getLeft();

        node.setLeft(v.getRight());
        v.setRight(node);
        return v;
    }

    /**
     * leftrotation; diese Methode ist von Ihnen zu implementieren
     *
     * @param node Wurzelknoten des AVL Baumes, der rotiert werden soll
     * @return neue Wurzel
     */
    public SyntaxTreeNode leftrotation(SyntaxTreeNode node) {
        SyntaxTreeNode v = node.getRight();

        node.setRight(v.getLeft());
        v.setLeft(node);
        return v;
    }

    //Identit
    //<operand> <operator> <operand>
    //8/4*2
    
    /*public SyntaxTreeNode delete(SyntaxTreeNode node, int key) {
        if (node != null) {
            if (node.getTag() > key) {
                node.setLeft(delete(node.getLeft(), key)); 
            } else{
                if (node.getTag() < key) {
                    node.setRight(delete(node.getRight(), key)); 
                } else {               
                    if (node.getLeft() == null) {
                        if(node.getRight() == null){
                            //Fall 1
                            node = null;
                        }
                        else{
                            //Fall 2
                            node = node.getRight();
                        }
                    } else {
                        if(node.getRight() == null){
                            //Fall 2
                            node = node.getLeft();
                        }
                        else{
                            //Fall 3
                            SyntaxTreeNode tempNode = node.getRight();
                            SyntaxTreeNode prevNode = null;

                            //ganz linker Nachfolger suchen
                            while(tempNode.getLeft() != null){
                                prevNode = tempNode;
                                tempNode = tempNode.getLeft();
                            }

                            //Nur durch führen, wenn es einen Vorgänger gibt
                            if(prevNode != null){
                                //Umkehren der Verlinkung, um endlos Schleife zu vermeiden
                                prevNode.setLeft(null);
                            }
                            
                            if(!tempNode.equals(node.getRight()))
                                tempNode.setRight(node.getRight());
                            tempNode.setLeft(node.getLeft());
                            
                            node = tempNode;
                        }
                    }
                    return delete(node, key);
                }
            }
        }
        return node;
    }*/
    
    @Override
    public boolean equals(Object o){
        return hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Integer.valueOf(this.getTag());
        hash = 97 * hash + Objects.hashCode(this.getLeft());
        hash = 97 * hash + Objects.hashCode(this.getRight());
        return hash;
    }
}
