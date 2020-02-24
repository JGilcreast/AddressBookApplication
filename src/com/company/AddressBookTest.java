/**
 *  JUnit testing program for AddressBook class
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
import java.io.*;
import java.util.ArrayList;

public class AddressBookTest {
    AddressBook testBook;

    /**
     * Creates a new AddressBook instance for each test
     */
    @Before public void setup(){
        testBook = new AddressBook();
    }

    /**
     * Tests the add method of AddressBook
     * Should add objects in lastname then firstname alphabetical order
     */
    @Test public void add() {

        assertEquals("AddressBook is created already containing entries",
                0, testBook.getLength());

        AddressEntry testEntry = new AddressEntry("Test2","Girl","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net");

        testBook.add(testEntry);
        assertEquals("AddressBook does not correctly add entry", 1, testBook.getLength());


        assertEquals("AddressBook does not preserve info of object added",
                "Test2 Girl\n 2 house rd.\n Anywheretown, UP 67890\n somethingelse@someplaceelse.net\n (543)123-4567\n" ,
                testBook.getEntry(1));

        testEntry = new AddressEntry("Test2","Boy","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net");
        testBook.add(testEntry);
        assertEquals("Addressbook does not maintain alphabetical order by lastName, Firstname",
                "Test2 Boy\n 2 house rd.\n Anywheretown, UP 67890\n somethingelse@someplaceelse.net\n (543)123-4567\n"
                ,testBook.getEntry(1));

        testEntry = new AddressEntry("A","Boy","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net");
        testBook.add(testEntry);
        assertEquals("Addressbook does not maintain alphabetical order by lastName, Firstname",
                "A Boy\n 2 house rd.\n Anywheretown, UP 67890\n somethingelse@someplaceelse.net\n (543)123-4567\n"
                ,testBook.getEntry(1));

    }

    /**
     * Tests the list function of AddressBook.
     * Should print each entry in the list, numbered and in alphabetical order
     */
    @Test
    public void list() {

        //temporarily change system print stream to a test stream
        OutputStream testPrintStreamHolder = new ByteArrayOutputStream();
        PrintStream testPrintStream = new PrintStream(testPrintStreamHolder);
        System.setOut(testPrintStream);

        testBook.list();
        assertEquals("There are no entries in this book yet", testPrintStreamHolder.toString());

        testBook.add(new AddressEntry("Test2","Girl","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net"));

        testBook.add(new AddressEntry("A","Boy","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net"));
        testBook.list();

        assertEquals("There are no entries in this book yet" +
                        "1: A Boy\n 2 house rd.\n Anywheretown, UP 67890\n" +
                        " somethingelse@someplaceelse.net\n (543)123-4567\n\n" +
                        "2: Test2 Girl\n 2 house rd.\n Anywheretown, UP 67890\n" +
                        " somethingelse@someplaceelse.net\n (543)123-4567\n\n",
                testPrintStreamHolder.toString());

        //restore system output stream
        PrintStream normalOut = System.out;
        System.setOut(normalOut);
    }

    /**
     * Tests the list by last name function of AddressBook.
     * Should print each entry in the list that match given last name, numbered and in alphabetical order
     */
    @Test
    public void testListResult() {
        //temporarily change system print stream to a test stream
        OutputStream testPrintStreamHolder = new ByteArrayOutputStream();
        PrintStream testPrintStream = new PrintStream(testPrintStreamHolder);
        System.setOut(testPrintStream);

        testBook.list();
        assertEquals("There are no entries in this book yet", testPrintStreamHolder.toString());

        testBook.add(new AddressEntry("Test2","Girl","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net"));

        testBook.add(new AddressEntry("A","Boy","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net"));

        assertEquals("The correct search result was not received by listResult",
                testBook.listResult("Boy").size(), 1);

        //restore system output stream
        PrintStream normalOut = System.out;
        System.setOut(normalOut);
    }

    @Test
    public void testListResult2(){
        //temporarily change system print stream to a test stream
        OutputStream testPrintStreamHolder = new ByteArrayOutputStream();
        PrintStream testPrintStream = new PrintStream(testPrintStreamHolder);
        System.setOut(testPrintStream);


        testBook.list();
        assertEquals("There are no entries in this book yet", testPrintStreamHolder.toString());

        testBook.add(new AddressEntry("Test2","Girl","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net"));

        testBook.add(new AddressEntry("A","Boy","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net"));

        ArrayList<Object> testList = testBook.listResult("Boy");

        assertEquals(testList.size(), 1);
        assertEquals("The wrong element was retrieved in listResult",
                "A Boy\n 2 house rd.\n Anywheretown, UP 67890\n somethingelse@someplaceelse.net\n (543)123-4567\n",
                testList.get(0).toString());


        //restore system output stream
        PrintStream normalOut = System.out;
        System.setOut(normalOut);
    }

    @Test
    public void testRemove1(){
        assertEquals(0, testBook.getLength());

        AddressEntry newEntry = new AddressEntry("Test2","Girl","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net");
        testBook.add(newEntry);

        assertEquals(1, testBook.getLength());

        testBook.remove(newEntry);

        assertEquals(0, testBook.getLength());
    }

    @Test
    public void testRemove2(){
        assertEquals(0, testBook.getLength());
        AddressEntry newEntry = new AddressEntry("Test2","Girl","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net");

        AddressEntry newEntry2 = new AddressEntry("A","Boy","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net");

        testBook.add(newEntry);
        testBook.add(newEntry2);


        assertEquals(2, testBook.getLength());

        testBook.remove(newEntry2);
        assertEquals("Remove does not select the correct element to remove",
                "Test2 Girl\n 2 house rd.\n Anywheretown, UP 67890\n somethingelse@someplaceelse.net\n (543)123-4567\n"
                ,testBook.getEntry(1));
        assertEquals(1, testBook.getLength());
    }
}