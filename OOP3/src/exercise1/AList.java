/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.List;

/**
 *
 * @author sandr
 */
public abstract class AList implements IList {
    private final List<Integer> list;
    
    public AList(List list){
        this.list = list;
    }
    
    @Override
    public void add(Integer element) {
        list.add(element);
    }

    @Override
    public boolean remove(Integer element) {
        return list.remove(element);    
    }

    @Override
    public boolean removeValue(int element) {
        return list.remove((Integer)element);
    }

    @Override
    public boolean removeValues(int element) {
        boolean allRemoved = false;
        
        for(Integer value : list){
            if(value == element){
                allRemoved = list.remove(value);
            }         
        }
        
        return allRemoved;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean exists(Integer element) {
        return list.contains(element);
    }

    @Override
    public void print() {
        list.stream().forEach((value) -> {
            System.out.println(value);
        });
    }
    
}
