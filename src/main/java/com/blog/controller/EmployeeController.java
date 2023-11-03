package com.blog.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // This import is incorrect
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.blog.binding.Employee;
import com.blog.service.EmpService;

@Controller // You should annotate the controller class with @Controller
public class EmployeeController {

    @Autowired
    private EmpService service;

    @GetMapping("/")
    public String loadForm(Model model) {
        model.addAttribute("employee", new Employee()); // Change "employee" to "employee"
        return "index";
    }

    @PostMapping("/submit")
    public String handleSubmitBtn(@Valid @ModelAttribute Employee employee, BindingResult result, Model model) {
        System.out.println(employee);
        if (result.hasErrors()) {
            return "index";
        }
        boolean savedEmployee = service.saveEmployee(employee);
        if (savedEmployee) {
            model.addAttribute("msg", "Employee data saved successfully");
        } else {
            model.addAttribute("msg", "Failed to save employee data");
        }
        return "index";
    }

    @GetMapping("/employees")
    public String getEmployees(Model model) {
        List<Employee> employees = service.getAllEmployees();
        model.addAttribute("Employees", employees);
        return "view_employee";
    }

}
