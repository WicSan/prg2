/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4;

/**
 *
 * @author sandr
 */
public class SyntaxTree {
    private SyntaxTreeNode root;
    
    public SyntaxTree(){
        root = null;
    }
    
    public void insert(String t){
        if(root == null){
            root = new SyntaxTreeNode(t);
        }
        else{
            root = insert(root, t);
        }
    }
    
    private SyntaxTreeNode insert(SyntaxTreeNode node, String t) {
        if (node != null) {
            if (node.getPriority() <= priority(t)) {
                SyntaxTreeNode newNode = new SyntaxTreeNode(node.getTag());             
                node.setTag(t);
                
                newNode.setLeft(node.getLeft());
                newNode.setRight(node.getRight());
                    
                node.setLeft(newNode);
                node.setRight(null);
            } else {
                if(node.getLeft() == null){
                    node.setLeft(new SyntaxTreeNode(t));
                }else if(node.getRight() == null){
                    node.setRight(new SyntaxTreeNode(t));
                }else{
                    insert(node.getRight(), t);
                }
            }
        }
        return node;
    }
    
    public double calculateTree(){
        return inorder(root);
    }
    
    public void clear(){
        root = null;
    }
    
    private double inorder(SyntaxTreeNode node){
        if(node != null){
            double operand1, operand2;
            operand1 = inorder(node.getLeft());
            operand2 = inorder(node.getRight());
            switch(node.getTag()){
                case "+":
                    return operand1 + operand2;
                case "-":
                    return operand1 - operand2;
                case "*":
                    return operand1 * operand2;
                case "/":
                    return operand1 / operand2;
                default:
                    return Double.parseDouble(node.getTag());
            }
        }
        return 0;
    }
    
    public static int priority(String val){
        int prio = 0;
        
        if(null != val)switch (val) {
            case "*":
            case "/":
                prio = 1;
                break;
            case "-":
            case "+":
                prio = 2;
                break;
        }
        
        return prio;
    }
}
