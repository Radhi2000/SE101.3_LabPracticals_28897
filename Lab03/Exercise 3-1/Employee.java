package com.mycompany.testemp;
public class Employee
{
    private String Name;
    private int Age;
    private double Salary;
    public Employee(String Name,int Age,double Salary)
    {
        this.Name=Name;
        this.Age=Age;
        this.Salary=Salary;
    }
    public String getName()
    {
        return Name;
    }
    public int getAge()
    {
        return Age;
    }
    public double getSalary()
    {
        return Salary;
    }
}
