package com.mycompany.testexception;
import java.util.Scanner;
public class TestException 
{
    public static void main(String[] args) 
    {
        int n1,n2,ans;
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter First Number: ");
            n1=sc.nextInt();
            System.out.println("Enter Second Number: ");
            n2=sc.nextInt();
            ans=n1/n2;
            System.out.println("The Answer is "+ans);
        }
        catch(Exception e)
        {
            System.out.println("Number divided by zero error");
        }
    }
}
