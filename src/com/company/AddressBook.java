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
     */
    void list(){
        for (int i = 0; i < addressEntryList.size(); i++){
            System.out.println(addressEntryList.get(i));
        }
    }

    /**
     * Adds an existing AddressEntry object to this AddressBook object
     * @param obj is a populated AddressEntry object
     */
    void add(AddressEntry obj){
        addressEntryList.add(obj);
    }
}
