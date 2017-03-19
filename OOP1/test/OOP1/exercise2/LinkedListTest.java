/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1.exercise2;

import exercise2.LinkedList;
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
public class LinkedListTest {
    
    public LinkedListTest() {
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
     * Test of insert method, of class LinkedList.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Object data = null;
        LinkedList instance = new LinkedList();
        instance.insert(data);
    }

    /**
     * Test of isFound method, of class LinkedList.
     */
    @Test
    public void testIsFound() {
        System.out.println("isFound");
        Object data = null;
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.isFound(data);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isFound method, of class LinkedList.
     */
    @Test
    public void testIsFoundT() {
        System.out.println("isFound");
        String data = "test";
        LinkedList<String> instance = new LinkedList<>();
        instance.insert(data);
        
        boolean expResult = true;
        boolean result = instance.isFound(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of print method, of class LinkedList.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        LinkedList instance = new LinkedList();
        instance.print();
    }
    
    /**
     * Test of length method, of class LinkedList.
     */
    @Test
    public void testLengthB() {
        System.out.println("length");
        LinkedList<String> instance = new LinkedList<>();
        instance.insert("test");
        instance.insert("test2");
        
        int expResult = 2;
        int result = instance.length();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of length method, of class LinkedList.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        LinkedList instance = new LinkedList();
        int expResult = 0;
        int result = instance.length();
        
        assertEquals(expResult, result);
    }
}
