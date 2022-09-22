package com.emploee.demo.EmploeeSpring.Service;

import com.emploee.demo.EmploeeSpring.Employee;
import com.emploee.demo.EmploeeSpring.Exception.EmployeeAlreadyAddedException;
import com.emploee.demo.EmploeeSpring.Exception.EmployeeNotFoundException;
import com.emploee.demo.EmploeeSpring.Exception.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private static final int SIZE = 5;
    private final List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }


    public Employee addEmployee(String firstName, String lastFamily) {
        Employee employee = new Employee(firstName, lastFamily);
        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException("");
        }

        if (employees.size() >= SIZE) {
            throw new EmployeeStorageIsFullException("");
        }
        employees.add(employee);
        return employee;
    }

    public Employee removeEmployee(String firstName, String lastFamily) {
        Employee employee = new Employee(firstName, lastFamily);

        if (employees.contains(employee)) {
            employees.remove(employee);
            return employee;
        }

        throw new EmployeeNotFoundException("");

    }

    public Employee findEmployee(String firstName, String lastFamily) {
        Employee employee = new Employee(firstName, lastFamily);

        if (employees.contains(employee)) {
            return employee;
        }

        throw new EmployeeNotFoundException("");

    }

    public List<Employee> listEmployee() {
        return new ArrayList<>(employees);
    }

}

