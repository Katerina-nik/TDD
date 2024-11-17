package ru.netology;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PhoneBook {
    static HashMap<String, Long> phoneBook = new HashMap<>();
    String name;

    public int add(String name, long number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
        }
        return phoneBook.size();
    }
    public String findByNumber(long number) {
        Iterator<Map.Entry<String, Long>> iterator = phoneBook.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Long> pair =  iterator.next();
            if (pair.getValue().equals(number)) {
                name = pair.getKey();
            }
            iterator.remove();
        }
        return name;
    }
    public long findByName(String name) {
        return 0;
    }
}
