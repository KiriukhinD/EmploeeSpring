package com.emploee.demo.Emploee1Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmploeeController {
    private final EmployeeService employeeService;

    public EmploeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping
    public String addEmployee(String firstName, String lastFamily) {
        return "hello";
    }


}
