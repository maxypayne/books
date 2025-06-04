package com.mlucov.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>(); // 10 elems by def
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        List<String> additional =new ArrayList<>();
        additional.add("6");
        additional.add("7");
        ListClass<String> customList = new ListClass<>(list);
        customList.add("9");
        customList.add("3");
        customList.addAll(additional);
        System.out.println("the fourth item is " + customList.get(4));
        System.out.println("Index of 4 is " + customList.indexOf("4"));
        System.out.println("Last index of 4 is " + customList.lastIndexOf("4"));
        Iterator<String> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println("Item " + it.next());
        }
        customList.remove(3);
        customList.set(5, "8");
        customList.subList(3, 8);

        MapClass<String, String> mapClass = new MapClass<>();
        mapClass.put("name", "Maxim");
        mapClass.put(null, "20");
        mapClass.put("age", "20");
        mapClass.put("city", "Paris");

        System.out.println("entrySet :" + mapClass.entrySet());
        System.out.println("isEmpty : " + mapClass.isEmpty());
        System.out.println("keySet :" + mapClass.keySet());
        System.out.println("size :" + mapClass.size());
        System.out.println("containsKey :" + mapClass.containsKey("tr"));
        System.out.println("containsValue :" + mapClass.containsValue("Maxim"));
        System.out.println("age :" + mapClass.get("age"));
        System.out.println("values :" + mapClass.values());
        mapClass.iterate();
        
        List<Integer> numbers = Arrays.asList(1,3,4,5,6,7,8,9,0);
//        for (int el : numbers) {
//            System.out.println("el = " + el);
//        }
        numbers.forEach(val -> {
            System.out.println("val = " + val);
        });
    }
}
