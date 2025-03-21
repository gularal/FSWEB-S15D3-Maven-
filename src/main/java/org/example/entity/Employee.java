package org.example.entity;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstname = firstName;
        this.lastname = lastName;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        Employee employee = (Employee) obj;
        return employee.id == id && employee.firstname.equals(firstname) && employee.lastname.equals(lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }
}