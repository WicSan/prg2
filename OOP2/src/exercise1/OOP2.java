package exercise1;

import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sandr
 */
public class OOP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String data = "test";
        DLinkedList<String> instance = new DLinkedList<>();
        instance.addFirst(data);
        instance.addFirst("test1");
        instance.addFirst("test2");
        instance.addFirst("test3");
        instance.remove("test3");
        instance.printBackward();
        instance.printForward();
    }
    
}
