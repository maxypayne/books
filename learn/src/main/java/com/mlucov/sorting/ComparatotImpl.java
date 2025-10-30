package com.mlucov.sorting;

import com.mlucov.dto.Person;

import java.util.Comparator;

public class ComparatotImpl implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
