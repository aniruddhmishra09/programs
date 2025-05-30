package org.programs.data;

import java.math.BigDecimal;
import java.util.List;

public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private List<String> phoneNumber;
    private String grade;

    public Employee(Long id, String firstName, String lastName,
                    BigDecimal salary, List<String> phoneNumber, String grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.grade = grade;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", phoneNumber=" + phoneNumber +
                ", grade='" + grade + '\'' +
                '}';
    }
}
