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
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author sandr
 */
public class AddressEntryTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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
            fail(e.toString());
        }
    }

    @Test
    public void testSetZipCode_Wrong() {
        System.out.println("setZipCode");
        String zipCode = "12345";
        AddressEntry instance = new AddressEntry("test", "tset");
        thrown.expect(IllegalArgumentException.class);
        instance.setZipCode(zipCode);
        thrown.reportMissingExceptionWithMessage("No exception");
    }

    @Test
    public void testSetResidence() {
        try {
            System.out.println("setResidence");
            String residence = "Reiden";
            AddressEntry instance = new AddressEntry("test", "tset");
            instance.setResidence(residence);
        } catch (IllegalArgumentException e) {
            fail(e.toString());
        }
    }

    @Test
    public void testSetResidence_Wrong() {
        System.out.println("setResidence");
        String residence = "ree231";
        AddressEntry instance = new AddressEntry("test", "tset");
        thrown.expect(IllegalArgumentException.class);
        instance.setResidence(residence);
        thrown.reportMissingExceptionWithMessage("No exception");
    }

    @Test
    public void testSetPhoneNumber() {
        try {
            System.out.println("setPhoneNumber");
            String phoneNumber = "0627559132";
            AddressEntry instance = new AddressEntry("test", "tset");
            instance.setPhoneNumber(phoneNumber);
        } catch (IllegalArgumentException e) {
            fail(e.toString());
        }
    }

    @Test
    public void testSetPhoneNumber_Wrong() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "0627584a13223";
        AddressEntry instance = new AddressEntry("test", "tset");
        thrown.expect(IllegalArgumentException.class);
        instance.setPhoneNumber(phoneNumber);
        thrown.reportMissingExceptionWithMessage("No exception");
    }

    @Test
    public void testSetEmailAddress() {
        try {
            System.out.println("setEmailAddress");
            String eMailAdresse = "mail@mail.ch";
            AddressEntry instance = new AddressEntry("test", "tset");
            instance.setEmailAddress(eMailAdresse);
        } catch (InvalidEmailAddressException e) {
            fail(e.toString());
        }
    }

    @Test
    public void testSetEmailAddress_Wrong() {
        System.out.println("setEmailAddress");
        String eMailAdresse = "mail@mail@.ch";
        AddressEntry instance = new AddressEntry("test", "tset");
        thrown.expect(InvalidEmailAddressException.class);
        instance.setEmailAddress(eMailAdresse);
        thrown.reportMissingExceptionWithMessage("No exception");
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
        String expResult = "0627584132";
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
    }

    @Test
    public void testsetName() {
        System.out.println("instance");
        System.out.println("setEmailAddress");
        String givenName = "saurisd234";
        String familyName = "io22323pql";
        thrown.expect(IllegalArgumentException.class);
        new AddressEntry(givenName, familyName);
        thrown.reportMissingExceptionWithMessage("No exception");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        AddressEntry instance = new AddressEntry("test", "test");
        AddressEntry other = new AddressEntry("test", "test");
        boolean result = instance.equals(other);
        assertTrue(result);
    }
}
