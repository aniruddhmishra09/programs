package org.programs.java8.streams.features;

import org.programs.data.Employee;
import org.programs.data.EmployeeGenerator;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeGenerator.getEmployees();

        System.out.println("******* Printing Names using Map *******");
        List<String> names = employeeList.stream().map(Employee::getFirstName).collect(Collectors.toList());
        System.out.println(names);
        System.out.println("******* Printing Names using Map *******");
        List<List<String>> phoneNumbersWithMap = employeeList.stream().map(Employee::getPhoneNumber).collect(Collectors.toList());
        System.out.println(phoneNumbersWithMap);
        System.out.println("******* Printing Names using FlatMap *******");
        List<String> phoneNumbersWithFlatMap = employeeList.stream().flatMap(obj -> obj.getPhoneNumber().stream()).collect(Collectors.toList());
        System.out.println(phoneNumbersWithFlatMap);

    }
}
