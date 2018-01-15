package com.cui.csci1101.lab3;

import java.util.Scanner;
public class TurnTaker2
{
   private static int turn = 0;
   private String name;
   public TurnTaker2(String n)
   {
      name = n;
   }
   public String getName()
   {
      return name;
   }
   public static int getTurn()
   {
      turn++;
      return turn;
   }
   public String toString(TurnTaker2 person2)
   {
      if (turn % 2 == 0)//if turn is even, return person2 name;
         return "Love from " + person2.getName();
      else
         return "Love from " + this.getName();
   }
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("How many turns? ");
      int num = input.nextInt();
      TurnTaker2 person1 = new TurnTaker2("Romeo");
      TurnTaker2 person2 = new TurnTaker2("Juliet");
      for(int i = 1; i<= num; i++)
      {
         if(TurnTaker2.getTurn() != num)
         {
            System.out.println("Turn = " + turn);
            System.out.println(person1.toString(person2));     
         }  
         else//if turn is the last number, return both name
         {
             System.out.println("Turn = " + num);
             System.out.println("Love from " + person1.getName() + "\nLove from " + person2.getName());
         }
      }
   }
}