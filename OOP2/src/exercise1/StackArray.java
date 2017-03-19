/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.ArrayList;

/**
 *
 * @author sandr
 * @param <T>
 */
public class StackArray<T> {
    private final ArrayList<T> stack;
    private int top;
    
    public StackArray(){
        stack = new ArrayList<>();
    }
    
    public void push(T o){
        stack.add(o);
        top++;
    }
    
    public T pop(){
        top--;
        return stack.get(top);
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
