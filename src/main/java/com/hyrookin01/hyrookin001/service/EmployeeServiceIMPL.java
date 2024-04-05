package com.hyrookin01.hyrookin001.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyrookin01.hyrookin001.entity.Employee;
import com.hyrookin01.hyrookin001.repo.EmployeeRepo;
import com.hyrookin01.hyrookin001.repository.EmployeeRepository;
import com.hyrookin01.hyrookin001.repository.EmployeeSaveRepository;
import com.hyrookin01.hyrookin001.repository.EmployeeUpdateRepository;
@Service
public class EmployeeServiceIMPL implements EmployeeService{
     
    
    @Autowired
     private EmployeeRepo employeeRepo;



    @Override
    public String addemployee(EmployeeSaveRepository employeeSaveRepository) {
      
        Employee employee = new Employee(

               0, employeeSaveRepository.getEmployeename(),
               employeeSaveRepository.getEmployeeaddress(),
               employeeSaveRepository.getMobile()
         
        );   
        
              employeeRepo.save(employee);
              return employee.getEmployeename();
              
    }



    @Override
    public List<EmployeeRepository> getAllEmployee() {
    List<Employee>  getEmployees = employeeRepo.findAll();
    List<EmployeeRepository> employeeRepositoryList = new ArrayList<>();
    for(Employee a:getEmployees)
    {

        EmployeeRepository  employeeRepository = new EmployeeRepository(
            
        a.getEmployeeid(),
        a.getEmployeename(),
        a.getEmployeeaddress(),
        a.getMobile()
      );
    
    
      employeeRepositoryList.add(employeeRepository);
    
    }


        return employeeRepositoryList;


  }



    @Override
    public String updateemployee(EmployeeUpdateRepository employeeUpdateRepository) 
    {
       if(employeeRepo.existsById(employeeUpdateRepository.getEmployeeid()))
       {
         @SuppressWarnings("deprecation")
        Employee employee = employeeRepo.getById(employeeUpdateRepository.getEmployeeid());

         employee.setEmployeename(employeeUpdateRepository.getEmployeename());
         employee.setEmployeeaddress(employeeUpdateRepository.getEmployeeaddress()); 
         employee.setMobile(employeeUpdateRepository.getMobile());
         employeeRepo.save(employee);


         else
         {
            System.out.println("Employee Id do not Exist");
         }


               return null; 


       }
    }



    @Override
    public boolean deleteemployee(int id) {
        return false;
    
    }

}