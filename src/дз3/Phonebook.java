package дз3;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    HashMap<String, ArrayList<String>> people = new HashMap<>();

    public void add1(String lastName, String phoneNumber){
        ArrayList<String> phones = people.get(lastName);
        if(phones != null){
            phones.add(phoneNumber);
        }else{
            phones = new ArrayList<>();
            phones.add(phoneNumber);
            people.put(lastName, phones);
        }
    }

    public void get(String lastName){
        System.out.println("Номер(a) телефона человека по фамилии " + lastName + " это " + people.get(lastName));
    }

    public void vivod(){
        System.out.println(people);
    }

}
