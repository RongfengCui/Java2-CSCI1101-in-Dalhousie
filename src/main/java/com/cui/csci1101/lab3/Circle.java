package com.cui.csci1101.lab3;

public class Circle
{
   //instance variables
   private double cx;
   private double cy;
   private double radius;
   //constructor
   public Circle(double cx, double cy, double radius)
   {
      this.cx=cx;
      this.cy=cy;
      this.radius=radius;
   }
   //get and set methods
   public void setCX(double cx)
   {
      this.cx=cx;
   }
   public void setCY(double cy)
   {
      this.cy=cy;
   }
   public void setRadius(double radius)
   {
      this.radius=radius;
   }
   public double getCX()
   {
      return cx;
   }
   public double getCY()
   {
      return cy;
   }
   public double getRadius()
   {
      return radius;
   }
   public String toString()
   {
      return "Circle with enter "+cx+" , "+cy+" and radius"+radius;
   }

   public boolean externally(Circle a)
   {
      double h = Math.pow((a.getCX() - this.cx),2);
      double j = Math.pow((a.getCY() - this.cy),2);
      if(Math.sqrt(h + j) == this.radius + a.getRadius())//if the distance of two points are equal to the sum of two radius, return true.
      {
         return true;
      }   
      else
      {
         return false;
      }   
   }         
   public boolean internally(Circle a)
   {
      double c = Math.pow((a.getCX() - this.cx),2);
      double d = Math.pow((a.getCY() - this.cy),2);
      if(Math.sqrt(c + d) == Math.sqrt(Math.pow((this.radius - a.getRadius()),2)))
      {
         return true;
      }   
      else
      {
         return false;
      }   
   }
}         