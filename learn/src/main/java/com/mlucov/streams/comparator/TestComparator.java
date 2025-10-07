package com.mlucov.streams.comparator;

import com.mlucov.person.PersonWithBuilder;

public class TestComparator {
    public static void main(String[] args) {
        PersonWithBuilder p1 = new PersonWithBuilder("Maxim", 30);
        PersonWithBuilder p2 = new PersonWithBuilder("Ana", 20);

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
