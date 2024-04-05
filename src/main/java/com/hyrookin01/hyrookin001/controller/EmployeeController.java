package com.hyrookin01.hyrookin001.controller;

import org.echocat.jomon.demo.repository.EmployeeRepository;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyrookin01.hyrookin001.repository.EmployeeSaveRepository;
import com.hyrookin01.hyrookin001.repository.EmployeeUpdateRepository;
import com.hyrookin01.hyrookin001.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {



    @Autowired
    private EmployeeService employeeService;
    

    @PostMapping(path="/save")
    public String saveemployee(@RequestBody EmployeeSaveRepository employeeSaveRepository)

    {
        String id = employeeService.addemployee(employeeSaveRepository);
        return id;
    }

    @GetMapping(path="/getAllEmployee")
    public List<EmployeeRepository> getAllEmployee()
    {
        List<EmployeeRepository>allEmployee = employeeService.getAllEmployee();
        return allEmployee;
    }
    
    @PostMapping(path="/update")
    public String updateemployee(@RequestBody EmployeeUpdateRepository employeeUpdateRepository)

    {
        String id = employeeService.updateemployee(employeeUpdateRepository);
        return id;
    }


    @DeleteMapping(path="/deleteemployee/{id}")
    public String deleteemployee(@PathVariable(value = "id")int id)
    {
        @SuppressWarnings("unused")
        boolean deleteemployee = employeeService.deleteemployee(id);
        return "delete";
    }




}

