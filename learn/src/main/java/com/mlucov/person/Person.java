package com.mlucov.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    public String name;
    public Integer age;
    public String city;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.city = "Defaut city";
    }
    public Person(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    @Override
    public String toString() {
        return "Person " + name + " has : "  + age + " and lives in " + city;
    }

}
