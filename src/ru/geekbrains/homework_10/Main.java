package ru.geekbrains.homework_10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(); // Создание массива со словами
        arrayList.add("пропасть");
        arrayList.add("столик");
        arrayList.add("крыло");
        arrayList.add("вина");
        arrayList.add("кредит");
        arrayList.add("житель");
        arrayList.add("пропасть");
        arrayList.add("чувство");
        arrayList.add("памятник");
        arrayList.add("беседа");
        arrayList.add("металл");
        arrayList.add("потребитель");
        arrayList.add("житель");
        arrayList.add("памятник");
        arrayList.add("чувство");
        arrayList.add("обстановка");
        arrayList.add("беседа");
        arrayList.add("житель");

        System.out.println("Source array:");
        System.out.println(arrayList); // Вывод всего массива в консоль
        System.out.println();
        System.out.println("List of duplicate elements: " + arrayDuplicateElements(arrayList)); // Вывод списка повторяющихся элементов в консоль
        System.out.println();
        System.out.println("Array elements count:");
        System.out.println(arrayElementsCounter(arrayList)); // Вывод посчитанного количества элементов в консоль
        System.out.println();
        arrayUniqueElements(arrayDuplicateElements(arrayList), arrayList); // Удаление повторяющихся элементов из массива
        System.out.println("List of unique elements: " + arrayList); // Вывод массива в консоль
        System.out.println();

        PhoneBook phoneBook = new PhoneBook(); // Создание нового телефонного справочника
        phoneBook.add("Куксюк", "89077425862"); // Добавление элементов в справочник
        phoneBook.add("Ахметов", "89125695451");
        phoneBook.add("Ахметов", "84215265352");
        phoneBook.get("Ахметов"); // Получение значений по ключу
        phoneBook.add("Крутиков", "87765342746");
        phoneBook.get("Крутиков");
        phoneBook.add("Куксюк", "86547311234");
        phoneBook.get("Куксюк");
    }

    public static HashMap<String, Integer> arrayElementsCounter(ArrayList<String> arrayList) { // Метод подсчёта количества слов
        HashMap<String, Integer> elemCount = new HashMap<>(); // Создание мапы
        int k; // Создание переменной-счётчика
        for (int i = 0; i < arrayList.size(); i++) {
            k = 0;
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) { // Сравнение слов в массива
                    k++;
                    elemCount.put(arrayList.get(i), k); // Добавление слова и количества в мапу
                }
            }
        }
        return elemCount;
    }

    public static Set<String> arrayDuplicateElements(ArrayList<String> arrayList) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    set.add(arrayList.get(i));
                }
            }
        }
        return set;
    }

    public static void arrayUniqueElements(Set<String> set, ArrayList<String> arrayList) {
        Iterator<String> iterator = arrayList.iterator();
        String[] repeatArr = new String[set.size()];
        set.toArray(repeatArr);
        while (iterator.hasNext()) {
            String str = iterator.next();
            for (int i = 0; i < repeatArr.length; i++) {
                if (str.equals(repeatArr[i])) {
                    iterator.remove();
                }
            }
        }
    }
}