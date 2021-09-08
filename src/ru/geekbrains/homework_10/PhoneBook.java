package ru.geekbrains.homework_10;

import java.util.*;

public class PhoneBook {
    HashMap<String, Set<String>> phoneBook = new HashMap<>();

    public PhoneBook() {
        add("Ахметов", "89852595662");
        add("Крутиков", "89456827673");
        add("Чекудаев", "89672688826");
        add("Кидин", "89471079975");
    }

    public void add(String surname, String number) {
        Set<String> set = new HashSet<>();
        if (phoneBook.containsKey(surname)) {
            set = (phoneBook.get(surname));
        }
        set.add(number);
        phoneBook.put(surname, set);

    }

    public void get(String surname) {
        System.out.println("Phone numbers of " + surname + ":");
        System.out.println(phoneBook.get(surname));
    }

    public void print() {
        System.out.println(phoneBook);
        System.out.println();
    }
}