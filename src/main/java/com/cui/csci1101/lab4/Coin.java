package com.cui.csci1101.lab4;

public class Coin
{
   private String name; //instance variable
   private int value;
   public Coin(String n, int v)
   {
      name = n;
      value  = v;
   }
   public String getName()//get method
   {
      return name;
   }
   public int getValue()
   {
      return value;
   }
   public String toString()//return name and value
   {
      return "name is " + this.name + " and the value is " + this.value;
   }
}       
