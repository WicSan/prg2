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
public class CubeTest {
    
    public CubeTest() {
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

    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Cube instance = new Cube(1, 2, 4, 3);
        int expResult = 24;
        int result = instance.getVolume();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSurface() {
        System.out.println("getSurface");
        Cube instance = new Cube(1, 2, 4, 3);
        int expResult = 52;
        int result = instance.getSurface();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMaxDimension() {
        System.out.println("getMaxDimension");
        Cube instance = new Cube(1, 2, 4, 3);
        int expResult = 4;
        int result = instance.getMaxDimension();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Cube instance = new Cube(1, 2, 4, 3);
        String expResult = "2 3 4";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Cube instance = new Cube(1, 2, 4, 3);
        Cube instance2 = new Cube(1, 2, 4, 3);
        boolean expResult = true;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Cube instance = new Cube(1, 2, 4, 3);
        Cube instance2 = new Cube(1, 2, 1, 3);
        int expResult = 1;
        int result = instance.compareTo(instance2);
        assertEquals(expResult, result);
    }
}
