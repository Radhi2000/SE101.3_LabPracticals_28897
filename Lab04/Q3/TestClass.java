package com.mycompany.testclass;
public class TestClass 
{
    public static void main(String[] args) 
    {
        Student student=new Student("Anne Watson", 1002, "Data Science");
        System.out.println("Student Name: "+student.getName());
        System.out.println("Student ID: "+student.getID());
        System.out.println("Student Course: "+student.getCourse());
        System.out.println("");
        Lecturer lecturer=new Lecturer("Tom Daniel",5440,"Computer Architecture");
        System.out.println("Lecturer Name: "+lecturer.getName());
        System.out.println("Lecturer ID: "+lecturer.getID());
        System.out.println("Lecturer Programme: "+lecturer.getProgramme());
    }
}

