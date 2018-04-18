package phonebook;

public class PhoneBookMain {

    public static void main(String[] args) {

        PhoneBook phonebook = new PhoneBook();

        phonebook.addUser("JohnSmith", "3026");
        phonebook.addUser("JoanAdams", "5456");
        phonebook.addUser("JamesCameron", "4578");
        System.out.println(phonebook);
        System.out.println("===========================================================");


        phonebook.removeAUser("JamesCameron");
        System.out.println(phonebook);
        System.out.println("===========================================================");


        System.out.println(phonebook.lookupAUser("JoanAdams"));
        System.out.println("===========================================================");


        System.out.println(phonebook.reverseLookUpAUser(   "4578"));
        System.out.println("===========================================================");


//        phonebook.listAllEntries();

    }

}
