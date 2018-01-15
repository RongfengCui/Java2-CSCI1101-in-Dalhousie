package com.cui.csci1101.lab1;

//RectangleDemo.java
import java.util.Scanner;
public class RectangleDemo
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter width and height of the rectangle: ");//user will type the value of width and height
      int a = input.nextInt();
      int b = input.nextInt();
      Rectangle rectangle1 = new Rectangle(a,b);
      System.out.println("\n" + rectangle1.toString());
      System.out.println("Area: " + rectangle1.findArea() + " square units");//using findArea() method to get the area
      System.out.println("Perimeter: " + rectangle1.findPerimeter() +" units");
   }    
}   