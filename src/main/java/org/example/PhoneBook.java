package org.example;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public static Map<String,String> phoneBook = new TreeMap<>();
    public static int add(String name, String phone){
        phoneBook.put(name, phone);
        return phoneBook.size();
    }
}
