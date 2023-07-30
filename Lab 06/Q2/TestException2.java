package com.mycompany.testexception2;
public class TestException2 
{
    public static void main(String[] args)
    {
        int no1=10,no2=2,ans;
        int arr[]=new int[5];
        try
        {
            ans=no1/no2;
            System.out.println("Answer is"+ans);
            arr[5]=25;
            System.out.println("Last Element is"+ arr[5]);
        }   
        catch(ArithmeticException e)
        {
            System.out.println("Number divided by zero error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Error");
        }
    }
}
