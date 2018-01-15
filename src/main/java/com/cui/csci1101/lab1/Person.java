package com.cui.csci1101.lab1;

//Person.java
public class Person
{
   private String name;
   private int age;
   private double weight;
   private double height;
   private double BMI1;
      public Person(String n ,int a, double w, double h)
   {
      name = n;
      age = a;
      weight = w;
      height = h;
      BMI1 = 703 * weight / (height * height);

   }   
   public void setName(String n)//create a setName method to store the name
   {
      name = n;
   }
   public void setAge(int a)
   {
      age = a;
   }
   public void setWeight(int w)//create a setWeight method to store the weight
   {
      weight = w;
   }
   public void setHeight(int h)
   {
      height = h;
   }
   public String getName()
   {
      return name;
   }
   public int getAge()
   {
      return age;
   }   
   public double getWeight()
   {
      return weight;
   }
   public double getHeight()
   {
      return height;
   }   
   public String toString1()
   {
      return "The BMI of " + name + " is " + BMI1;
   }   
   public String toString2()
   {
      if(BMI1 < 18.5)//using if statement to return different result.
         return "The BMI status is Underweight";
      else if(BMI1 >= 18.5 && BMI1 < 25.0)
         return "The BMI status is Normal";
      else if(BMI1 >= 25.0 && BMI1 < 30.0)
         return "The BMI status is Overweight";
      else
         return "The BMI status is Obese";
   }   
}   
   