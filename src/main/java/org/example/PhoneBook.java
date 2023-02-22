package org.example;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class PhoneBook {
    public static Map<String,String> phoneBook = new TreeMap<>();
    public static int add(String name, String phoneNumber){
        phoneBook.put(name, phoneNumber);
        return phoneBook.size();
    }
    public static String findByNumber(String phoneNumber){

        Optional<String> number = phoneBook.entrySet()
                .stream()
                .filter(entry -> phoneNumber.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
        return number.get();
    }
}
