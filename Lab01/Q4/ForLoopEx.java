package com.mycompany.forloopex;
public class ForLoopEx
{
    public static void main(String[] args) 
    {
    int[] numbers = {10, 20, 30, 40, 50};
    for (int x : numbers)
    {
       if (x == 30){ 
            break;
        } 
            System.out.println(x);
            System.out.println("\n");
    }
        System.out.println("I'm out of the Loop now");
    }
}


