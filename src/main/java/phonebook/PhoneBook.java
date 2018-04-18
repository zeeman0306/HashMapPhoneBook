package phonebook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PhoneBook {

    //instance variable
    private HashMap<String, String> yP = new HashMap<>();



    //Method
    public void addUser(String name, String phoneNumber){
        yP.put(name,phoneNumber);
    }
    public void removeAUser(String name){
        yP.remove(name);
    }
    public String lookupAUser(String name){
        return yP.get(name);
    }
    public String reverseLookUpAUser(String phoneNumber){
        for (Map.Entry<String, String> entry : yP.entrySet()) {
            if (entry.getValue().equals(phoneNumber))
                phoneNumber = entry.getKey();

        }
        return phoneNumber;
    }

//    public String listAllEntries(){
//        return yP.values();
//    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "yP=" + yP +
                '}';
    }
}
