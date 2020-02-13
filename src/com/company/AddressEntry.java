/**
 * The AddressEntry class represents a single person's information
 *
 * @author John Gilcreast
 * @version 1.0
 * @since February 13 2020
 *
 * Purpose: A class that represents an address book entry.
 * Contains information associated with a single contact.
 */

package com.company;

public class AddressEntry {
    /**
     * First name
     */
    private String firstName;
    /**
     * Last name
     */
    private String lastName;
    /**
     * Street address
     */
    private String street;
    /**
     * City
     */
    private String city;
    /**
     * State
     */
    private String state;
    /**
     * Phone number
     */
    private String phone;
    /**
     * Email address
     */
    private String email;
    /**
     * zip code
     */
    private int zip;

    AddressEntry(){}

    /**
     * AddressEntry constructor with parameters for each input field
     *
     * @param inFirstName String first name input
     * @param inLastName String last name input
     * @param inStreet String street address input
     * @param inCity String city input
     * @param inState String state input
     * @param inZip Integer zip code input
     * @param inPhone String phone input
     * @param inEmail String email input
     */
    AddressEntry(String inFirstName, String inLastName, String inStreet, String inCity,
                 String inState, int inZip, String inPhone, String inEmail){
        this.firstName = inFirstName;
        this.lastName = inLastName;
        this.street = inStreet;
        this.city = inCity;
        this.state = inState;
        this.zip = inZip;
        this.phone = inPhone;
        this.email = inEmail;
    }

    /**
     * Formats objects data into a string
     *
     * @return Returns a formatted string of the AddressEntry object's data
     */
    public String toString(){
        return String.format("%s %s, %s %s, %s %d, %s / %s ",
                this.firstName, this.lastName, this.street, this.city, this.state, this.zip,
                this.phone, this.email);
        //firstname lastname, street city, state zip, phone / email
    }

    /**
     * Gets associated data field
     * @return String containing firstName
     */
    String getFirstName(){
        return this.firstName;
    }

    /**
     * Sets associated data field
     * @param input String input for firstName field
     */
    void setFirstName(String input){
        this.firstName = input;
    }

    /**
     * Gets associated data field
     * @return String containing lastName
     */
    String getLastName(){
        return this.lastName;
    }
    /**
     * Sets associated data field
     * @param input String input for lastName field
     */
    void setLastName(String input){
        this.lastName = input;
    }

    /**
     * Gets associated data field
     * @return String containing street address
     */
    String getStreet(){
        return this.street;
    }
    /**
     * Sets associated data field
     * @param input String input for street field
     */
    void setStreet(String input){
        this.street = input;
    }

    /**
     * Gets associated data field
     * @return String containing city
     */
    String getCity(){
        return this.city;
    }
    /**
     * Sets associated data field
     * @param input String input for city field
     */
    void setCity(String input){
        this.city= input;
    }

    /**
     * Gets associated data field
     * @return String containing state
     */
    String getState(){
        return this.state;
    }
    /**
     * Sets associated data field
     * @param input String input for state field
     */
    void setState(String input){
        this.state = input;
    }

    /**
     * Gets associated data field
     * @return String containing phone number
     */
    String getPhone(){
        return this.phone;
    }
    /**
     * Sets associated data field
     * @param input String input for phone field
     */
    void setPhone(String input){
        this.phone = input;
    }

    /**
     * Gets associated data field
     * @return String containing email address
     */
    String getEmail(){
        return this.email;
    }
    /**
     * Sets associated data field
     * @param input String input for email field
     */
    void setEmail(String input){
        this.email = input;
    }

    /**
     * Gets associated data field
     * @return Integer containing zip code
     */
    int getZip(){
        return this.zip;
    }
    /**
     * Sets associated data field
     * @param input Integer input for zip field
     */
    void setZip(int input){
        this.zip = input;
    }
}
