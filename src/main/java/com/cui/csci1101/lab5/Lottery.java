package com.cui.csci1101.lab5;

public class Lottery
{
   private int[] lotteryNumbers;
   private int[] userArray;
   private int match;
   public Lottery()
   {
      lotteryNumbers = new int[5];//create an array and size is 5
      for(int i=0; i<5; i++)
      {
         lotteryNumbers[i] = (int)(Math.random()*9+1);
      }
   } 
   public void userLottery(int a, int b, int c, int d, int e)
   {
      userArray = new int[5];
      userArray[0] = a;// add numbers to the userArray 
      userArray[1] = b;
      userArray[2] = c;
      userArray[3] = d;
      userArray[4] = e;
   }  
   public int compare()
   {
      int num = 0;
      for(int i=0; i<5; i++)
      {
         if(lotteryNumbers[i] == userArray[i])//compare two arrays 
            num++;//add one in total
      }
      return num;
   }
   public void printPrize()
   {
      System.out.print("\nlotteryNumbers array:\n\t\t\t\t\t");
      for(int i=0; i<5; i++)
      {
         System.out.print(lotteryNumbers[i] + "\t\t");
      }
      System.out.print("\nuser array:\n\t\t\t\t\t");  
      for(int i=0; i<5; i++)
      {
         System.out.print(userArray[i] + "\t\t");
      }
      if(compare() == 0)//if num = 0
         System.out.println("\n\n\t\t\t\t\tSorry, nothing for you");
      else if(compare() == 1)
         System.out.println("\n\n\t\t\t\t\tCongratulations! $2 prize for you");
      else if(compare() == 2)
         System.out.println("\n\n\t\t\t\t\tCongratulations! $10 prize for you");
      else if(compare() == 3)
         System.out.println("\n\n\t\t\t\t\tCongratulations! $1000 prize for you");
      else if(compare() == 4)
         System.out.println("\n\n\t\t\t\t\tCongratulations! $50,000 prize for you"); 
      else
         System.out.println("\n\n\t\t\t\t\tCongratulations! You got Grand Prize! $1 million prize for you"); 
   }
}        
      
