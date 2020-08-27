package дз3;

import java.util.*;

public class Main {
    public static void main(String[] args) {


    Phonebook phonebook = new Phonebook();
        phonebook.add1("Ivanov", "46285737584");
        phonebook.add1("Ivanov", "66582059484");
        phonebook.add1("Sidorov", "79301758463");
        phonebook.add1("Petrov", "37306950285");
//        phonebook.vivod();
        phonebook.get("Ivanov");


    String[] arr = {"apple", "pear", "melon", "watermelon", "tomato", "garlic", "cucumber", "pumpkin", "apple", "garlic", "pear", "pear", "pear"};
    HashMap<String, Integer> map = new HashMap<>();
        for (String x : arr) {
        Integer value = map.getOrDefault(x,0);
        map.put(x, value + 1);
    }
        System.out.println(map);

}
}