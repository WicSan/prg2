/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1.exercise1;

import exercise1.Konto;
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
public class KontoTest {
    
    public KontoTest() {
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
     * Test of payIn method, of class Konto.
     */
    @Test
    public void testPayIn() {
        System.out.println("payIn");
        double expResult = 150;
        
        Konto instance = new Konto(100, 2.0);
        instance.payIn(50);
        double result = instance.getSaldo();
        
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of payOut method, of class Konto.
     */
    @Test
    public void testPayOut() {
        System.out.println("payOut");
        double expResult = 50;
        
        Konto instance = new Konto(100, 2.0);
        instance.payOut(50);
        double result = instance.getSaldo();

        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getSaldo method, of class Konto.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Konto instance = new Konto(100, 2.0);
        double expResult = 100.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
    }  
}
