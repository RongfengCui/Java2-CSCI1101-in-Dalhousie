package com.cui.csci1101.lab1;

//BMIDemo.java
import java.util.Scanner;
public class BMIDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the name: ");//using Scanner to imput the name
      String n = keyboard.nextLine();
      System.out.print("Enter the age: ");
      int a = keyboard.nextInt();
      System.out.print("Enter the weight (in pounds): ");
      double w = keyboard.nextDouble();
      System.out.print("Enter the height (in inches): ");
      double h = keyboard.nextDouble();
      Person BMI = new Person(n,a,w,h);
      System.out.println("\n" + BMI.toString1());//using toString method to get the content.
      System.out.println(BMI.toString2());
   }
}   