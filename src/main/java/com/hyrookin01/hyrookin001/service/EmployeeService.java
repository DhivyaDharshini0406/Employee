package com.hyrookin01.hyrookin001.service;


import java.util.List;

import com.hyrookin01.hyrookin001.repository.EmployeeSaveRepository;
import com.hyrookin01.hyrookin001.repository.EmployeeUpdateRepository;

public interface EmployeeService {
  String addemployee(EmployeeSaveRepository employeeSaveRepository);

List<org.echocat.jomon.demo.repository.EmployeeRepository> getAllEmployee();

String updateemployee(EmployeeUpdateRepository employeeUpdateRepository);

boolean deleteemployee(int id);


    
} 
    

