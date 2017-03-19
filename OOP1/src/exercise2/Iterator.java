/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author sandr
 * @param <T>
 */
public class Iterator<T>{
    private final ListNode<T> lastNode;
    private ListNode<T> nextNode;
    
    Iterator(ListNode<T> head){
        lastNode = head;
        nextNode = head;
    }
    
    public T next(){
        ListNode<T> currentNode = nextNode;     
        nextNode = currentNode.getNext();

        return currentNode.getData();
    }
    
    public boolean hasNext(){
        return nextNode != null;
    }
}
