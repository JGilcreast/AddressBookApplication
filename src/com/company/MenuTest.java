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

    @Before
    public void setup(){
        testMenu = new Menu();
    }

    @Test
    public void prompt_FirstName(){
        //temporarily change system print stream to a test stream
        OutputStream testPrintStreamHolder = new ByteArrayOutputStream();
        PrintStream testPrintStream = new PrintStream(testPrintStreamHolder);
        System.setOut(testPrintStream);

        testMenu.prompt_FirstName();
        assertEquals("First Name:"+System.getProperty("line.separator"), testPrintStreamHolder.toString());

        //restore system output stream
        PrintStream normalOut = System.out;
        System.setOut(normalOut);
    }

    @Test
    public void prompt_LastName() {
        System.out.println("Last Name:");
    }

    @Test
    public void prompt_Street() {
        System.out.println("Street Address:");
    }

    @Test
    public void prompt_City() {
        System.out.println("City:");
    }

    @Test
    public void prompt_State() {
        System.out.println("State:");
    }

    @Test
    public void prompt_Zip() {
        System.out.println("Zip Code:");
    }

    @Test
    public void prompt_Telephone() {
        System.out.println("Phone number:");
    }

    @Test
    public void prompt_Email() {
        System.out.println("Email Address:");
    }

    /**
     * Search and displays records by those who match given last name
     */
    @Test
    public void search(){
        AddressBook testBook = new AddressBook();
        testMenu.prompt_LastName();
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