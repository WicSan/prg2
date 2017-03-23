/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees.Kap3;

import java.util.ArrayList;

/**
 *
 * @author sandr
 */
public class BinaryNode {

    private int key;
    private BinaryNode left, right;

    /**
     * Konstruktor fÃ¼r Knoten
     *
     * @param key SchlÃ¼sselwert des Knotens
     */
    public BinaryNode(final int key) {
        this.key = key;
        left = null;
        right = null;
    }

    /**
     * Konstruktor fÃ¼r Knoten
     *
     * @param key SchlÃ¼sselwert des Knotens
     * @param left Referenz auf den linken Nachbarknoten
     * @param right Referenz auf den rechten Nachbarknoten
     */
    public BinaryNode(final int key, final BinaryNode left, final BinaryNode right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    /**
     * getter Methode fÃ¼r den SchlÃ¼sselwert
     *
     * @return den SchlÃ¼sselwert
     */
    public int getKey() {
        return key;
    }

    /**
     * setter Methode fÃ¼r den SchlÃ¼sselwert
     *
     * @param value der neue SchlÃ¼sselwert
     */
    public void setKey(int value) {
        key = value;
    }

    /**
     * getter Methode fÃ¼r das rechte Kind
     *
     * @return rechtes Kind
     */
    public BinaryNode getRight() {
        return right;
    }

    /**
     * setter Methode fÃ¼r das rechte Kind
     *
     * @param newRight Referenz auf neues rechtes Kind
     */
    public void setRight(BinaryNode newRight) {
        right = newRight;
    }

    /**
     * getter Methode fÃ¼r das linke Kind
     *
     * @return linkes Kind
     */
    public BinaryNode getLeft() {
        return left;
    }

    /**
     * setter Methode fÃ¼r das linke Kind
     *
     * @param newLeft Referenz auf neues linkes Kind
     */
    public void setLeft(BinaryNode newLeft) {
        left = newLeft;
    }

    /**
     * Ausgabe des BinÃ¤rbaumes in der preorder Reihenfolge. Diese Methode ist
     * von Ihnen in Aufgabe 3.3 des Leitprogramms zu implementieren.
     */
    // Implementiere diese Methode nach den Vorgaben der Aufgabe.
    // Geben Sie dazu fÃ¼r jeden Knoten den SchlÃ¼ssel aus,
    // gefolgt von einem Leerzeichen.
    // beachten Sie: der Algorithmus, der auf S. 27 des Leitprogramms beschrieben
    // ist, hat einen Parameter (vom Typ Knoten).
    // Sie mÃ¼ssen also eine weitere Methode preorder() definieren, und diese in 
    // preorderPrint() aufrufen
    // fÃ¼r eine Ausgabe OHNE anschliessenden Zeilenumbruch verwenden Sie bitte:
    // System.out.print()
    public void preorderPrint() {
        preorder(this);
    }
    
    private void preorder(BinaryNode v){
        if(v != null){
            System.out.print(v.getKey() + " ");
            preorder(v.getLeft());
            preorder(v.getRight());
        }
    }
}
