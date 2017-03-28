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
public class AddressEntryTest {

    public AddressEntryTest() {
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
    public void testSetZipCode() {
        try {
            System.out.println("setZipCode");
            String zipCode = "1234";
            AddressEntry instance = new AddressEntry("test", "tset");
            instance.setZipCode(zipCode);
        } catch (IllegalArgumentException e) {
            fail("Fail set zipcode.");
        }
    }

    @Test
    public void testSetZipCode_Wrong() {
        try {
            System.out.println("setZipCode");
            String zipCode = "12345";
            AddressEntry instance = new AddressEntry("test", "tset");
            instance.setZipCode(zipCode);
            fail("Fail wrong zipcode setted.");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testSetResidence() {
        try {
            System.out.println("setResidence");
            String residence = "Reiden";
            AddressEntry instance = new AddressEntry("test", "tset");
            instance.setResidence(residence);
        } catch (IllegalArgumentException e) {
            fail("Fail set residence.");
        }
    }

    @Test
    public void testSetResidence_Wrong() {
        try {
            System.out.println("setResidence");
            String residence = "ree231";
            AddressEntry instance = new AddressEntry("test", "tset");
            instance.setResidence(residence);
            fail("Fail wrong residence setted.");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testSetPhoneNumber() {
        try {
            System.out.println("setPhoneNumber");
            String phoneNumber = "0627584132";
            AddressEntry instance = new AddressEntry("test", "tset");
            instance.setPhoneNumber(phoneNumber);
        } catch (IllegalArgumentException e) {
            fail("Fail set phoneNumber.");
        }
    }

    @Test
    public void testSetPhoneNumber_Wrong() {
        try {
            System.out.println("setPhoneNumber");
            String phoneNumber = "0627584a13223";
            AddressEntry instance = new AddressEntry("test", "tset");
            instance.setPhoneNumber(phoneNumber);
            fail("Fail wrong phoneNumber setted.");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testSetEmailAddress() {
        try {
            System.out.println("setEmailAddress");
            String eMailAdresse = "mail@mail.ch";
            AddressEntry instance = new AddressEntry("test", "tset");
            instance.setEmailAddress(eMailAdresse);
        } catch (IllegalArgumentException e) {
            fail("Fail set email.");
        }
    }

    @Test
    public void testSetEmailAddress_Wrong() {
        try {
            System.out.println("setEmailAddress");
            String eMailAdresse = "mail@mail@k.ch";
            AddressEntry instance = new AddressEntry("test", "tset");
            instance.setEmailAddress(eMailAdresse);
            fail("Fail wrong email setted.");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testGetGivenName() {
        System.out.println("getGivenName");
        String expResult = "test";
        AddressEntry instance = new AddressEntry(expResult, "tset");
        String result = instance.getGivenName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFamilyName() {
        System.out.println("getFamilyName");
        String expResult = "tset";
        AddressEntry instance = new AddressEntry("test", expResult);
        String result = instance.getFamilyName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetZipCode() {
        System.out.println("getZipCode");
        AddressEntry instance = new AddressEntry("test", "test");
        String expResult = "1234";
        instance.setZipCode(expResult);
        String result = instance.getZipCode();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetResidence() {
        System.out.println("getResidence");
        AddressEntry instance = new AddressEntry("test", "test");
        String expResult = "reiden";
        instance.setResidence(expResult);
        String result = instance.getResidence();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        AddressEntry instance = new AddressEntry("test", "test");
        String expResult = "0765630080";
        instance.setPhoneNumber(expResult);
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        AddressEntry instance = new AddressEntry("test", "test");
        String expResult = "mail@mail.ch";
        instance.setEmailAddress(expResult);
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("instance");
        try {
            System.out.println("setEmailAddress");
            String givenName = "saurisd234";
            String familyName = "io22323pql";
            AddressEntry instance = new AddressEntry(givenName, familyName);
            fail("Fail wrong names setted.");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        AddressEntry instance = null;
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        AddressEntry instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
