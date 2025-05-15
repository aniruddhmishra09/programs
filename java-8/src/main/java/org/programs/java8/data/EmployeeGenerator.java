package org.programs.java8.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeGenerator {
    private EmployeeGenerator(){

    }

    public static List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<>(4);
        employeeList.add(new Employee(1L, "John", "Doe", new BigDecimal("10000.00"), List.of("4567", "1234"), "C"));
        employeeList.add(new Employee(2L, "Sam", "Flitoff", new BigDecimal("20000.00"), List.of("0987", "9854"), "B"));
        employeeList.add(new Employee(3L, "Harry", "Stokes", new BigDecimal("30000.00"), List.of("7654", "1245"), "A"));
        employeeList.add(new Employee(4L, "Johny", "Bravo", new BigDecimal("40000.00"), List.of("7890", "3245"), "A"));
        return employeeList;
    }

}
