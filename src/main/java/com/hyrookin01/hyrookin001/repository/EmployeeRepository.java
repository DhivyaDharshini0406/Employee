package com.hyrookin01.hyrookin001.repository;


public class EmployeeRepository {

   
    private int employeeid; 
    private String employeename;
    private String employeeaddress;
    private int mobile;

    public EmployeeRepository(int employeeid, String employeename, String employeeaddress, int mobile) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeeaddress = employeeaddress;
        this.mobile = mobile;
    }

    public EmployeeRepository() {
    }

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
        return "EmployeeRepository [employeeid=" + employeeid + ", employeename=" + employeename + ", employeeaddress="
                + employeeaddress + ", mobile=" + mobile + "]";
    } 
     
    
}
