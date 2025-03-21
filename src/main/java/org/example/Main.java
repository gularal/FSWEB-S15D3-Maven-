package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(123, "Berra", "Karaman"));
        employeeList.add(new Employee(123, "Berra", "Karaman"));
        employeeList.add(new Employee(1234, "Berrak", "Kahraman"));
    }

    public static List<Employee> removeDuplicates(List<Employee> employeeList) {
        List<Employee> uniqueList = new ArrayList<>();

        for (Employee employee: employeeList) {
            if (employee != null && Collections.frequency(employeeList, employee) == 1) {
                uniqueList.add(employee);
            }
        }

        return uniqueList;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> employeeList) {
        Map<Integer, Employee> uniques = new HashMap<>();

        for (Employee employee: employeeList) {
            if (employee != null && !uniques.containsKey(employee.getId())) {
                uniques.put(employee.getId(), employee);
            }
        }

        return uniques;
    }

    public static List<Employee> findDuplicates(List<Employee> employeeList) {
        List<Employee> duplicates = new ArrayList<>();

        for (Employee employee: employeeList) {
            if (employee != null && Collections.frequency(employeeList, employee) > 1 && !duplicates.contains(employee)) {
                duplicates.add(employee);
            }
        }

        return duplicates;
    }
}