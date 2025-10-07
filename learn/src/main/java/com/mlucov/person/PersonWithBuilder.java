package com.mlucov.person;


import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class PersonWithBuilder {

    private String name;
    private Integer age;

    public PersonWithBuilder(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static class Builder {
        private String name;
        private Integer age;

        public Builder name(String name){ this.name = name; return this; }
        public Builder age(Integer age){ this.age = age; return this; }
        public PersonWithBuilder build() {
            return new PersonWithBuilder(name, age);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PersonWithBuilder)) {
            return false;
        }
        return Objects.equals(((PersonWithBuilder) obj).age, this.age) && Objects.equals(((PersonWithBuilder) obj).name, this.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    @Override
    public String toString() {
        return "Person " + name + " " + age;
    }
}
