package com.company;

/** Menu class currently only has static methods to prompt to standard output information about a Contact like name,etc
 **/

class Menu {

    /**
     * prompt_FirstName  generates a standard output prompt for the First Name to be entered
     */
    public static void prompt_FirstName() {

        System.out.println("First Name:");

    }

    //*****NOW you create code for the other methods required for this Exercise ********
    public static void prompt_LastName() {
        System.out.println("Last Name:");
    }

    public static void prompt_Street() {
        System.out.println("Street Address:");
    }

    public static void prompt_City() {
        System.out.println("City:");
    }

    public static void prompt_State() {
        System.out.println("State:");
    }

    public static void prompt_Zip() {
        System.out.println("Zip Code:");
    }

    public static void prompt_Telephone() {
        System.out.println("Phone number:");
    }

    public static void prompt_Email() {
        System.out.println("Email Address:");
    }
}