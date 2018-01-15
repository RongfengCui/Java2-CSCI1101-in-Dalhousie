package com.cui.csci1101.lab4;

import java.util.Scanner;
public class StudentDemo
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      Student s2 = new Student();//create two objects
      Student s1 = new Student();      
      System.out.print("Enter the name of the first student: ");
      String n1 = kb.nextLine();     
      System.out.print("Enter the student number of the first student: ");
      int num1 = kb.nextInt();
      s1.reset(n1, num1);      
      System.out.print("Enter the name of the second student: ");
      String n2 = kb.next();        
      System.out.print("Enter the student number of the Second student: ");
      int num2 = kb.nextInt();
      s2.reset(n2, num2);      
      System.out.println(s1);
      System.out.println(s2);
      if(s1.hasSameName(s2))//same name method
         System.out.println(s1.getName() + " has same name with " + s2.getName());
      else
         System.out.println(s1.getName() + " has different name with " + s2.getName());
      if(s1.equals(s2))//equals method
         System.out.println(s1.getName() + " is the same student with " + s2.getName());
      else
         System.out.println(s1.getName() + " is not the same student with " + s2.getName());
  }
}  
         