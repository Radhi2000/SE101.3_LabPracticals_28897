package com.mycompany.testemp;
public class TestEmp 
{
    public static void main(String[] args)
    {
        Employee emp=new Employee("Anne",28,70000.0);
        System.out.println("Employee Name: "+emp.getName());
        System.out.println("Employee Age: "+emp.getAge());
        System.out.println("Employee Salary: "+emp.getSalary());
    }
}
