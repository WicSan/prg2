/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author sandr
 */
public final class ListNode<T> {
    private T konto;
    private ListNode<T> next;

    public ListNode(final ListNode<T> node, final T data) {
        this.next = node;
        this.konto = data;
    }
    
    public void setData(final T data) {
        this.konto = data;
    }
    
    public T getData() {
        return konto;
    }
    
    public void setNext(final ListNode<T> node) {
        this.next = node;
    }
    
    public ListNode getNext() {
        return this.next;
    }
}
