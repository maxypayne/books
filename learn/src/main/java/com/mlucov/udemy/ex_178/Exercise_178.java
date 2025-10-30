package com.mlucov.udemy.ex_178;

import com.mlucov.udemy.ex_177.Employee;

import java.util.Comparator;
import java.util.List;

public class Exercise_178 {
    public static void main(String[] args) {

        List<StoreEmployee> list = new java.util.ArrayList<>(List.of(
            new StoreEmployee(112, "Maxim", 2010, "Qllmart"),
            new StoreEmployee(113, "Ana", 2014, "HM")
        ));
        var comparator = new Employee.EmployeeComparator("yearStarted");
        list.sort(comparator);
        System.out.println(list);
    }
}
