package com.cui.csci1101.lab1;

//Car.java
public class Car
{
   private double capacity;
   private double gas;
   private double fuel;
   public Car(double c, double f)//creating a constructor
   {
      capacity = c;
      fuel = f;
      gas = 0;
   }   
   public void setCapacity(double c)//Creating a set method
   {
      capacity = c;
   }
   public void setFuel(double f)
   {
      fuel = f;
   }
   public void setGas()
   {
      gas = 0;
   }   
   public double getCapacity()
   {
      return capacity;
   }
   public double getFuel()
   {
      return fuel;
   }   
   public double getGas()
   {
      return gas;
   }  
   public void fill(double g)
   {
      gas = g;
      if(gas > capacity)//using if statement to distinguish different situation.
      {
         System.out.println("Cannot fill. Exceeds capacity");
      }   
      else 
      {
      }
   }
   public void drive(double d)
   {
      double distance = d;
      if(gas > capacity)  
      {
         System.out.println("Cannot drive. Not enough gas\n\nGas remaining in tank: 0.0");
      }   
      else 
      {
         if(gas / fuel >= distance)
         {
            System.out.println("\nGas remaining in tank: " + (gas / fuel - distance) * fuel);//getting the rest of gas in tank
         }
         else
         {
             System.out.println("Cannot drive. Not enough gas\n\n" + "Gas remaining in tank: "  + gas);
         }   
      }
   }
} 