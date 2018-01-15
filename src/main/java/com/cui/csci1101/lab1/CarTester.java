package com.cui.csci1101.lab1;

//CarTester.java
import java.util.Scanner;
public class CarTester
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the capacity (in liters): ");//Using Scanner to input the value
      double c = keyboard.nextDouble();
      System.out.print("Enter the fuel consumption rate (in lt/km): ");
      double f = keyboard.nextDouble();
      System.out.print("Enter the amount of gas to fill: ");
      double g = keyboard.nextDouble();
      System.out.print("Enter the distance to drive: ");
      double d = keyboard.nextDouble();
      Car Car1 = new Car(c,f);
      Car1.fill(g);//executing the fill method.
      Car1.drive(d); 
   }
} 
   