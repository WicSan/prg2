/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author sandr
 * @param <T>
 */
public class DLinkedList<T> {
    private ListNode<T> head;
    private ListNode<T> tail;
    private int size = 0;
    
    
    public DLinkedList(){
        //DummyNode<T> node = new DummyNode<>();
        head = null;
        tail = null;
    }
    
    public void addFirst(final T data){
        ListNode<T> newNode = new ListNode<>(head, null, data);
        
        if (head == null)
            tail = newNode;
        else
            head.setPrevious(newNode);
        
        head = newNode;
        size++;
    }
    
    public boolean isFound(T data){
        ListNode<T> node = head;
        
        while(node != null && !node.getData().equals(head.getData())){
            node = node.getNext();
        }
        
        return node != null;
    }
    
    public void printForward(){
        ListNode<T> node = head;
        
        while(node != null){
            System.out.println("---------");
            System.out.println(node.getData());
            node = node.getNext();
        }
    }
    
    public void printBackward(){
        ListNode<T> node = tail.getPrevious();
        
        while(node != null){
            System.out.println("---------");
            System.out.println(node.getData());
            node = node.getPrevious();
        }
    }
    
    public int length(){
        return size;
    }
    
    public void remove(final T data){
        ListNode<T> currentNode = head;
        
        while ((currentNode != null) &&
            !data.equals(currentNode.getData())) {
            currentNode = currentNode.getNext();
        }
        
        if(currentNode != null){
            
            if(currentNode.getPrevious() != null || currentNode.getNext() != null){
                // Liste wieder ordentlich zusammenhängen
                if (currentNode == head && currentNode.getNext() != null) {
                    head = currentNode.getNext();
                    head.setPrevious(null);
                }else if(currentNode == tail && currentNode.getPrevious() != null){
                    tail = currentNode.getPrevious();
                    tail.setNext(null);
                }else  {
                    currentNode.getPrevious().setNext(currentNode.getNext());
                    currentNode.getNext().setPrevious(currentNode.getPrevious());
                }
            }

            currentNode = null;
            size--;
        }
    }
}
