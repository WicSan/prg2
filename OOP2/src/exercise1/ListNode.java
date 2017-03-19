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
public class ListNode<T> {
    private ListNode<T> next;
    private ListNode<T> prev;
    private T data;
    
    public ListNode(final ListNode<T> node, final ListNode<T> pnode, final T data){
        setNext(node);
        setPrevious(pnode);
        this.data = data;
    }
    
    public final void setPrevious(final ListNode<T> node){
        this.prev = node;
    }
    
    public ListNode<T> getPrevious(){
        return prev;
    }
    
    public void setData(final T data) {
        this.data = data;
    }
    
    public T getData() {
        return data;
    }
    
    public final void setNext(final ListNode<T> node) {
        this.next = node;
    }
    
    public ListNode<T> getNext() {
        return this.next;
    }
    
    public Type getType(){
        return Type.NORMAL;
    }
}
