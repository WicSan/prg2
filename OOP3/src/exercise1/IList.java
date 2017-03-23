/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author sandr
 */
public interface IList {
    public void add(Integer element);
    
    public boolean remove(Integer element);
    
    public boolean removeValue(int element);
    
    public boolean removeValues(int element);
    
    public int size();
    
    public boolean exists(Integer element);
    
    public void print();
}
