package com.cui.csci1101.lab5;

import java.util.Scanner;
public class LotteryDemo
{
   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Please enter the five numbers of your lottery: ");//let user enter five numbers
      int n1 = kb.nextInt();
      int n2 = kb.nextInt();
      int n3 = kb.nextInt();
      int n4 = kb.nextInt(); 
      int n5 = kb.nextInt();
      Lottery l = new Lottery();
      l.userLottery(n1, n2, n3, n4, n5);// add these five numbers to array
      l.compare();// compare two arrays
      l.printPrize();//print the result
   }
}      
      
          
      