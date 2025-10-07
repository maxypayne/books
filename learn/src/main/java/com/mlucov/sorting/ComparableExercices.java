package com.mlucov.sorting;

import com.mlucov.person.PersonWithBuilder;
import com.mlucov.person.PersonWithComparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparableExercices {
    public static void main(String[] args) {
        PersonWithComparable personWithBuilder = new PersonWithComparable("Jane", 24);
        PersonWithComparable personWithBuilder2 = new PersonWithComparable("Jake", 15);
        PersonWithComparable personWithBuilder3 = new PersonWithComparable("Jake", 90);
        List<PersonWithComparable> people = Arrays.asList(personWithBuilder, personWithBuilder2, personWithBuilder3);
        people.sort(Comparator.naturalOrder());
        people.forEach(System.out::println);
    }

    public void ex1() {
//        Comparator<Person> comparator = (Person o1, Person o2) -> {
//            return this.age.compareTo(other.age);
//        };
//        List<Person> people = Arrays.asList(
//            new Person("Jane", 24),
//            new Person("Jake", 15),
//            new Person("Lolo", 34)
//        );
//        people.sort(comparator);
//        Collections.sort(people, comparator);
    }
}
