package com.cui.csci1101.lab4;

import java.util.Scanner;
public class RoomCarpetDemo
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the dimension of the first room: ");
      double d1 = kb.nextDouble();
      double d2 = kb.nextDouble();
      RoomDimension rd1 = new RoomDimension(d1,d2);
      System.out.print("Enter the cost per square foot of carpet: ");
      double cost1 = kb.nextDouble();
      RoomCarpet rc1 = new RoomCarpet(rd1, cost1);//create an object
      System.out.print("Enter the dimension of the second room: ");
      double d3 = kb.nextDouble();
      double d4 = kb.nextDouble();
      RoomDimension rd2 = new RoomDimension(d3, d4);
      System.out.print("Enter the cost per square foot of carpet: ");
      double cost2 = kb.nextDouble();
      RoomCarpet rc2 = new RoomCarpet(rd2, cost2);
      System.out.println(rc1);
      if(rc1.costsMore(rc2))//calling from the boolean method
      {
         System.out.println("costs more than");
         System.out.println(rc2);
      }
      else
         if(rc1.getTotalCost() == rc2.getTotalCost())
         {
            System.out.println(rc2);
            System.out.println("costs the same");
         }   
         else 
         {
            System.out.println("costs less than"); 
            System.out.println(rc2); 
         }     
   }
}       