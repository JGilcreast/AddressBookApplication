package com.company;

public class AddressBook {
    private int entryCount; //how many entries there are in addressEntryList
    private AddressEntry[] addressEntryList;


    AddressBook(){
        this.addressEntryList = new AddressEntry[50];
        this.entryCount = 0;
    }

    void list(){
        for (int i = 0; i < entryCount; i++){
            System.out.println(addressEntryList[i]);
        }
    }

    void add(AddressEntry obj){
        addressEntryList[entryCount] = obj;
        entryCount++;
    }
}
