/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1.exercise1;

import exercise1.Bank;
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
public class BankTest {
    
    public BankTest() {
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
     * Test of noOfAccounts method, of class Bank.
     */
    @Test
    public void testNoOfAccounts() {
        System.out.println("noOfAccounts");
        Bank instance = new Bank("test");
        int expResult = 0;
        int result = instance.noOfAccounts();
        assertEquals(expResult, result);
    }
}
