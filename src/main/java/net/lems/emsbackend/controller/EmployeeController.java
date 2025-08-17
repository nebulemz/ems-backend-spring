package net.lems.emsbackend.controller;

import lombok.AllArgsConstructor;
import net.lems.emsbackend.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

//Build Add Employee REST API


}
