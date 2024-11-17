package ru.netology;

import java.util.HashMap;

public class PhoneBook {
    static HashMap<String, Long> phoneBook = new HashMap<>();

    public int add(String name, long number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
        }
        return phoneBook.size();
    }

}
