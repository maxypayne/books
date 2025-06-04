package com.mlucov.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercises {
    static List<String> list;
    public static void main(String[] args) {
        List<String>  additional = new ArrayList<>(4);
        additional.add("tutu");
        additional.add("dada");
        additional.add("frfr");
        list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
//        Collections.shuffle(list);
//        Collections.reverse(list);
        System.out.println("reversed");
        System.out.println(list);
        //Write a Java program to join two array lists.
        List<String> newArr = new ArrayList<>(additional.size() + list.size());
        newArr.addAll(list);
        newArr.addAll(additional);
        System.out.println(newArr);
        newArr.clear();

    }
    public static void insertAtStart() {
        list.add(0, "d");
    }
    public static void update() {
        list.set(3, "nulllisime");
    }
    public static String getByIndex(int index) {
        return list.get(index);
    }
    public static String removeByIndex(int index) {
        return list.remove(index);
    }
    public static boolean search(String el) {
        return list.contains(el);
    }
    public static void sort() {
        Collections.sort(list);
    }
    public static List<String> cloneArray() {
        return list.subList(0, 1000);
    }

    public static List<String> cloneList(List<String> dogList) {
        List<String> clonedList = new ArrayList<String>(dogList.size());
        for (String dog : dogList) {
            clonedList.add(new String(dog));
        }
        return clonedList;
    }
}
