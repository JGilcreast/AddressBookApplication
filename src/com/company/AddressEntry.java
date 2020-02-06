package com.company;

public class AddressEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String phone;
    private String email;
    private int zip;

    AddressEntry(){}
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

    public String toString(){
        return String.format("%s %s, %s %s, %s %d, %s / %s ",
                this.firstName, this.lastName, this.street, this.city, this.state, this.zip,
                this.phone, this.email);
        //firstname lastname, street city, state zip, phone / email
    }

    String getFirstName(){
        return this.firstName;
    }
    void setFirstName(String input){
        this.firstName = input;
    }

    String getLastName(){
        return this.lastName;
    }
    void setLastName(String input){
        this.lastName = input;
    }

    String getStreet(){
        return this.street;
    }
    void setStreet(String input){
        this.street = input;
    }

    String getCity(){
        return this.city;
    }
    void setCity(String input){
        this.city= input;
    }

    String getState(){
        return this.state;
    }
    void setState(String input){
        this.state = input;
    }

    String getPhone(){
        return this.phone;
    }
    void setPhone(String input){
        this.phone = input;
    }

    String getEmail(){
        return this.email;
    }
    void setEmail(String input){
        this.email = input;
    }

    int getZip(){
        return this.zip;
    }
    void setZip(int input){
        this.zip = input;
    }
}
