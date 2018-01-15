package com.cui.csci1101.lab4;

//CoinDeno.java
public class CoinDemo
{
   public static void main(String[]args)
   {
      Coin c1 = new Coin("Toonie", 200);//create an object
      Coin c2 = new Coin("Loonie", 100);
      Coin c3 = new Coin("Quarter", 25);
      Coin c4 = new Coin("Dime", 10);
      Coin c5 = new Coin("Nickel", 5);
      Wallet w = new Wallet(5);//make the capacity to 5
      w.addCoin(c1);
      System.out.println("add a coin, " + c1);
      w.addCoin(c2);
      System.out.println("add a coin, " + c2);
      Coin cc = w.removeCoin();
      System.out.println("remove a coin, name is " + cc.getName() + " and that value is " + cc.getValue());
      w.addCoin(c3);
      System.out.println("add a coin, " + c3);
      w.addCoin(c4);
      System.out.println("add a coin, " + c4);
      w.addCoin(c5);
      System.out.println("add a coin, " + c5);
      System.out.println(w.toString2());
   }
}      
          