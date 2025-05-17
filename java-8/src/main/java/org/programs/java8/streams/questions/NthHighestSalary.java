package org.programs.java8.streams.questions;

import org.programs.data.Employee;
import org.programs.data.EmployeeGenerator;
import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalary {
    public static void main(String[] args) {
       List<Employee> employees = EmployeeGenerator.getEmployees();
       System.out.println("**************************Printing All Employee Data**************************");
       employees.forEach(System.out::println);
       List<Employee> employeeWithSalaryOrder = getEmployeeName(employees, 2);
       System.out.println("**************************Printing Employee Data Salary Order**************************");
       employeeWithSalaryOrder.forEach(System.out::println);

    }

    private static List<Employee> getEmployeeName(List<Employee> employees, int salaryOrder){
        return employees.stream().collect(Collectors.groupingBy(Employee::getSalary))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry::getKey)) )
                .collect(Collectors.toList())
                .get(salaryOrder-1).getValue();
    }
}
