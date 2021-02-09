package HW2;

import java.util.*;

public class PhoneBook {
    Map<String, List<String>> telSpravochnik = new HashMap<>();

    public void add(String surname, String number){
        List<String> addList = new ArrayList<>();
        if (telSpravochnik.containsKey(surname)) {
            addList = telSpravochnik.get(surname);
        }
            addList.add(number);
            telSpravochnik.put(surname, addList);
    }

    public List<String> get (String surname){
        return telSpravochnik.get(surname);
    }

    public static void main(String[] args) {
        PhoneBook myBook = new PhoneBook();
        myBook.add("Petrov", "+74956258963");
        myBook.add("Ivanov", "+74999632541");
        myBook.add("Orlova", "+79584123698");
        myBook.add("Ivanov", "+79154861256");

        System.out.println(myBook.get("Ivanov"));

    }
}
