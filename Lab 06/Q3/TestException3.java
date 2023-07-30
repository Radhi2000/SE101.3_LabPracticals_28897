package com.mycompany.testexception3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TestException3 
{
    public static void main(String[] args)
    {
        Scanner sc=new  Scanner(System.in);
        String filePath=sc.nextLine();
    try
    {
    File file=new File(filePath);
    Scanner fileScanner=new Scanner(file);
    while(fileScanner.hasNextLine())
      {
        String line=fileScanner.nextLine();
        System.out.println("line");
      }
    }
    catch(FileNotFoundException e)
      {
         System.out.println("Error:File NotFound.Please confirm that the file exists and that the location is valid.");
      }
    }
}
