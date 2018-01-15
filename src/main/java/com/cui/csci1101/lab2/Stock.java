package com.cui.csci1101.lab2;

//Stock.java
public class Stock
{
   //instance variables
   private String symbol;
   private double price;
   private int share;
   //constructor
   public Stock(String symbol, double price, int share)
   {
      this.symbol = symbol;
      this.price = price;
      this.share = share;
   }   
   public void setSymbol(String symbol)//create a setSymbol method to store the symbol 
   {
      this.symbol = symbol;
   }
   public void setPrice(double price)
   {
      this.price = price;
   }
   public void setShare(int share)
   {
      this.share = share;
   }
   public String getSymbol()
   {
      return symbol;//return the value
   }
   public double getPrice()
   {
      return price;
   }   
   public int getShare()
   {
      return share;
   } 
   public String toString(Stock s)
   {
      return "I have the following stocks:\nStock: " + symbol + "\nPrice: " + price + "\nShares: " + share + "\n\n\nStock: " + s.getSymbol() + "\nPrice: " + s.getPrice() + "\nShares: " + s.getShare();
   }
   public int compareTo(Stock s)
   {
      double total1 = this.price * this.share;
      double total2 = s.getPrice() * s.getShare();
      if(total1 > total2)
      {
         return 1;
      } 
      else if(total1 < total2)
      {
         return -1;
      } 
      else
      {
         return 0;
      }  
   }
}         