package com.mycompany.namedegree;
import java.util.Scanner;
public class NameDegree
{

     public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your degree program: ");
        String degreeProgram = scanner.nextLine();

        System.out.println(name);
        System.out.println(degreeProgram);
    }
}

