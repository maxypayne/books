package com.mlucov.udemy.ex_178;

import com.mlucov.udemy.ex_177.Employee;

import java.util.Comparator;

public class StoreEmployee extends Employee {
    private String store;

    public StoreEmployee(int employeeId, String name, int yearStarted, String store) {
        super(employeeId, name, yearStarted);
        this.store = store;
    }

    public class StoreComparator<T extends StoreEmployee> implements Comparator<StoreEmployee> {

        @Override
        public int compare(StoreEmployee o1, StoreEmployee o2) {
            int res = o1.store.compareTo(o2.store);
            if(res == 0) {
                return new Employee.EmployeeComparator("yearStarted").compare(o1, o2);
            }
            return res;
        }
    }
}
