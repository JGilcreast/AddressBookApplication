/**
 *  JUnit testing program for AddressEntry class
 *
 * @author John Gilcreast
 * @version 1.0
 * @since February 19 2020
 *
 * Purpose: Ensures correct class behavior
 */
package com.company;

import org.junit.*;
import static org.junit.Assert.*;

public class AddressEntryTest {
    AddressEntry testEntry;
    /**
     * Creates a new instance of AddressEntry for each test
     */
    @Before public void setup(){
        testEntry = new AddressEntry();
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void setFirstName() {
        String res = "Test string";
        testEntry.setFirstName(res);
        assertEquals("First Name setter/getter not working properly",res,testEntry.getFirstName());
    }

    /**
     * Tests the getter of the related class field
     */
    @Test
    public void getFirstName() {
        String res = "Test string";
        testEntry.setFirstName(res);
        assertEquals("First Name setter/getter not working properly", res,testEntry.getFirstName());
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void getLastName() {
        String res = "Test string";
        testEntry.setLastName(res);
        assertEquals("Last Name setter/getter not working properly",
                res,testEntry.getLastName());
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void setLastName() {
        String res = "Test string";
        testEntry.setLastName(res);
        assertEquals("Last Name setter/getter not working properly",
                res,testEntry.getLastName());
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void getStreet() {
        String res = "Test string";
        testEntry.setStreet(res);
        assertEquals("Street setter/getter not working properly",
                res,testEntry.getStreet());
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void setStreet() {
        String res = "Test string";
        testEntry.setStreet(res);
        assertEquals("Street setter/getter not working properly",
                res,testEntry.getStreet());
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void getCity() {
        String res = "Test string";
        testEntry.setCity(res);
        assertEquals("City setter/getter not working properly",
                res,testEntry.getCity());
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void setCity() {
        String res = "Test string";
        testEntry.setCity(res);
        assertEquals("City setter/getter not working properly",
                res,testEntry.getCity());
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void getState() {
        String res = "Test string";
        testEntry.setState(res);
        assertEquals("State setter/getter not working properly",
                res,testEntry.getState());
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void setState() {
        String res = "Test string";
        testEntry.setState(res);
        assertEquals("State setter/getter not working properly",
                res, testEntry.getState());
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void getPhone() {
        String res = "Test string";
        testEntry.setPhone(res);
        assertEquals("Phone setter/getter not working properly",
                res,testEntry.getPhone());
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void setPhone() {
        String res = "Test string";
        testEntry.setPhone(res);
        assertEquals("Phone setter/getter not working properly",
                res,testEntry.getPhone());
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void getEmail() {
        String res = "Test string";
        testEntry.setEmail(res);
        assertEquals("Email setter/getter not working properly",
                res,testEntry.getEmail());
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void setEmail() {
        String res = "Test string";
        testEntry.setEmail(res);
        assertEquals("Email setter/getter not working properly",
                res,testEntry.getEmail());
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void getZip() {
        int zip = 12345;
        testEntry.setZip(zip);
        assertEquals("Zip setter/getter not working properly",
                zip,testEntry.getZip());
    }

    /**
     * Tests the setter of the related class field
     */
    @Test
    public void setZip() {
        int zip = 12345;
        testEntry.setZip(zip);
        assertEquals("Zip setter/getter not working properly",
                zip,testEntry.getZip());
    }

    /**
     * Tests the version of the constructor that takes arguments
     */
    @Test
    public void testConstructor(){
       testEntry = new AddressEntry("Test2","Girl","2 house rd.",
               "Anywheretown","UP",67890,
               "(543)123-4567","somethingelse@someplaceelse.net");

        assertEquals("Problem in constructor creating firstName",
                "Test2", testEntry.getFirstName());
        assertEquals("Problem in constructor creating lastName",
                "Girl", testEntry.getLastName());
        assertEquals("Problem in constructor creating street",
                "2 house rd.", testEntry.getStreet());
        assertEquals("Problem in constructor creating city",
                "Anywheretown", testEntry.getCity());
        assertEquals("Problem in constructor creating state",
                "UP", testEntry.getState());
        assertEquals("Problem in constructor creating zip",
                67890, testEntry.getZip());
        assertEquals("Problem in constructor creating phone",
                "(543)123-4567", testEntry.getPhone());
        assertEquals("Problem in constructor creating email",
                "somethingelse@someplaceelse.net", testEntry.getEmail());
    }

    /**
     * Tests that toString returns the correct information in the correct format
     */
    @Test
    public void testToString() {
        testEntry = new AddressEntry("Test2","Girl","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net");

        assertEquals("ToString is not working properly",
                "Test2 Girl\n 2 house rd.\n Anywheretown, UP 67890\n" +
                " somethingelse@someplaceelse.net\n (543)123-4567\n",
                testEntry.toString());
    }
}