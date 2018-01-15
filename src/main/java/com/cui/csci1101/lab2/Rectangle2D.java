package com.cui.csci1101.lab2;

//Rectangle2D.java
public class Rectangle2D
{
   //instance variables
   private double xpos;
   private double ypos;
   private double width;
   private double height;
   //no-arg constructor
   public Rectangle2D()
   {
      xpos = 0.0;
      ypos = 0.0;
      width = 0.0;
      height = 0.0;
   }
   //constructor  
   public Rectangle2D(double xpos, double ypos, double width, double height)
   {
      this.xpos = xpos;
      this.ypos = ypos;
      this.width = width;
      this.height = height;
   }
   public void setXpos(double xpos)//create a setXpos method to store the value of xpos
   {
      this.xpos = xpos;
   }
   public void setYpos(double ypos)
   {
      this.ypos = ypos;
   }
   public void setWidth(double width)
   {
      this.width = width;
   }
   public void setHeight(double height)
   {
      this.height = height;
   }
   public double getXpos()
   {
      return xpos;//return the value
   }
   public double getYpos()
   {
      return ypos;
   }   
   public double getHeight()
   {
      return height;
   }
   public double getWidth()
   {
      return width;
   }   
   public double getArea()
   {
      return height * width;
   }
   public double getPerimeter()
   {
      return 2 * (height + width);
   }
   public boolean contains(double x, double y)//create a boolean to return true or false to depend whether containing or not
   {
      if(x > (this.xpos + this.width) || y > (this.ypos + this.height) || (x < this.xpos && y < this.ypos))
      {
         return false;
      }
      else
      {
         return true;
      }
   }
   public boolean contains(Rectangle2D r)
   {
      if((r.getXpos() >= this.xpos && r.getYpos() >= this.ypos) && ((r.getXpos() + r.getWidth()) <= (this.xpos + this.width) && (r.getYpos() + r.getHeight()) <= (this.ypos) + (this.height)))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}            