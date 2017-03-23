package trees.Kap5;

import java.util.Objects;
import trees.Kap4.BinSearchTree;

/**
 * ETH Zürich; Leitprogramm; Binüre Suchbäume ----- Das ist die Klasse eines
 * einzelnen Knotens des Binären Suchbaums.
 *
 * @author Sandro Wicki
 * @version 2.0
 */
public class AVLNode {

    private int key;
    private AVLNode left, right;

    /**
     * Konstruktor für Knoten
     *
     * @param key Schlüsselwert
     */
    public AVLNode(int key) {
        this.key = key;
        left = null;
        right = null;
    }

    /**
     * Konstruktor für Knoten
     *
     * @param key
     * @param left
     * @param right
     */
    public AVLNode(int key, AVLNode left, AVLNode right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    /**
     * getter Methode für den Schlüssel
     *
     * @return den Schlüsselwert
     */
    public int getKey() {
        return key;
    }

    /**
     * setter Methode für den Schl�ssel
     *
     * @param value der neue Schlüsselwert
     */
    public void setKey(int value) {
        key = value;
    }

    /**
     * getter Methode für das rechte Kind
     *
     * @return rechtes Kind
     */
    public AVLNode getRight() {
        return right;
    }

    /**
     * setter Methode für das rechte Kind
     *
     * @param newRight Referenz auf neues rechtes Kind
     */
    public void setRight(AVLNode newRight) {
        right = newRight;
    }

    /**
     * getter Methode für das linke Kind
     *
     * @return linkes Kind
     */
    public AVLNode getLeft() {
        return left;
    }

    /**
     * setter Methode für das linke Kind
     *
     * @param newLeft Referenz auf neues linkes Kind
     */
    public void setLeft(AVLNode newLeft) {
        left = newLeft;
    }

    // bestimmt die Höhe eines Teilbaums, rekursiv
    // beim ersten Aufruf wird 1 als depth (Tiefe) übergeben
    private int getHeight(int depth) {
        if (this == null) {
            return depth;
        } else {
            int leftHeight = depth;
            if (left != null) {
                leftHeight = left.getHeight(depth + 1);
            }
            
            int rightHeight = depth;
            if (right != null) {
                rightHeight = right.getHeight(depth + 1);
            }
            
            if (leftHeight > rightHeight) {
                return leftHeight;
            } else {
                return rightHeight;
            }
        }
    }

    /**
     * bestimmt den Balancefaktor eines Knotens
     *
     * @return Wert des Balancefaktors; 0, falls node null ist
     */
    public int getBalanceFactor() {
        if (this == null) {
            return 0;
        }
        int balance, lheight = 0, rheight = 0;
        if (left != null) {
            lheight = left.getHeight(1);
        }
        if (right != null) {
            rheight = right.getHeight(1);
        }
        balance = rheight - lheight;
        return balance;
    }

    /**
     * Inorder Ausgabe des Wertes und der Balancefaktoren für den AVL Baum
     *
     * @param node Wurzelknoten des AVL Baumes, der mit inorder ausgegeben
     * werden soll
     */
    public void inorderWithBalance(AVLNode node) {
        if (node != null) {
            inorderWithBalance(node.getLeft());
            System.out.println("value: " + node.getKey() + ";  Balancefaktor: " + node.getBalanceFactor());
            inorderWithBalance(node.getRight());
        }
    }

    /**
     * rightrotation; diese Methode ist von Ihnen zu implementieren
     *
     * @param node Wurzelknoten des AVL Baumes, der rotiert werden soll
     * @return neue Wurzel
     */
    public AVLNode rightrotation(AVLNode node) {
        AVLNode v = node.getLeft();

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
    public AVLNode leftrotation(AVLNode node) {
        AVLNode v = node.getRight();

        node.setRight(v.getLeft());
        v.setLeft(node);
        return v;
    }

    public AVLNode insert(AVLNode node, int key) {
        if (node != null) {
            if (node.getKey() > key) {
                if (node.getLeft() != null) {
                    insert(node.getLeft(), key);
                } else {
                    node.setLeft(new AVLNode(key));
                }
            } else if (node.getRight() != null) {
                insert(node.getRight(), key);
            } else {
                node.setRight(new AVLNode(key));
            }
            
            if(node.getBalanceFactor() > 1){
                node = leftrotation(node);
            }
            else if(node.getBalanceFactor() < -1){
                node = rightrotation(node);
            }
        }
        return node;
    }
    
    public AVLNode delete(AVLNode node, int key) {
        if (node != null) {
            if (node.getKey() > key) {
                node.setLeft(delete(node.getLeft(), key)); 
            } else{
                if (node.getKey() < key) {
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
                            AVLNode tempNode = node.getRight();
                            AVLNode prevNode = null;

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
            
            if(node.getBalanceFactor() > 1){
                node = leftrotation(node);
            }
            else if(node.getBalanceFactor() < -1){
                node = rightrotation(node);
            }
        }
        return node;
    }
    
    @Override
    public boolean equals(Object o){
        return hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.key;
        hash = 97 * hash + Objects.hashCode(this.left);
        hash = 97 * hash + Objects.hashCode(this.right);
        return hash;
    }
}
