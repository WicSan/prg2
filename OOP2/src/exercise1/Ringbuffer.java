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
public class Ringbuffer {
    private final Object[] queue;
    private int head; //start
    private int tail; //end
    private int count;
 
    public Ringbuffer(int s){
        count = 0;
        queue = new Object[s];
        head = 0;
        tail = 0;
    }
    
     public void enqueue(Object x) throws Exception {
        // Fügt x am Ende in die Warteschlange ein,
        // falls die Warteschlange nicht voll ist;
        
        if(count <= queue.length){
            queue[tail] = x;
            tail = (tail + 1) % queue.length;
            count++;
        }
        else{
            throw new Exception("Liste voll");
        }
    }
     
    public Object dequeue() {
        // Entfernt das erste Element aus der Warteschlange,
        // falls die Warteschlange nicht leer ist;
        if(count > 0){
            queue[head] = null;
            head = (head + 1) % queue.length;
            count--;
        }
        
        return queue[head];
    }
    
    public boolean isEmpty() {
        //liefert true genau dann, wenn die Warteschlange kein Element enthält       
        return count == 0;
    }
    
    public boolean isFull() {
        return count == queue.length;
    }
}
