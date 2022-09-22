package com.emploee.demo.EmploeeSpring.Controller;

import com.emploee.demo.EmploeeSpring.Employee;
import com.emploee.demo.EmploeeSpring.Service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emploee")

public class EmploeeController {
    private final EmployeeService employeeService;

    public EmploeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path = "/add")
    public Employee addEmployee(@RequestParam("firstName") String firstName,
                                @RequestParam("lastFamily") String lastFamily) {
        return employeeService.addEmployee(firstName, lastFamily);
    }

    @GetMapping(path = "/remove")
    public Employee removeEmployee(@RequestParam("firstName") String firstName,
                                   @RequestParam("lastFamily") String lastFamily) {
        return employeeService.removeEmployee(firstName, lastFamily);
    }

    @GetMapping(path = "/find")
    public Employee findEmployee(@RequestParam("firstName") String firstName,
                                 @RequestParam("lastFamily") String lastFamily) {
        return employeeService.findEmployee(firstName, lastFamily);
    }

    @GetMapping
    public List<Employee> listEmployee() {
        return employeeService.listEmployee();
    }

}
