package com.cui.csci1101.lab3;

public class TurnTaker1
{
   private static int turn = 0;//create a string variable
   private String name;
   public TurnTaker1(String n)
   {
      name = n;
   }
   public String getName()//getMethod to return the value
   {
      return name;
   }
   public static int getTurn()
   {
      turn++;
      return turn;
   }
   public static void main(String[] args)
   {
      TurnTaker1 person1 = new TurnTaker1("Romeo");
      TurnTaker1 person2 = new TurnTaker1("Juliet");
      for(int i = 1; i<= 5; i++)
      {
         System.out.println("Turn = " + TurnTaker1.getTurn());
         System.out.println("Love from "+ person1.getName());
         System.out.println("Love from " + person2.getName());
      }
   }
}