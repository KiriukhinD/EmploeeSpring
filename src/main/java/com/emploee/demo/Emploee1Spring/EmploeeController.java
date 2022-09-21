package com.emploee.demo.Emploee1Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emploee")

public class EmploeeController {
    private final EmployeeService employeeService;

    public EmploeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path = "/add")
    public String addEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastFamily) {
        return "hello";
    }

    @GetMapping(path = "/remove")
    public String removeEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastFamily) {
        return "hello";
    }

    @GetMapping(path = "/find")
    public String findEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastFamily) {
        return "hello";
    }

}
