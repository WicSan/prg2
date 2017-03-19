/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sandr
 */
public class DLinkedListTest {
    
    public DLinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addFirst method, of class DLinkedList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        String data = "test";
        DLinkedList<String> instance = new DLinkedList<>();
        instance.addFirst(data);
    }

    /**
     * Test of isFound method, of class DLinkedList.
     */
    @Test
    public void testIsFound() {
        System.out.println("isFound");
        String data = "test";
        DLinkedList<String> instance = new DLinkedList<>();
        instance.addFirst(data);
        boolean expResult = true;
        boolean result = instance.isFound(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of length method, of class DLinkedList.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        DLinkedList<String> instance = new DLinkedList<>();
        int expResult = 0;
        int result = instance.length();
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class DLinkedList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        String data = "test";
        DLinkedList<String> instance = new DLinkedList<>();
        instance.addFirst(data);
        instance.remove(data);
        
        int expResult = 0;
        int result = instance.length();
        assertEquals(expResult, result);
    }
    
}
