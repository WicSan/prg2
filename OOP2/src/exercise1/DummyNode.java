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
public class DummyNode<T> extends ListNode {  
    public DummyNode() {
        super(null, null, null);
    }
    
    @Override
    public Type getType(){
        return Type.DUMMY;
    }
}
