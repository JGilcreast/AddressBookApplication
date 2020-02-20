/**
 * The AddressBook class contains a list of AddressEntry objects
 *
 * @author John Gilcreast
 * @version 1.0
 * @since February 13 2020
 *
 * Purpose: A class that represents an address book of personal contacts.
 * Each contact has personal info associated with them.
 */

package com.company;
import java.util.ArrayList;

public class AddressBook {
    /**
     * List of AddressEntry objects
     */
    private ArrayList<Object> addressEntryList = new ArrayList<>();

    /**
     * list() prints all AddressEntry objects in addressEntryList
     * Lists are numbered and in alphabetical order
     */
    void list() {
        if(addressEntryList.size() == 0){
            System.out.print("There are no entries in this book yet");
        }
        for (int i = 0; i < addressEntryList.size(); i++) {
            System.out.print((i+1)+": "+addressEntryList.get(i)+'\n');
        }
    }

    /**
     * listResult prints all AddressEntry objects in addressEntryList that
     * match given last name input
     * Lists are numbered and in alphabetical order
     *
     * @param input String that contains the lastname for the search
     */
    void listResult(String input) {
        int count = 1;
        AddressEntry result;
        if(addressEntryList.size() == 0){
            System.out.print("There are no entries in this book yet");
        }
        for (int i = 0; i < addressEntryList.size(); i++) {
            result = (AddressEntry) addressEntryList.get(i);
            if(result.getLastName().equals(input)){
                System.out.print((count++)+": "+addressEntryList.get(i)+'\n');
            }
        }
    }

    /**
     * Returns number of objects in addressEntryList
     * @return An int representing the number of objects in addressEntryList
     */
    int getLength(){
        return addressEntryList.size();
    }

    /**
     * Return a string containing an entry's data
     * @param ele number of the entry to access (1 is first, 2 is second, etc)
     * @return An entry's data formatted through its toString method
     */
    String getEntry(int ele){
        return addressEntryList.get(ele - 1).toString();
    }

    /**
     * Adds an existing AddressEntry object to this AddressBook object
     * Objects are added by alphabetical order by lastname then firstname
     * @param obj is a populated AddressEntry object
     */
    void add(AddressEntry obj) {
        AddressEntry result;
        for (int i = 0; i < addressEntryList.size(); i++){
            result = (AddressEntry) addressEntryList.get(i);

            if(obj.getLastName().toLowerCase().compareTo(result.getLastName().toLowerCase()) <= 0){

                if (obj.getLastName().toLowerCase().compareTo(result.getLastName().toLowerCase()) == 0){
                    if (obj.getFirstName().toLowerCase().compareTo(result.getFirstName().toLowerCase()) < 0){
                        addressEntryList.add(i, obj);
                        return;
                    }
                        addressEntryList.add(i+1, obj);

                    return;
                }
                addressEntryList.add(i, obj);
                return;
            }
        }

        addressEntryList.add(obj);
    }
}
