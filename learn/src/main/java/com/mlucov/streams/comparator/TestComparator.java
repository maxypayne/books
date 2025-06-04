package com.mlucov.streams.comparator;

import learn.person.Person;

import java.util.function.Function;

public class TestComparator {
    public static void main(String[] args) {
        Person p1 = new Person("Maxim", 30);
        Person p2 = new Person("Ana", 20);

//        Function<Person, String> nameFunc = Person::getName;
//        nameFunc.apply(p1);
//        Function<Person, Integer> ageFunc = Person::getAge;
//        ageFunc.apply(p1);
//        CustomComparator<Person> comparingName = CustomComparator.comparing(nameFunc);
//        CustomComparator<Person> comparingAge = CustomComparator.comparing(ageFunc);
//
//        CustomComparator<Person> customComparator = comparingName.thenComparing(comparingAge);
//        customComparator.compare(p1, p2);
//
//        System.out.println("Ana > Maxim : " + customComparator.compare(p1, p2));
    }
}
