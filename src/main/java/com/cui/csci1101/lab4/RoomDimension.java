package com.cui.csci1101.lab4;

public class RoomDimension
{
   private double length;//instance variable
   private double width;
   public RoomDimension(double l, double w)
   {
      length = l;
      width  = w;
   }
   public double getWidth()//get method
   {
      return width;
   }
   public double getLength()
   {
      return length;
   }
   public String toString()// return the length and width
   {
      return "Room with Length: " + this.length + " and Width: " + this.width;
   }
}      