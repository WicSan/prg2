/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1.exercise1;

import exercise1.Giro;
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
public class GiroTest {
    
    public GiroTest() {
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
     * Test of payOut method, of class Giro.
     */
    @Test
    public void testPayOut() {
        System.out.println("payOut");
        double expResult = 100;
        
        Giro instance = new Giro(100, 2.0);
        instance.payOut(1200);       
        double result = instance.getSaldo();
        
        assertEquals(expResult, result, 0.0);
    } 
}
