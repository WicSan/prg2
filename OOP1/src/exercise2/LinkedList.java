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
public class LinkedList<T>{
    private ListNode<T> head;
    
    public LinkedList(){
        head = null;
    }
    
    public void insert(final T data){
        head = new ListNode<>(head, data);  
    }
    
    public boolean isFound(T data){
        ListNode<T> node = head;
        
        while(node != null && !node.getData().equals(data)){
            node = node.getNext();
        }
        
        return node != null;
    }
    
    public void print(){
        ListNode<T> node = head;
        
        while(node != null){
            System.out.println("---------");
            System.out.println(node.getData());
            node = node.getNext();
        }
    }
    
    public int length(){
        ListNode<T> node = head;
        int count = 0;
        
        while(node != null){
            node = node.getNext();
            count++;
        }
        
        return count;
    }
    
    public void remove(final T data){
        ListNode currentNode = head;
        ListNode prevNode = null;
        
        while ((currentNode != null) &&
            !data.equals(currentNode.getData())) {
            prevNode = currentNode;
            currentNode = prevNode.getNext();
       }
            // Liste wieder ordentlich zusammenhängen
        if (currentNode != null) {
            if (currentNode == head) {
                head = currentNode.getNext();
            }else {
                prevNode.setNext(currentNode.getNext());
            }
        }
    }
    
    public Iterator<T> iterator(){
        return new Iterator<>(head);
    }
}
