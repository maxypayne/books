package com.mlucov.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class Person {
    String name;
    Integer age;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        return Objects.equals(((Person) obj).age, this.age) && Objects.equals(((Person) obj).name, this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
