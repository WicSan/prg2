/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.Optional;
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
public class AddressBookTest {
    
    public AddressBookTest() {
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
    public void testInsertEntry_String() {
        try {
            System.out.println("insertEntry");
            String givenName = "test";
            String familyName = "test2";
            AddressBook instance = new AddressBook();
            boolean result = instance.insertEntry(givenName, familyName);
            assertTrue(result);
        } catch (IllegalArgumentException e) {
            fail("Failed to insert entry.");
        }
    }

    @Test
    public void testRemoveEntry() {
        System.out.println("removeEntry");
        AddressEntry address = new AddressEntry("test", "test");
        AddressBook instance = new AddressBook();
        instance.insertEntry(address);
        boolean result = instance.removeEntry(address);
        assertTrue(result);
    }

    @Test
    public void testFindByName_Nothing() {
        System.out.println("findByName");
        String givenName = "test";
        String familyName = "test2";
        AddressBook instance = new AddressBook();
        Optional<AddressEntry> result = instance.findByName(givenName, familyName);
        assertTrue(!result.isPresent());
    }
    
    @Test
    public void testFindByName() {
        System.out.println("findByName");
        String givenName = "test";
        String familyName = "test2";
        AddressEntry address = new AddressEntry(givenName, familyName);
        AddressBook instance = new AddressBook();
        instance.insertEntry(address);
        Optional<AddressEntry> result = instance.findByName(givenName, familyName);
        assertTrue(result.isPresent());
    }

    @Test
    public void testGetEntryCount() {
        System.out.println("getEntryCount");
        String givenName = "test";
        String familyName = "test2";
        AddressBook instance = new AddressBook();
        instance.insertEntry(givenName, familyName);
        instance.insertEntry(givenName, familyName);
        int expResult = 2;
        int result = instance.getEntryCount();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetEntryCount_Empty() {
        System.out.println("getEntryCount");
        AddressBook instance = new AddressBook();
        int expResult = 0;
        int result = instance.getEntryCount();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSort(){
        System.out.println("sort");
        AddressBook instance = new AddressBook();
        instance.insertEntry("hallo", "du");
        instance.insertEntry("mann", "meier");
        instance.insertEntry("mann", "müller");
        instance.insertEntry("albert", "lolo");
        
        instance.sort();
        instance.print();
    }
    
    @Test
    public void testSort_Phone(){
        System.out.println("sort");
        AddressBook instance = new AddressBook();
        AddressEntry address = new AddressEntry("hallo", "du");
        address.setPhoneNumber("0762567894");
        AddressEntry address2 = new AddressEntry("mann", "meier");
        address2.setPhoneNumber("0762568094");
        AddressEntry address3 = new AddressEntry("mann", "müller");
        address3.setPhoneNumber("0795632336");
        AddressEntry address4 = new AddressEntry("mann", "müller");
        address4.setPhoneNumber("0827582368");
        
        instance.insertEntry(address);
        instance.insertEntry(address2);
        instance.insertEntry(address3);
        instance.insertEntry(address4);
        
        instance.sortbyPhonenumber();
        instance.print();
    }
}
