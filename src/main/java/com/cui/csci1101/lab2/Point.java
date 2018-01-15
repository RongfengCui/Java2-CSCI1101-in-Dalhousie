package com.cui.csci1101.lab2;

//Point.class
public class Point
{
   //instance variables
   private int x;
   private int y;
   //constructor
   public Point(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   public void setX(int x)//create a setX method to store the value of x 
   {
      this.x = x;
   }
   public void setY(double price)
   {
      this.y = y;
   }
   public double getX()
   {
      return x;
   }   
   public int getY()
   {
      return y;
   } 
   public boolean equals(Point s)
   {
      if(this.y == s.getY())
         return true;
      else
         return false;
   }
   public boolean isHigher(Point s)
   {
      if(this.y < s.getY())
         return true;
      else
         return false;
   }
   public double findDistance(Point s)
   {
      double total = Math.sqrt((Math.pow((s.getX() - this.x), 2) + Math.pow((s.getY() - this.y), 2)));
      return total;
   }
}      