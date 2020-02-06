package com.company;

public class AddressBookApplication {

    public static void initAddressBookExercise(AddressBook ab){
        AddressEntry entry1 = new AddressEntry();

        entry1.setFirstName("Test");
        entry1.setLastName("Guy");
        entry1.setStreet("123 abc rd.");
        entry1.setCity("Wheresville");
        entry1.setState("NA");
        entry1.setZip(54321);
        entry1.setPhone("(123)867-5309");
        entry1.setEmail("something@someplace.org");

        AddressEntry entry2 = new AddressEntry("Test2","Girl","2 house rd.",
                "Anywheretown","UP",67890,
                "(543)123-4567","somethingelse@someplaceelse.net");

        ab.add(entry1);
        ab.add(entry2);
        ab.list();

        //output

        /*
        "C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.2\jbr\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.2\lib\idea_rt.jar=65205:C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.2\bin" -Dfile.encoding=UTF-8 -classpath "F:\Documents\CSU EB\Spring 2020\CS 401\AddressBookApplication (1 28 20)\out\production\AddressBookApplication (1 28 20)" com.company.AddressBookApplication
        Test Guy, 123 abc rd. Wheresville, NA 54321, (123)867-5309 / something@someplace.org
        Test2 Girl, 2 house rd. Anywheretown, UP 67890, (543)123-4567 / somethingelse@someplaceelse.net

        Process finished with exit code 0
        */
    }

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        initAddressBookExercise(ab);

        /*
        //simply invokes static methods of the Menu class

        Menu.prompt_FirstName();

        Menu.prompt_LastName();

        //***YOU NOW FINISH CODE TO CALL ALL the rest of the static methods of the Menu class
        Menu.prompt_Street();
        Menu.prompt_City();
        Menu.prompt_State();
        Menu.prompt_Zip();
        Menu.prompt_Telephone();
        Menu.prompt_Email();
        */
    }
}
