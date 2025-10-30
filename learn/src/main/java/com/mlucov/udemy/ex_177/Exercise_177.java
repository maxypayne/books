package com.mlucov.udemy.ex_177;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise_177 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
            new Employee(11, "Max", 2019),
            new Employee(12, "Ana", 2009),
            new Employee(13, "Deni", 2014),
            new Employee(13, "Zar", 2004)
        ));

        Comparator<Employee> comparator = new Employee.EmployeeComparator("yearStarted");
        employees.sort(comparator);
        System.out.println(employees);
    }
}
