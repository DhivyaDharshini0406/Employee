package com.hyrookin01.hyrookin001.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    
    @Id
    @Column(name = "employee_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid; 

    @Column(name = "employee_name", length = 50)   
    private String employeename;

    @Column(name = "employee_address", length = 60)
    private String employeeaddress;

    @Column(name = "mobile", length = 12)
    private int mobile;

    // No-argument constructor
    public Employee() {
        // This constructor is required by JPA / Hibernate
    }

    // All-arguments constructor
    public Employee(int employeeid, String employeename, String employeeaddress, int mobile) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeeaddress = employeeaddress;
        this.mobile = mobile;
    }

    // Getters and setters
    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeeaddress() {
        return employeeaddress;
    }

    public void setEmployeeaddress(String employeeaddress) {
        this.employeeaddress = employeeaddress;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeeaddress="
                + employeeaddress + ", mobile=" + mobile + "]";
    }

    public void setEmployeename() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEmployeename'");
    }
}
