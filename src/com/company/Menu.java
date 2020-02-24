/**
 *  Menu class, displays prompts for the user to interact with the AddressBook class
 *  Also responsible for basic input validation
 *
 * @author John Gilcreast
 * @version 1.0
 * @since February 19 2020
 *
 * Purpose: Acts as a user interface for the AddressBook class
 */
package com.company;
import java.io.*;
import java.util.ArrayList;

public class Menu {
    private AddressBook ab;
    private static BufferedReader input;

    Menu(){
        ab = new AddressBook();
        InputStreamReader inputStr = new InputStreamReader(System.in);
        input = new BufferedReader(inputStr);
    }

    public void init(){
        char select = 'j';
        String line;
        while(select != 'f'){
            System.out.print(
                    "*****************************\n" +
                            "Please enter in your menu selection\n" +
                            "a) Loading From File\n" +
                            "b) Addition\n" +
                            "c) Removal\n" +
                            "d) Find\n" +
                            "e) Listing\n" +
                            "f) Quit\n" +
                            "*****************************\n");

            line = promptInput();
            if (line.length() > 1 || line.length() == 0) {
                select = 'j';
            }else{
                select = line.charAt(0);
            }

            switch(select) {
                case 'a':
                    readFile();
                    break;
                case 'b':
                    add();
                    break;
                case 'c':
                    remove();
                    break;
                case 'd':
                    find();
                    break;
                case 'e':
                    list();
                    break;
                case 'j':
                    System.out.print("Please input a selection from a-f\n");
                    break;
            }
        }
        System.out.print("*****************************\n" +
                "Goodbye!");
    }
    public void readFile() {
        System.out.print("*****************************\n" +
                "Please enter filename: ");
        try{
            String line = input.readLine();
            if(line == null){
                System.out.print("*****************************\n" +
                        "No input received, returning to menu\n");
            }else{
            readFileHelper(line);
            }
        }catch (IOException e){
            System.out.print("Error reading user input in Menu.readFile()\n");
        }
    }
    public void readFileHelper(String inputFile) {
        try {
            FileReader file_input = new FileReader(inputFile); //"AddressInputDataFile.txt"
            BufferedReader BR = new BufferedReader(file_input);
            AddressEntry entry;

            int i = 0;

            try {
                String inS = BR.readLine();
                while (inS != null) {
                    entry = new AddressEntry();

                    entry.setFirstName(inS);
                    entry.setLastName(BR.readLine());
                    entry.setStreet(BR.readLine());
                    entry.setCity(BR.readLine());
                    entry.setState(BR.readLine());
                    entry.setZip(Integer.parseInt(BR.readLine()));
                    entry.setEmail(BR.readLine());
                    entry.setPhone(BR.readLine());

                    ab.add(entry);
                    inS = BR.readLine();

                    i++;
                    System.out.print("Read in "+i+" entries\n");
                }
            } catch (IOException e) {
                System.out.println("error reading from file");
            }
        } catch (FileNotFoundException e) {
            System.out.println("input.txt file not found");
        }
    }

    public static String promptInput(){
        try{
            String line = input.readLine();
            if(line == null){
                System.out.print("*****************************\n" +
                        "No input received\n");
            }
            return line;
        }catch (IOException e){
            System.out.print("*****************************\n" +
                    "Error reading user input in Menu.promptInput()\n");
            return null;
        }
    }

    public void add(){
        AddressEntry newEntry = new AddressEntry();
        System.out.print("*****************************\n" +
                "Please enter new entry information\n\n" +
                "First Name:");
        String line = promptInput();
        if (line == null){
            return;
        }else{
            newEntry.setFirstName(line);
        }

        System.out.print("Last Name:");
        line = promptInput();
        if (line == null){
            return;
        }else{
            newEntry.setLastName(line);
        }

        System.out.print("Street:");
        line = promptInput();
        if (line == null){
            return;
        }else{
            newEntry.setStreet(line);
        }

        System.out.print("City:");
        line = promptInput();
        if (line == null){
            return;
        }else{
            newEntry.setCity(line);
        }

        System.out.print("State:");
        line = promptInput();
        if (line == null){
            return;
        }else{
            newEntry.setState(line);
        }

        System.out.print("Phone:");
        line = promptInput();
        if (line == null){
            return;
        }else{
            newEntry.setPhone(line);
        }

        System.out.print("Email:");
        line = promptInput();
        if (line == null){
            return;
        }else{
            newEntry.setEmail(line);
        }

        boolean valid;
        do {
            valid = true;
            try {
                System.out.print("Zip Code:");
                line = promptInput();
                if (line == null){
                    return;
                }else {
                    newEntry.setZip(Integer.parseInt(line));
                }
            }catch (NumberFormatException e){
                valid = false;
                System.out.print("Please enter an integer for the Zip code\n");
            }
        }while (!valid);

        ab.add(newEntry);
    }

    public void remove(){
        System.out.println("Enter last name");
        String line = promptInput();
        if(line == null){
            System.out.print("*****************************\n" +
                    "No input received, returning to menu\n");
        }else{
            ArrayList<Object> searchResults = ab.listResult(line);
            for(int i = 0; i < searchResults.size(); i++){
                System.out.print((i+1)+": "+searchResults.get(i).toString()+'\n');
            }
            if(searchResults.size() == 0){
                System.out.print("*****************************\n" +
                        "No result found, please ensure correct capitalization\n");
                return;
            }

            boolean valid;
            int selection;
            do {
                valid = true;
                try {
                    System.out.println("Enter entry to delete, or enter nothing to exit without deletion");
                    line = promptInput();
                    if(line == null){
                        System.out.print("*****************************\n" +
                                "No input received, returning to menu\n");
                        return;
                    }else {
                        selection = Integer.parseInt(line);
                        if(selection > 0 && selection <= searchResults.size()){
                            ab.remove((AddressEntry) searchResults.get(selection-1));
                        }else{
                            valid = false;
                        }
                    }
                }catch (NumberFormatException e){
                    valid = false;
                }
            }while (!valid);
        }
    }
    public void find(){
        System.out.println("Enter last name");
        String line = promptInput();
        if(line == null){
            System.out.print("*****************************\n" +
                    "No input received, returning to menu\n");
        }else{
            ArrayList<Object> searchResults = ab.listResult(line);
            for(int i = 0; i < searchResults.size(); i++){
                System.out.print((i+1)+": "+searchResults.get(i).toString()+'\n');
            }

            if (searchResults.size() == 0){
                System.out.print("*****************************\n" +
                        "No result found, please ensure correct capitalization\n");
            }
        }
    }
    public void list(){
        ab.list();
    }



}