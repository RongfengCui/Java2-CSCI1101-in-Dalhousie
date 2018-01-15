package com.cui.csci1101.lab3;

//CircleDemo.java
import java.util.Scanner;
public class CircleDemo
{
   public static void main(String[]args)
   {
      Scanner kb=new Scanner(System.in); 
      System.out.print("Enter the center coordinates (x,y) of the first circle and its radius: ");
      double a = kb.nextDouble();
      double b = kb.nextDouble();
      double c = kb.nextDouble();
      Circle c1=new Circle(a, b, c);//creat a circle called c1
      System.out.print("Enter the center coordinates (x,y) of the second circle and its radius: ");
      double d = kb.nextDouble();
      double e = kb.nextDouble();
      double f = kb.nextDouble();
      Circle c2=new Circle(d, e, f);
      if(c1.externally(c2))// using if statement to get externally or not.
         System.out.println("Circle with center " + a + "," + b + " and radius " + c + " touches Circle with center " + d + "," + e + " and radius " + f + " externally");
      else
         System.out.println("Circle with center " + a + "," + b + " and radius " + c + " does not touch Circle with center " + d + "," + e + " and radius " + f + " externally");
      if(c1.internally(c2))
         System.out.println("Circle with center " + a + "," + b + " and radius " + c + " touches Circle with center " + d + "," + e + " and radius " + f + " internally");
      else
         System.out.println("Circle with center " + a + "," + b + " and radius " + c + " does not touch Circle with center " + d + "," + e + " and radius " + f + " internally");      
   }
}