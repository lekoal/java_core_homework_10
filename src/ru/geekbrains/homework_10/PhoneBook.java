package ru.geekbrains.homework_10;

import java.util.*;

public class PhoneBook { // Создание класса телефонного справочника
    HashMap<String, Set<String>> phoneBook = new HashMap<>(); // Создание мапы для хранения номеров и фамилий

    public PhoneBook() { // Конструктор с начальным заполнением мапы
        add("Ахметов", "89852595662");
        add("Крутиков", "89456827673");
        add("Чекудаев", "89672688826");
        add("Кидин", "89471079975");
    }

    public void add(String surname, String number) { // Метод добавления значений в мапу
        Set<String> set = new HashSet<>();
        if (phoneBook.containsKey(surname)) { // Если ключ уже находился в мапе, то в сет добавляется номер, относящийся к данному ключу
            set = (phoneBook.get(surname));
        }
        set.add(number); // Добавление в сет текущего значения
        phoneBook.put(surname, set); // Запись в мапу ключа и значения

    }

    public void get(String surname) { // Вывод в консоль значение по ключу
        System.out.println("Phone numbers of " + surname + ":");
        System.out.println(phoneBook.get(surname));
    }

    public void print() { // Печать всех значений мапы
        System.out.println(phoneBook);
        System.out.println();
    }
}