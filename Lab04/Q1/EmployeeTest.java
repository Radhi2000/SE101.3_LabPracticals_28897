package com.mycompany.employeetest;
public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee mrBogdon=new Employee();
        Employee mrBird=new Employee();
        
        mrBogdon.setEmpID(1001);
        mrBogdon.setEmpName("Mr.Bogdon");
        mrBogdon.setEmpDesignation("Software Engineer");
        
        mrBird.setEmpID(1002);
        mrBird.setEmpName("Mr.Bird");
        mrBird.setEmpDesignation("Web Developer");
    
        System.out.println("Employee ID: "+mrBogdon.getEmpID());
        System.out.println("Employee Name: "+mrBogdon.getEmpName());
        System.out.println("Employee Designation: "+mrBogdon.getEmpDesignation());
        
        System.out.println("\nEmployee ID: "+mrBird.getEmpID());
        System.out.println("Employee Name: "+mrBird.getEmpName());
        System.out.println("Employee Designation: "+mrBird.getEmpDesignation());
    }        
}

