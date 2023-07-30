package com.mycompany.testemployee2;
public class TestEmployee2 
{
    public static void main(String[] args)
    {
        Employee2 emp=new Employee2("Bogdon",50000,10000);
        System.out.println("Employee Name: "+emp.getName());
        System.out.println("BasicSalary: "+emp.getBsal());
        System.out.println("Bonus: "+emp.getBns());
        System.out.println("Bonus Amount: "+emp.calcBnsAmount());
    }
}
