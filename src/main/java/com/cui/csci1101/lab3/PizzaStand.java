package com.cui.csci1101.lab3;

public class PizzaStand
{
   private static double cost;
   private static int totalSold;// create a static object for totalSold, that can calculate the number of pizzas that sold together.
   private int id;
   private int numSold;
   public PizzaStand(int n)
   {
      id = n;
      numSold = 0;
   }
   public void justSold()
   {
      numSold++;
      totalSold++;
   }   
   public int getSold()//return the number of pizza that sold
   {
      return numSold;
   } 
   public static void cost(double cost1)
   {
      cost = cost1;
   }       
   public static int getTotalSold()
   {
      return totalSold;
   }
   public static double getTotalCost()
   {
      return totalSold * cost;
   }
   public int getId()
   {
      return id;
   }
}   
      
    