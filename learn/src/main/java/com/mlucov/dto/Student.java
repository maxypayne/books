package com.mlucov.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private String name;
    private int grade;
    private String section;

    public Student(String name, int grade, String section) {
        this.name = name;
        this.grade = grade;
        this.section = section;
    }
}
