package org.programs.java8.streams;

import org.programs.java8.data.Employee;
import org.programs.java8.data.EmployeeGenerator;

import java.math.BigDecimal;
import java.util.List;

public class FilterAndReduceDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeGenerator.getEmployees();
        System.out.println("******Printing Sum of Salary of Grade A Employee****");
        BigDecimal sum = employees.stream().filter(obj -> obj.getGrade().equalsIgnoreCase("A"))
                .map(obj -> obj.getSalary())
                .reduce(new BigDecimal(0), (a, b) -> a.add(b));
        System.out.println("Sum of Salary - "+sum);
    }
}
