package com.cui.csci1101.lab4;

public class Wallet
{
   private Coin[] c;//create an array from Coin class
   private int capacity;//instance variable
   private int num;
   private int totalValue;
   public Wallet(int capacity)
   {
      this.capacity = capacity;
      num = 0;
      totalValue = 0;
      this.c = new Coin[capacity];
   }   
   public void addCoin(Coin a)
   {
      if(num == capacity)//if num equal to capacity, then it out of capacity
      {
         System.out.println("Cannot add anymore coins.");
      }
      else
      {
         c[num] = a;
         totalValue = totalValue + a.getValue();
         num++;
      }
   }
   public Coin removeCoin() 
   {
      if(num < 0) 
      {
         System.out.println("Cannot remove anymore coins.");
         return null;
      }
      else
      {
         Coin c1 = c[num - 1];//make the array equal to c1
         totalValue = totalValue - c1.getValue();
         c[num - 1] = null;
         num--;
         return c1;
      }
   }
   public String toString2()
   {
      return "we have " + num + " coins now, and total value is " + totalValue;
   }      
}   
         
                  
            