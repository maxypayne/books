package com.mlucov.person;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonWithComparable implements Comparable<PersonWithComparable> {
    private String name;
    private Integer age;

    @Override
    public int compareTo(PersonWithComparable other) {
        return this.age.compareTo(other.age);
    }

    public PersonWithComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person " + name + " has : "  + age;
    }
}
