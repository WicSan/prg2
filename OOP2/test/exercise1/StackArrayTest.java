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
public class StackArrayTest {
    
    public StackArrayTest() {
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
     * Test of pop method, of class StackArray.
     */
    @Test
    public void testStack() {
        System.out.println("pop");
        StackArray<String> instance = new StackArray();
        String expResult = "test";
        instance.push(expResult);
        String result = instance.pop();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of pop method, of class StackArray.
     */
    @Test
    public void testStackM() {
        System.out.println("pop");
        StackArray<String> instance = new StackArray();
        String expResult = "test4";
        instance.push("test1");
        instance.push("test2");
        instance.push("test3");
        instance.push(expResult);

        String result = instance.pop();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of pop method, of class StackArray.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackArray<Integer> instance = new StackArray();
        Integer expResult = 1;
        instance.push(expResult);
        Integer result = instance.pop();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class StackArray.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        StackArray instance = new StackArray();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }
    
}
