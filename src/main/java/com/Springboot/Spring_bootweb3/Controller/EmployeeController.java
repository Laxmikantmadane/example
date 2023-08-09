package com.Springboot.Spring_bootweb3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.Spring_bootweb3.Service.EmployeeService;
import com.Springboot.Spring_bootweb3.entities.Employee;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String getAllEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "employee-list"; // JSP view page name
    }
//    @GetMapping("/employee/{id}")
//    public String getEmployeeById(@PathVariable Long id, Model model) {
//        Employee employee = employeeService.getEmployeeById(id);
//        model.addAttribute("employee", employee);
//        return "employee-details"; // JSP view page name
//    }

    // Add other methods for creating, updating, and deleting employees.
}
