package com.mycompany.testemployee2;
public class Employee2 
{
    private String Name;
    private double Bsal;
    private double Bns;
    public Employee2(String Name,double Bsal,double Bns)
    {
        this.Name=Name;
        this.Bsal=Bsal;
        this.Bns=Bns;
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
     public double getBsal()
    {
        return Bsal;
    }
    public void setBsal(double Bsal)
    {
        this.Bsal=Bsal;
    }
     public double getBns()
    {
        return Bns;
    }
    public void setBns(double Bns)
    {
        this.Bns=Bns;
    }
    public double calcBnsAmount()
    {
        return Bsal+Bns;
    }
}
