/**
 *  JUnit testing program for Menu class
 *
 * @author John Gilcreast
 * @version 1.0
 * @since February 19 2020
 *
 * Purpose: Ensures correct class behavior
 */
package com.company;

import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MenuTest {
    Menu testMenu;
    OutputStream testPrintStreamHolder;

    @Before
    public void setup(){
        testMenu = new Menu();

        //temporarily change system print stream to a test stream
        testPrintStreamHolder = new ByteArrayOutputStream();
        PrintStream testPrintStream = new PrintStream(testPrintStreamHolder);
        System.setOut(testPrintStream);

        AddressEntry entry1 = new AddressEntry("Test", "Guy", "123 abc rd.",
        "Wheresville", "NA", 54321, "(123)867-5309", "something@someplace.org");
        AddressEntry entry2 = new AddressEntry("Test2","Girl","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net");

        AddressBook ab = new AddressBook();
        ab.add(entry1);
        ab.add(entry2);
    }

    @After
    public void cleanup() {
        //restore system output stream
        PrintStream normalOut = System.out;
        System.setOut(normalOut);
    }

    @Test
    public void init(){
        assertEquals("*****************************\n" +
                "Please enter in your menu selection\n" +
                "a) Loading From File\n" +
                "b) Addition\n" +
                "c) Removal\n" +
                "d) Find\n" +
                "e) Listing\n" +
                "f) Quit\n" +
                "*****************************\n", testPrintStreamHolder.toString());
    }

//AddressInputDataFile.txt


    @Test
    public void search(){
        AddressBook testBook = new AddressBook();
        //take input

        //temporarily change system print stream to a test stream
        OutputStream testPrintStreamHolder = new ByteArrayOutputStream();
        PrintStream testPrintStream = new PrintStream(testPrintStreamHolder);
        System.setOut(testPrintStream);

        testBook.add(new AddressEntry("Test2","Girl","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net"));

        testBook.add(new AddressEntry("A","Boy","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net"));
        testBook.listResult("Boy");

        assertEquals("1: A Boy\n 2 house rd.\n Anywheretown, UP 67890\n" +
                        " somethingelse@someplaceelse.net\n (543)123-4567\n\n",
                testPrintStreamHolder.toString());


        //restore system output stream
        PrintStream normalOut = System.out;
        System.setOut(normalOut);
    }
}