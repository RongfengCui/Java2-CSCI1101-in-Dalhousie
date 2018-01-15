package com.cui.csci1101.lab2;

import java.util.Scanner;
public class StockDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String sym1, sym2;
      double prc1, prc2;
      int sh1, sh2;
      //get the values for two stocks
      System.out.print("Enter the symbols for the two stocks: ");
      sym1 = keyboard.next();
      sym2 = keyboard.next();
      System.out.print("Enter their prices: ");
      prc1 = keyboard.nextDouble();
      prc2 = keyboard.nextDouble();
      System.out.print("Enter the number of shares for the two stocks: ");
      sh1 = keyboard.nextInt();
      sh2 = keyboard.nextInt();
      //create the first Stock
      Stock s1 = new Stock(sym1,prc1,sh1);
      //create the second Stock
      Stock s2 = new Stock(sym2,prc2,sh2);
      // continue the rest of the code here
      System.out.println(s1.toString(s2));
      if(s1.compareTo(s2) == 1)
      {
         System.out.println("The value of " + sym1 + " is higher than " + sym2 + "\nThe total value of my portfolio is: $ " + (prc1 * sh1 + prc2 * sh2));
      }
      else if(s1.compareTo(s2) == -1)
      {
         System.out.println("The value of " + sym1 + " is lower than " + sym2 + "\nThe total value of my portfolio is: $ " + (prc1 * sh1 + prc2 * sh2));
      }
      else
      {
         System.out.println("The value of " + sym1 + " is equal to " + sym2 + "\nThe total value of my portfolio is: $ " + (prc1 * sh1 + prc2 * sh2));
      }
   }
}