package com.mlucov.person;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.function.Consumer;

@Setter
@Getter
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static class Builder {
        private String name;
        private Integer age;

        public Builder name(String name){ this.name = name; return this; }
        public Builder age(Integer age){ this.age = age; return this; }
        public Person build() {
            return new Person(name, age);
        }
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
