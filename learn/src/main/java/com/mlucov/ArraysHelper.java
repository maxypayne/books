package com.mlucov;

import java.util.*;

public class ArraysHelper {
    public static void main(String[] args) {
//        iteratorHandler();
    }
    ArraysHelper() {
        this.mapHandler();
    }

    public static void ListHandler() {
        List<String> collection = new ArrayList<String>();
        collection.add("First");
        collection.add("Second");
        collection.add("Third");
        collection.add("Fifth");
        for (String s : collection) {
            System.out.println("OBJET" + s);
        }
    }
    protected static void iteratorHandler() {
        // hasNext(), next(), remove();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Linked list " + iterator.next());
        }
    }

    protected void mapHandler() {
        Map<String, Integer>  map = new HashMap<>();
        map.put("key2", 34);
        System.out.println(map);
    }
}